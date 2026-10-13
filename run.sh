#!/bin/sh
cd "$(dirname "$0")"
[ -f build/crazy-monkey-spin.jar ] || ./build.sh
exec java "$@" -jar build/crazy-monkey-spin.jar
