package monkeyspin.platform;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Persistent named blobs (settings, saved game, high scores) stored as plain files.
 * Java SE replacement for the J2ME Record Management System; the game only ever used
 * one record per store.
 *
 * <p>Location: {@code ~/.monkeyspin/}, overridable with {@code -Dmonkeyspin.data=DIR}.
 */
public final class Storage {
    private static final Path DIR = Paths.get(System.getProperty("monkeyspin.data",
            Paths.get(System.getProperty("user.home", "."), ".monkeyspin").toString()));

    private Storage() {
    }

    private static Path file(String store) {
        StringBuilder safe = new StringBuilder();
        for (int i = 0; i < store.length(); i++) {
            char c = store.charAt(i);
            safe.append(Character.isLetterOrDigit(c) || c == '-' || c == '_' ? c : '_');
        }
        return DIR.resolve(safe + ".rec");
    }

    /** Returns the stored bytes, or {@code null} if the store does not exist. */
    public static byte[] read(String store) {
        try {
            return Files.readAllBytes(file(store));
        } catch (NoSuchFileException e) {
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    /** Replaces the store contents with {@code data}. */
    public static void write(String store, byte[] data) {
        try {
            Files.createDirectories(DIR);
            Path target = file(store);
            Path tmp = target.resolveSibling(target.getFileName() + ".tmp");
            Files.write(tmp, data);
            Files.move(tmp, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            // Saving is best effort, exactly like a full phone memory.
        }
    }

    public static void delete(String store) {
        try {
            Files.deleteIfExists(file(store));
        } catch (IOException e) {
            // ignore
        }
    }
}
