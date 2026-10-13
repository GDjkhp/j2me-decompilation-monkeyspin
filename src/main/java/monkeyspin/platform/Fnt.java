package monkeyspin.platform;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

/**
 * System font, used only as a fallback when the game has no bitmap font for a string.
 * Java SE replacement for the J2ME {@code Font}; the face/style/size constants match MIDP.
 */
public final class Fnt {
    public static final int STYLE_PLAIN = 0;
    public static final int STYLE_BOLD = 1;
    public static final int STYLE_ITALIC = 2;

    public static final int SIZE_MEDIUM = 0;
    public static final int SIZE_SMALL = 8;
    public static final int SIZE_LARGE = 16;

    public static final int FACE_SYSTEM = 0;
    public static final int FACE_MONOSPACE = 32;
    public static final int FACE_PROPORTIONAL = 64;

    private static final Map<Integer, Fnt> CACHE = new HashMap<>();
    private static Graphics2D metricsGraphics;

    private final Font font;
    private final FontMetrics metrics;

    private Fnt(Font font) {
        this.font = font;
        this.metrics = metricsGraphics().getFontMetrics(font);
    }

    private static synchronized Graphics2D metricsGraphics() {
        if (metricsGraphics == null) {
            BufferedImage scratch = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
            metricsGraphics = scratch.createGraphics();
            metricsGraphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
            metricsGraphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        }
        return metricsGraphics;
    }

    public static synchronized Fnt getFont(int face, int style, int size) {
        int key = face << 16 | style << 8 | size;
        Fnt cached = CACHE.get(key);
        if (cached == null) {
            String family = face == FACE_MONOSPACE ? Font.MONOSPACED : Font.SANS_SERIF;
            int awtStyle = ((style & STYLE_BOLD) != 0 ? Font.BOLD : 0) | ((style & STYLE_ITALIC) != 0 ? Font.ITALIC : 0);
            int px = size == SIZE_SMALL ? 11 : size == SIZE_LARGE ? 16 : 13;
            cached = new Fnt(new Font(family, awtStyle, px));
            CACHE.put(key, cached);
        }
        return cached;
    }

    public int getHeight() {
        return metrics.getHeight();
    }

    public int getBaselinePosition() {
        return metrics.getAscent();
    }

    public int getDescent() {
        return metrics.getDescent();
    }

    public int stringWidth(String s) {
        return metrics.stringWidth(s);
    }

    public int charWidth(char c) {
        return metrics.charWidth(c);
    }

    Font awt() {
        return font;
    }
}
