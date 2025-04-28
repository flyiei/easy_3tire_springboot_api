#!/bin/sh

# Gradle starter script

APP_HOME="`pwd -P`"
CLASSPATH=$APP_HOME/gradle/wrapper/gradle-wrapper.jar

JAVA_OPTS="$JAVA_OPTS -Xmx64m"

# Determine the Java command
JAVACMD="java"

exec "$JAVACMD" $JAVA_OPTS -classpath "$CLASSPATH" org.gradle.wrapper.GradleWrapperMain "$@" 