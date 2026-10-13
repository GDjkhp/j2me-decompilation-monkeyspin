package monkeyspin;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import javax.imageio.ImageIO;
import monkeyspin.platform.Host;
import monkeyspin.platform.ScreenCanvas;

/**
 * Boots the game without a display, presses some keys and writes screenshots,
 * failing if the screen never leaves a blank state.
 *
 * Usage: SmokeTest OUTPUT_DIR "script"   where script is e.g. "w4000 s a-5 w1500 s"
 *   wN = wait N ms, s = snapshot, aK = tap MIDP key code K
 */
public final class SmokeTest {
    public static void main(String[] args) throws Exception {
        File out = new File(args[0]);
        out.mkdirs();
        if (Boolean.getBoolean("dumpthreads")) {
            Thread d = new Thread(() -> {
                try { Thread.sleep(8000); } catch (InterruptedException e) { return; }
                for (java.util.Map.Entry<Thread, StackTraceElement[]> e : Thread.getAllStackTraces().entrySet()) {
                    if (!e.getKey().getName().equals("game-loop")) continue;
                    System.out.println("== " + e.getKey().getName());
                    for (StackTraceElement el : e.getValue()) System.out.println("   " + el);
                }
            });
            d.setDaemon(true);
            d.start();
        }
        if (!Boolean.getBoolean("smoke.skipstart")) {
            new MonkeySpin().startApp();
        }
        int shot = 0;
        int distinctMax = 0;
        for (String step : args[1].trim().split("\\s+")) {
            char c = step.charAt(0);
            String rest = step.substring(1);
            if (c == 'w') {
                Thread.sleep(Long.parseLong(rest));
            } else if (c == 't') {
                Thread.sleep(60);
            } else if (c == 's') {
                ScreenCanvas sc = Host.current();
                BufferedImage img = sc.snapshot();
                Set<Integer> colors = new HashSet<>();
                for (int y = 0; y < img.getHeight(); y++) {
                    for (int x = 0; x < img.getWidth(); x++) {
                        colors.add(img.getRGB(x, y));
                    }
                }
                distinctMax = Math.max(distinctMax, colors.size());
                File f = new File(out, String.format("shot%02d.png", shot++));
                ImageIO.write(img, "png", f);
                System.out.println("snapshot " + f.getName() + " colors=" + colors.size());
            } else if (c == 'a') {
                int code = Integer.parseInt(rest);
                Host.injectKey(code, true);
                Thread.sleep(60);
                Host.injectKey(code, false);
                Thread.sleep(60);
            }
        }
        System.out.println("distinctMax=" + distinctMax);
        System.exit(distinctMax > 8 ? 0 : 2);
    }
}
