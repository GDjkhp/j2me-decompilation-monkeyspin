package monkeyspin.platform;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * 2D drawing surface with MIDP-style semantics (anchors, absolute clip rectangle,
 * 0xRRGGBB colours), implemented on top of {@link Graphics2D}.
 * Java SE replacement for the J2ME {@code Graphics} plus the Nokia {@code DirectGraphics} extras.
 */
public final class Gfx {
    public static final int HCENTER = 1;
    public static final int VCENTER = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int TOP = 16;
    public static final int BOTTOM = 32;
    public static final int BASELINE = 64;

    /** Flip flags accepted by {@link #drawImage(Img, int, int, int, int)} (same values as Nokia DirectGraphics). */
    public static final int FLIP_HORIZONTAL = 8192;
    public static final int FLIP_VERTICAL = 16384;

    private final Graphics2D g;
    private final int width;
    private final int height;
    private int clipX;
    private int clipY;
    private int clipW;
    private int clipH;
    private Fnt font = Fnt.getFont(Fnt.FACE_SYSTEM, Fnt.STYLE_PLAIN, Fnt.SIZE_MEDIUM);

    private BufferedImage rgbScratch;

    public Gfx(BufferedImage target) {
        this.g = target.createGraphics();
        this.width = target.getWidth();
        this.height = target.getHeight();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
        g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        g.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        g.setColor(Color.BLACK);
        setClip(0, 0, width, height);
    }

    // ---- state -------------------------------------------------------------------------------

    public void setColor(int rgb) {
        g.setColor(new Color(rgb & 0xFFFFFF));
    }

    public void setColor(int r, int g, int b) {
        setColor((r & 0xFF) << 16 | (g & 0xFF) << 8 | (b & 0xFF));
    }

    public int getColor() {
        return g.getColor().getRGB() & 0xFFFFFF;
    }

    public void setFont(Fnt f) {
        if (f != null) {
            font = f;
            g.setFont(f.awt());
        }
    }

    public void setClip(int x, int y, int w, int h) {
        // MIDP clips the requested rectangle against the drawing surface.
        int x1 = Math.max(x, 0);
        int y1 = Math.max(y, 0);
        int x2 = (int) Math.max(Math.min((long) x + w, width), x1);
        int y2 = (int) Math.max(Math.min((long) y + h, height), y1);
        clipX = x1;
        clipY = y1;
        clipW = x2 - x1;
        clipH = y2 - y1;
        g.setClip(clipX, clipY, clipW, clipH);
    }

    public int getClipX() {
        return clipX;
    }

    public int getClipY() {
        return clipY;
    }

    public int getClipWidth() {
        return clipW;
    }

    public int getClipHeight() {
        return clipH;
    }

    // ---- primitives --------------------------------------------------------------------------

    public void fillRect(int x, int y, int w, int h) {
        if (w > 0 && h > 0) {
            g.fillRect(x, y, w, h);
        }
    }

    public void drawRect(int x, int y, int w, int h) {
        if (w >= 0 && h >= 0) {
            g.drawRect(x, y, w, h);
        }
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        g.fillPolygon(new int[] {x1, x2, x3}, new int[] {y1, y2, y3}, 3);
    }

    // ---- text --------------------------------------------------------------------------------

    public void drawString(String s, int x, int y, int anchor) {
        if (s == null || s.isEmpty()) {
            return;
        }
        int w = font.stringWidth(s);
        if ((anchor & HCENTER) != 0) {
            x -= w >> 1;
        } else if ((anchor & RIGHT) != 0) {
            x -= w;
        }
        int baseline;
        if ((anchor & BASELINE) != 0) {
            baseline = y;
        } else if ((anchor & BOTTOM) != 0) {
            baseline = y - (font.getHeight() - font.getBaselinePosition());
        } else {
            baseline = y + font.getBaselinePosition();
        }
        g.drawString(s, x, baseline);
    }

    public void drawChar(char c, int x, int y, int anchor) {
        drawString(String.valueOf(c), x, y, anchor);
    }

    // ---- images ------------------------------------------------------------------------------

    public void drawImage(Img img, int x, int y, int anchor) {
        if (img == null) {
            return;
        }
        int w = img.getWidth();
        int h = img.getHeight();
        if ((anchor & HCENTER) != 0) {
            x -= w >> 1;
        } else if ((anchor & RIGHT) != 0) {
            x -= w;
        }
        if ((anchor & VCENTER) != 0) {
            y -= h >> 1;
        } else if ((anchor & BOTTOM) != 0) {
            y -= h;
        }
        g.drawImage(img.raw(), x, y, null);
    }

    /** Draws an image, optionally mirrored ({@link #FLIP_HORIZONTAL} / {@link #FLIP_VERTICAL}). */
    public void drawImage(Img img, int x, int y, int anchor, int flipFlags) {
        if (img == null) {
            return;
        }
        if ((flipFlags & (FLIP_HORIZONTAL | FLIP_VERTICAL)) == 0) {
            drawImage(img, x, y, anchor);
            return;
        }
        int w = img.getWidth();
        int h = img.getHeight();
        if ((anchor & HCENTER) != 0) {
            x -= w >> 1;
        } else if ((anchor & RIGHT) != 0) {
            x -= w;
        }
        if ((anchor & VCENTER) != 0) {
            y -= h >> 1;
        } else if ((anchor & BOTTOM) != 0) {
            y -= h;
        }
        int dx1 = x;
        int dx2 = x + w;
        int dy1 = y;
        int dy2 = y + h;
        if ((flipFlags & FLIP_HORIZONTAL) != 0) {
            dx1 = x + w;
            dx2 = x;
        }
        if ((flipFlags & FLIP_VERTICAL) != 0) {
            dy1 = y + h;
            dy2 = y;
        }
        g.drawImage(img.raw(), dx1, dy1, dx2, dy2, 0, 0, w, h, null);
    }

    /**
     * Draws a block of ARGB pixels. With {@code processAlpha} the alpha byte is blended,
     * otherwise the pixels are drawn fully opaque.
     */
    public void drawRGB(int[] rgb, int offset, int scanlength, int x, int y, int w, int h, boolean processAlpha) {
        if (w <= 0 || h <= 0) {
            return;
        }
        if (rgbScratch == null || rgbScratch.getWidth() < w || rgbScratch.getHeight() < h) {
            rgbScratch = new BufferedImage(Math.max(w, 32), Math.max(h, 32), BufferedImage.TYPE_INT_ARGB);
        }
        int[] row = new int[w];
        for (int j = 0; j < h; j++) {
            int src = offset + j * scanlength;
            for (int i = 0; i < w; i++) {
                int p = rgb[src + i];
                row[i] = processAlpha ? p : p | 0xFF000000;
            }
            rgbScratch.setRGB(0, j, w, 1, row, 0, w);
        }
        g.drawImage(rgbScratch, x, y, x + w, y + h, 0, 0, w, h, null);
    }

    public void dispose() {
        g.dispose();
    }
}
