# Running the Orange Task Tests

This project contains a shell script run_orange_task_tests.sh which can be used to run the tests for the OrangeTask class in the package com.surrus.peopleinspace.

## Prerequisites

Before you run the tests, make sure you have the following installed:

* [Gradle](https://gradle.org/install/)
* [Android SDK](https://developer.android.com/studio)
* [An Android device or emulator](https://developer.android.com/studio/run/emulator)

## Steps to run the tests

1. Clone the repository: `git clone https://github.com/volckin/PeopleInSpace.git`
2. Open project in AndroidStudio
3. wait for gradle to be build
4. Open Terminal in Android studio
5. Run the script: `./run_orange_task_tests.sh`
</br>
**Note:** If you need Make the shell script executable: `chmod +x run_orange_task_tests.sh`
</br>
</br>
The script will run the tests for the com.surrus.peopleinspace.OrangeTaskTests class using Gradle.
</br>
The results of the tests will be displayed in the terminal or you can open test result html page located in: app/build/reports/androidTests/connected/com.surrus.peopleinspace.OrangeTaskTests.html
