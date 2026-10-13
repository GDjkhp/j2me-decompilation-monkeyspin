package monkeyspin.platform;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * A fixed-size off-screen game screen with an input callback interface.
 * Java SE replacement for the Nokia {@code FullCanvas}: the {@link Host} window scales the
 * published frame to whatever size the user gives the window, so game code can keep
 * working in 320x240 device pixels.
 */
public abstract class ScreenCanvas {
    /** Logical screen size (Nokia E61/E71 landscape QVGA). */
    public static final int WIDTH = Integer.getInteger("monkeyspin.width", 320);
    public static final int HEIGHT = Integer.getInteger("monkeyspin.height", 240);

    // MIDP key codes used by the game logic (Nokia assignments).
    public static final int KEY_UP = -1;
    public static final int KEY_DOWN = -2;
    public static final int KEY_LEFT = -3;
    public static final int KEY_RIGHT = -4;
    public static final int KEY_FIRE = -5;
    public static final int KEY_SOFT_LEFT = -6;
    public static final int KEY_SOFT_RIGHT = -7;

    // MIDP game actions.
    public static final int ACTION_UP = 1;
    public static final int ACTION_LEFT = 2;
    public static final int ACTION_RIGHT = 5;
    public static final int ACTION_DOWN = 6;
    public static final int ACTION_FIRE = 8;

    private final BufferedImage back = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private final int[] backPixels = ((DataBufferInt) back.getRaster().getDataBuffer()).getData();
    private final BufferedImage front = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private final int[] frontPixels = ((DataBufferInt) front.getRaster().getDataBuffer()).getData();
    private final Object frontLock = new Object();
    private final Gfx gfx = new Gfx(back);
    private boolean repaintRequested;

    public final int getWidth() {
        return WIDTH;
    }

    public final int getHeight() {
        return HEIGHT;
    }

    /** Renders the screen into {@code g}. Called only from {@link #serviceRepaints()}. */
    protected abstract void paint(Gfx g);

    protected void keyPressed(int keyCode) {
    }

    protected void keyReleased(int keyCode) {
    }

    protected void keyRepeated(int keyCode) {
    }

    protected void showNotify() {
    }

    protected void hideNotify() {
    }

    public final void repaint() {
        repaintRequested = true;
    }

    /** Renders any pending repaint synchronously and publishes it to the window. */
    public final void serviceRepaints() {
        if (!repaintRequested) {
            return;
        }
        repaintRequested = false;
        paint(gfx);
        synchronized (frontLock) {
            System.arraycopy(backPixels, 0, frontPixels, 0, backPixels.length);
        }
        Host.frameReady();
    }

    public int getGameAction(int keyCode) {
        switch (keyCode) {
            case KEY_UP:
                return ACTION_UP;
            case KEY_DOWN:
                return ACTION_DOWN;
            case KEY_LEFT:
                return ACTION_LEFT;
            case KEY_RIGHT:
                return ACTION_RIGHT;
            case KEY_FIRE:
                return ACTION_FIRE;
            default:
                return 0;
        }
    }

    /** Copies the most recently published frame into {@code dest} (thread-safe). */
    final void copyFrontTo(BufferedImage dest) {
        synchronized (frontLock) {
            int[] out = ((DataBufferInt) dest.getRaster().getDataBuffer()).getData();
            System.arraycopy(frontPixels, 0, out, 0, frontPixels.length);
        }
    }

    /** Returns a copy of the latest published frame, e.g. for screenshots and tests. */
    public final BufferedImage snapshot() {
        BufferedImage copy = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        copyFrontTo(copy);
        return copy;
    }

    // Dispatch entry points used by Host (Host lives in this package, so it can reach the protected hooks).
    final void dispatchKeyPressed(int code) {
        keyPressed(code);
    }

    final void dispatchKeyReleased(int code) {
        keyReleased(code);
    }

    final void dispatchKeyRepeated(int code) {
        keyRepeated(code);
    }

    final void dispatchShow() {
        showNotify();
    }

    final void dispatchHide() {
        hideNotify();
    }
}
