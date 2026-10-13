package monkeyspin.platform;

import java.io.ByteArrayInputStream;
import javax.sound.midi.MetaEventListener;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

/**
 * Plays one MIDI or WAV sound with MIDP-Player-like semantics (loop count, 0-100 volume,
 * prefetch/start/stop). Java SE replacement for the J2ME Mobile Media API player.
 *
 * <p>Every operation is best effort: on a machine without audio output the player simply stays silent.
 */
public final class SoundPlayer {
    public static final int CLOSED = 0;
    public static final int REALIZED = 200;
    public static final int PREFETCHED = 300;
    public static final int STARTED = 400;

    private static Synthesizer sharedSynth;
    private static boolean synthFailed;

    private final byte[] data;
    private final boolean wav;

    private int state = REALIZED;
    private int loops = 1;
    private int volume = 100;

    private Sequencer sequencer;
    private VolumeReceiver volumeReceiver;
    private Clip clip;

    private SoundPlayer(byte[] data, boolean wav) {
        this.data = data;
        this.wav = wav;
    }

    /** {@code mime} is {@code "audio/wav"} for WAV data; anything else is treated as a MIDI file. */
    public static SoundPlayer create(byte[] data, String mime) {
        return new SoundPlayer(data, "audio/wav".equals(mime));
    }

    public synchronized int getState() {
        return state;
    }

    public synchronized void prefetch() {
        if (state >= PREFETCHED) {
            return;
        }
        try {
            if (wav) {
                AudioInputStream in = AudioSystem.getAudioInputStream(new ByteArrayInputStream(data));
                clip = AudioSystem.getClip();
                clip.open(in);
            } else {
                Synthesizer synth = synth();
                if (synth != null) {
                    Sequence seq = MidiSystem.getSequence(new ByteArrayInputStream(data));
                    sequencer = MidiSystem.getSequencer(false);
                    sequencer.open();
                    volumeReceiver = new VolumeReceiver(synth.getReceiver());
                    sequencer.getTransmitter().setReceiver(volumeReceiver);
                    sequencer.setSequence(seq);
                }
            }
        } catch (Throwable t) {
            // no audio hardware / unsupported data: stay silent
            clip = null;
            sequencer = null;
        }
        state = PREFETCHED;
        applyVolume();
    }

    /** MIDP semantics: {@code -1} loops forever, {@code n >= 1} plays n times. */
    public synchronized void setLoopCount(int count) {
        loops = count;
    }

    /** {@code level} is 0..100. */
    public synchronized void setVolume(int level) {
        volume = Math.max(0, Math.min(100, level));
        applyVolume();
    }

    public synchronized void start() {
        prefetch();
        stopQuietly();
        try {
            if (clip != null) {
                clip.setFramePosition(0);
                if (loops < 0) {
                    clip.loop(Clip.LOOP_CONTINUOUSLY);
                } else if (loops > 1) {
                    clip.loop(loops - 1);
                } else {
                    clip.start();
                }
            } else if (sequencer != null) {
                sequencer.setTickPosition(0);
                sequencer.setLoopCount(loops < 0 ? Sequencer.LOOP_CONTINUOUSLY : Math.max(loops - 1, 0));
                applyVolume();
                sequencer.start();
            }
        } catch (Throwable t) {
            // ignore
        }
        state = STARTED;
    }

    /** Stops playback and rewinds to the beginning. */
    public synchronized void stop() {
        stopQuietly();
        if (state == STARTED) {
            state = PREFETCHED;
        }
    }

    public synchronized void close() {
        stopQuietly();
        try {
            if (clip != null) {
                clip.close();
            }
            if (sequencer != null) {
                sequencer.close();
            }
        } catch (Throwable t) {
            // ignore
        }
        clip = null;
        sequencer = null;
        state = CLOSED;
    }

    private void stopQuietly() {
        try {
            if (clip != null) {
                clip.stop();
                clip.setFramePosition(0);
            }
            if (sequencer != null) {
                if (sequencer.isRunning()) {
                    sequencer.stop();
                }
                sequencer.setTickPosition(0);
                if (volumeReceiver != null) {
                    volumeReceiver.silence();
                }
            }
        } catch (Throwable t) {
            // ignore
        }
    }

    private void applyVolume() {
        try {
            if (clip != null && clip.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                FloatControl gain = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                double linear = Math.max(volume, 1) / 100.0;
                gain.setValue(Math.max(gain.getMinimum(), (float) (20.0 * Math.log10(linear))));
            }
            if (volumeReceiver != null) {
                volumeReceiver.setFactor(volume / 100f);
            }
        } catch (Throwable t) {
            // ignore
        }
    }

    private static synchronized Synthesizer synth() {
        if (sharedSynth == null && !synthFailed) {
            try {
                Synthesizer s = MidiSystem.getSynthesizer();
                s.open();
                sharedSynth = s;
            } catch (Throwable t) {
                synthFailed = true;
            }
        }
        return sharedSynth;
    }

    /** Scales MIDI channel-volume controller (CC 7) so the player volume applies to the whole song. */
    private static final class VolumeReceiver implements Receiver {
        private final Receiver out;
        private final int[] base = new int[16];
        private float factor = 1f;

        VolumeReceiver(Receiver out) {
            this.out = out;
            java.util.Arrays.fill(base, 100);
        }

        @Override
        public void send(MidiMessage message, long timeStamp) {
            if (message instanceof ShortMessage) {
                ShortMessage sm = (ShortMessage) message;
                if (sm.getCommand() == ShortMessage.CONTROL_CHANGE && sm.getData1() == 7) {
                    base[sm.getChannel()] = sm.getData2();
                    sendVolume(sm.getChannel(), timeStamp);
                    return;
                }
            }
            out.send(message, timeStamp);
        }

        void setFactor(float f) {
            factor = f;
            for (int ch = 0; ch < 16; ch++) {
                sendVolume(ch, -1);
            }
        }

        void silence() {
            try {
                for (int ch = 0; ch < 16; ch++) {
                    out.send(new ShortMessage(ShortMessage.CONTROL_CHANGE, ch, 123, 0), -1); // all notes off
                    out.send(new ShortMessage(ShortMessage.CONTROL_CHANGE, ch, 120, 0), -1); // all sound off
                }
            } catch (Exception e) {
                // ignore
            }
        }

        private void sendVolume(int ch, long ts) {
            try {
                int v = Math.max(0, Math.min(127, Math.round(base[ch] * factor)));
                out.send(new ShortMessage(ShortMessage.CONTROL_CHANGE, ch, 7, v), ts);
            } catch (Exception e) {
                // ignore
            }
        }

        @Override
        public void close() {
        }
    }
}
