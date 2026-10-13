package monkeyspin.platform;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Immutable image decoded from PNG data. Java SE replacement for the J2ME {@code Image}.
 */
public final class Img {
    final BufferedImage image;

    private Img(BufferedImage image) {
        this.image = image;
    }

    /** Decodes an image from {@code data[offset .. offset+length)}. */
    public static Img createImage(byte[] data, int offset, int length) {
        try {
            BufferedImage decoded = ImageIO.read(new ByteArrayInputStream(data, offset, length));
            if (decoded == null) {
                throw new IllegalArgumentException("Unsupported image data");
            }
            // Normalise to ARGB so drawing and alpha behave identically for every source format.
            BufferedImage argb = new BufferedImage(decoded.getWidth(), decoded.getHeight(), BufferedImage.TYPE_INT_ARGB);
            java.awt.Graphics2D g = argb.createGraphics();
            g.setComposite(java.awt.AlphaComposite.Src);
            g.drawImage(decoded, 0, 0, null);
            g.dispose();
            return new Img(argb);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot decode image: " + e.getMessage(), e);
        }
    }

    public int getWidth() {
        return image.getWidth();
    }

    public int getHeight() {
        return image.getHeight();
    }

    /** Package-private access for {@link Gfx}. */
    BufferedImage raw() {
        return image;
    }
}
