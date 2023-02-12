#!/bin/sh

./gradlew connectedCheck -p app -Pandroid.testInstrumentationRunnerArguments.class=com.surrus.peopleinspace.OrangeTaskTests


