#!/bin/sh
# Builds build/crazy-monkey-spin.jar with only the JDK (17+). Maven users: `mvn package` does the same.
set -e
cd "$(dirname "$0")"
rm -rf build/classes && mkdir -p build/classes
javac -encoding UTF-8 --release 17 -nowarn -d build/classes $(find src/main/java -name '*.java')
cp -r src/main/resources/. build/classes/
printf 'Main-Class: monkeyspin.MonkeySpin\n' > build/manifest.txt
jar cfm build/crazy-monkey-spin.jar build/manifest.txt -C build/classes .
echo "Built build/crazy-monkey-spin.jar  (run: java -jar build/crazy-monkey-spin.jar)"
