#!/usr/bin/env sh
exec java -jar gradle/wrapper/gradle-wrapper.jar "\$@"
EOF
chmod +x gradlew
