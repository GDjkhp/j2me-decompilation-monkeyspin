package monkeyspin.platform;

/** Application lifecycle callbacks driven by {@link Host} (replaces the MIDlet lifecycle). */
public interface Lifecycle {
    /** Called once at launch and again whenever the window regains focus. */
    void startApp();

    /** Called when the window loses focus or is minimised. */
    void pauseApp();

    /** Called when the window is closed; the game saves its state here. */
    void destroyApp(boolean unconditional);
}
