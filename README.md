# Crazy Monkey Spin – Java SE port

Port of Digital Chocolate's J2ME game *Crazy Monkey Spin* (Nokia E61/E71 build) to plain
Java SE 17+. No `javax.microedition.*` or `com.nokia.*` classes are used any more.
Everything runs on Swing/AWT, `javax.sound` and the file system.

## Build and run

    ./build.sh          # javac + jar only, creates build/crazy-monkey-spin.jar
    ./run.sh            # or: java -jar build/crazy-monkey-spin.jar

`mvn package` is also set up (`pom.xml`), but I could not test it offline.

Options (`java -Dname=value -jar ...`):

| Property | Default | Meaning |
|---|---|---|
| `monkeyspin.scale` | 2 | initial window scale (the game is 320x240) |
| `monkeyspin.frameMs` | 25 | frame time in ms |
| `monkeyspin.data` | `~/.monkeyspin` | folder for settings, saved game and scores |

## Controls

| Key | Phone key |
|---|---|
| Arrow keys | D-pad |
| Enter / Space | Fire |
| F1 or Q / F2, W, Esc or Backspace | Left / right soft key |
| 0-9, `*`, `#` | Number keys |

## How the port is built

* `monkeyspin/platform/` – new code replacing the J2ME APIs: `Gfx` (Graphics + Nokia DirectGraphics,
  MIDP anchors/clip semantics), `Img`, `Fnt`, `ScreenCanvas` (Canvas), `Host` (window, game loop,
  key mapping, `callSerially` emulation), `Storage` (RMS replacement), `SoundPlayer` (MIDI/WAV).
* The rest of `monkeyspin/` is the original game logic, decompiled with Vineflower and cleaned up
  by hand. The original names were obfuscated and are mostly kept (`class_2` etc.);
  `docs/NAME_MAP.md` maps them to the original jar.
* The decompiler mis-handled several methods because the obfuscator reuses local slots and
  inlines helpers. Affected places were checked against the bytecode (`javap`) and fixed by hand,
  for example `class_20.method_329` (animation draw) and the byte-overflow loop in `BitmapFont`.
  A differential check against the original jar (same input on both, comparing draw calls and
  screenshots) was used to find these.
* `src/test/java/monkeyspin/SmokeTest.java` boots the game headless, taps keys and writes screenshots.

## Known limits

* Audio could only be checked without a sound device, so it is untested by ear.
* Not every level and screen was played; the intro, menus, world map, level select and the start of
  level 1 were verified against the original. Other decompiler slips may remain in rarely used paths.
* Game assets belong to their original owner; this is a technical port for preservation/learning.
