# SilentDragon Android - Android frontend for SilentDragon

SilentDragon Android is an Android frontend for the desktop SilentDragon that lets you send and receive shielded payments from your mobile phone.


## Google Play

SOON

## Dev Download

You can also head over to the [Releases page](https://github.com/MyHush/SilentDragonAndroid/releases) to download an APK.

### Run SilentDragon

In order to let your Android phone connect to your desktop, you need to run the deskop [SilentDragon](https://github.com/MyHush/SilentDragon), and sync fully.

Thankfully this should only take a few minutes with a fast internet connection! As the Hush network grows, it will take longer.

After your node is synced, go to `Apps -> Connect Mobile App` to view the connection QR Code, which you can scan from the Android App.

### Install the Android APK directly

If you're installing the APK directly, you'll need to allow `Install from untrusted sources` on your Android phone.

### Bugs???

You can file issues in the [issues tab](https://github.com/MyHush/SilentDragonAndroid/issues).

## Release Build Process

In order to build you'll need to obtain the following files and place them in the main directory.
* silent_dragon_keystore.jks
* secrets.properties

These files contain sensitive information and should not be committed to git.

Before creating each build you should increment the version code & version name in the build.gradle file. These must be incremented for each release otherwise the Play Store will reject the build.

To create a release build navigate to the project directory in terminal and run
./gradlew clean assembleRelease

This will produce an apk file in the following directory.
SilentDragonAndroid/app/build/output/apk/release/app-release.apk

This build can be directly uploaded to Google Play.
