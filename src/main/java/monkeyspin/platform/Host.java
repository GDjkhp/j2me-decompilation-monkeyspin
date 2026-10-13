package monkeyspin.platform;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * Desktop host for the game: owns the Swing window, translates keyboard input into the
 * MIDP key codes the game logic expects, and runs the game's frame callback on a dedicated
 * thread. Replaces the J2ME application manager ({@code MIDlet}/{@code Display}).
 *
 * <p>Threading model: all game logic (frame steps, key callbacks, lifecycle callbacks) runs while
 * holding {@link #LOCK}, so it behaves as if single-threaded, like the original UI thread.
 * Without a display ({@link GraphicsEnvironment#isHeadless()}) no window is created but
 * everything else works, which is what the tests use.
 */
public final class Host {
    /** Serialises every call into game code. */
    static final Object LOCK = new Object();

    private static final int FRAME_MS = Integer.getInteger("monkeyspin.frameMs", 25);
    private static final int SCALE = Integer.getInteger("monkeyspin.scale", 2);

    private static final ExecutorService EVENTS = Executors.newSingleThreadExecutor(r -> {
        Thread t = new Thread(r, "window-events");
        t.setDaemon(true);
        return t;
    });

    private static final Object QUEUE_LOCK = new Object();
    private static Runnable pending;
    private static Thread loopThread;
    private static volatile boolean exiting;

    private static Lifecycle app;
    private static ScreenCanvas canvas;
    private static JFrame frame;
    private static JPanel panel;

    private static final Map<Integer, Integer> DOWN = new HashMap<>();
    private static final Map<Integer, Timer> PENDING_RELEASE = new HashMap<>();

    private Host() {
    }

    // ---- public API used by the ported game ----------------------------------------------------

    public static void register(Lifecycle lifecycle) {
        app = lifecycle;
    }

    /** The screen currently shown (null before the game has started). */
    public static ScreenCanvas current() {
        return canvas;
    }

    public static boolean isHeadless() {
        return GraphicsEnvironment.isHeadless();
    }

    /** Makes {@code c} the visible screen (opens the window on first use). */
    public static void setCurrent(ScreenCanvas c) {
        canvas = c;
        if (isHeadless() || frame != null) {
            return;
        }
        try {
            SwingUtilities.invokeAndWait(Host::createWindow);
        } catch (Exception e) {
            throw new IllegalStateException("Cannot open window", e);
        }
    }

    /** Runs {@code r} on the game thread as soon as possible (J2ME {@code callSerially}). */
    public static void schedule(Runnable r) {
        synchronized (QUEUE_LOCK) {
            pending = r;
            if (loopThread == null) {
                loopThread = new Thread(Host::gameLoop, "game-loop");
                loopThread.start();
            }
            QUEUE_LOCK.notifyAll();
        }
    }

    /** Terminates the application. */
    public static void exit() {
        exiting = true;
        synchronized (QUEUE_LOCK) {
            QUEUE_LOCK.notifyAll();
        }
        if (frame != null) {
            frame.dispose();
        }
        System.exit(0);
    }

    /** Opens a URL in the system browser. Returns false: the app never has to quit to do so. */
    public static boolean openUrl(String url) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                Desktop.getDesktop().browse(new URI(url));
            }
        } catch (Exception e) {
            // best effort
        }
        return false;
    }

    // ---- test hooks ---------------------------------------------------------------------------

    /** Injects a key press/release as if typed on the keyboard ({@code code} is a MIDP key code). */
    public static void injectKey(int code, boolean pressed) {
        synchronized (LOCK) {
            if (canvas == null) {
                return;
            }
            if (pressed) {
                canvas.dispatchKeyPressed(code);
            } else {
                canvas.dispatchKeyReleased(code);
            }
        }
    }

    // ---- frame loop ---------------------------------------------------------------------------

    static void frameReady() {
        JPanel p = panel;
        if (p != null) {
            p.repaint();
        }
    }

    private static void gameLoop() {
        while (!exiting) {
            Runnable r;
            synchronized (QUEUE_LOCK) {
                while (pending == null && !exiting) {
                    try {
                        QUEUE_LOCK.wait();
                    } catch (InterruptedException e) {
                        return;
                    }
                }
                r = pending;
                pending = null;
            }
            if (r == null) {
                continue;
            }
            long start = System.nanoTime();
            synchronized (LOCK) {
                try {
                    r.run();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
            long elapsedMs = (System.nanoTime() - start) / 1_000_000L;
            if (elapsedMs < FRAME_MS) {
                try {
                    Thread.sleep(FRAME_MS - elapsedMs);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    // ---- window -------------------------------------------------------------------------------

    private static void createWindow() {
        frame = new JFrame("Monkey Spin");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        try {
            frame.setIconImage(ImageIO.read(Host.class.getResourceAsStream("/i1.png")));
        } catch (Exception e) {
            // icon is optional
        }
        panel = new ScreenPanel();
        panel.setPreferredSize(new Dimension(ScreenCanvas.WIDTH * SCALE, ScreenCanvas.HEIGHT * SCALE));
        panel.setBackground(Color.BLACK);
        panel.setFocusable(true);
        panel.setFocusTraversalKeysEnabled(false);
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                onKeyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                onKeyReleased(e);
            }
        });
        frame.setContentPane(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Run off the EDT: the game may be mid-frame and we must wait for it to finish.
                new Thread(() -> {
                    synchronized (LOCK) {
                        try {
                            if (app != null) {
                                app.destroyApp(true);
                            }
                        } catch (Throwable t) {
                            t.printStackTrace();
                        }
                    }
                    exit();
                }, "shutdown").start();
            }

            @Override
            public void windowActivated(WindowEvent e) {
                withGame(() -> canvas.dispatchShow());
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                DOWN.clear();
                withGame(() -> canvas.dispatchHide());
            }
        });
        frame.setVisible(true);
        panel.requestFocusInWindow();
    }

    /** Delivers window/keyboard events to the game in the order they happened. */
    private static void withGame(Runnable r) {
        EVENTS.execute(() -> {
            synchronized (LOCK) {
                try {
                    r.run();
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        });
    }

    // ---- keyboard -----------------------------------------------------------------------------

    /**
     * Keyboard layout:
     * arrows = D-pad, Enter/Space = select, 0-9 * # = keypad, F1/Q = left soft key,
     * F2/W/Esc/Backspace = right soft key. Letters R T Y F G H V B N M map to keypad
     * 1-9,0 and J/U to #/* exactly like the QWERTY Nokia phones this build targeted.
     */
    static int mapKey(KeyEvent e) {
        int vk = e.getKeyCode();
        switch (vk) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_KP_UP:
                return ScreenCanvas.KEY_UP;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_KP_DOWN:
                return ScreenCanvas.KEY_DOWN;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_KP_LEFT:
                return ScreenCanvas.KEY_LEFT;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_KP_RIGHT:
                return ScreenCanvas.KEY_RIGHT;
            case KeyEvent.VK_ENTER:
            case KeyEvent.VK_SPACE:
                return ScreenCanvas.KEY_FIRE;
            case KeyEvent.VK_F1:
            case KeyEvent.VK_Q:
                return ScreenCanvas.KEY_SOFT_LEFT;
            case KeyEvent.VK_F2:
            case KeyEvent.VK_W:
            case KeyEvent.VK_ESCAPE:
            case KeyEvent.VK_BACK_SPACE:
                return ScreenCanvas.KEY_SOFT_RIGHT;
            case KeyEvent.VK_MULTIPLY:
                return '*';
            default:
                break;
        }
        char ch = e.getKeyChar();
        if (ch == '*' || ch == '#') {
            return ch;
        }
        if (vk >= KeyEvent.VK_0 && vk <= KeyEvent.VK_9) {
            return '0' + (vk - KeyEvent.VK_0);
        }
        if (vk >= KeyEvent.VK_NUMPAD0 && vk <= KeyEvent.VK_NUMPAD9) {
            return '0' + (vk - KeyEvent.VK_NUMPAD0);
        }
        if (vk >= KeyEvent.VK_A && vk <= KeyEvent.VK_Z) {
            return 'a' + (vk - KeyEvent.VK_A);
        }
        return 0;
    }

    private static void onKeyPressed(KeyEvent e) {
        int vk = e.getKeyCode();
        int code = mapKey(e);
        if (code == 0) {
            return;
        }
        // X11 reports auto-repeat as release+press pairs; swallow the release if a press follows at once.
        Timer release = PENDING_RELEASE.remove(vk);
        if (release != null) {
            release.stop();
        }
        Integer held = DOWN.get(vk);
        if (held != null) {
            fire(held, 2);
        } else {
            DOWN.put(vk, code);
            fire(code, 0);
        }
    }

    private static void onKeyReleased(KeyEvent e) {
        final int vk = e.getKeyCode();
        final Integer code = DOWN.get(vk);
        if (code == null) {
            return;
        }
        Timer t = new Timer(12, ev -> {
            PENDING_RELEASE.remove(vk);
            if (DOWN.remove(vk) != null) {
                fire(code, 1);
            }
        });
        t.setRepeats(false);
        PENDING_RELEASE.put(vk, t);
        t.start();
    }

    private static void fire(int code, int kind) {
        // Called on the EDT; hand over to a worker so the EDT never blocks behind a long frame.
        withGame(() -> {
            if (canvas == null) {
                return;
            }
            if (kind == 0) {
                canvas.dispatchKeyPressed(code);
            } else if (kind == 1) {
                canvas.dispatchKeyReleased(code);
            } else {
                canvas.dispatchKeyRepeated(code);
            }
        });
    }

    // ---- painting -----------------------------------------------------------------------------

    private static final class ScreenPanel extends JPanel {
        private final BufferedImage view = new BufferedImage(ScreenCanvas.WIDTH, ScreenCanvas.HEIGHT, BufferedImage.TYPE_INT_RGB);

        @Override
        protected void paintComponent(Graphics g0) {
            super.paintComponent(g0);
            ScreenCanvas c = canvas;
            if (c == null) {
                return;
            }
            c.copyFrontTo(view);
            Graphics2D g = (Graphics2D) g0;
            double s = Math.min(getWidth() / (double) ScreenCanvas.WIDTH, getHeight() / (double) ScreenCanvas.HEIGHT);
            int w = (int) Math.round(ScreenCanvas.WIDTH * s);
            int h = (int) Math.round(ScreenCanvas.HEIGHT * s);
            int x = (getWidth() - w) / 2;
            int y = (getHeight() - h) / 2;
            boolean integral = Math.abs(s - Math.rint(s)) < 1e-9;
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                    integral ? RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR : RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.drawImage(view, x, y, w, h, null);
        }
    }
}
