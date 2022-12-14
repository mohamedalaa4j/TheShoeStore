# Project Title

The Shoe Store

## Getting Started

Clone the repo 
https://github.com/mohamedalaa4j/TheShoeStore.git

or

Download a zib file
https://github.com/mohamedalaa4j/TheShoeStore/archive/refs/heads/master.zip


### Dependencies

```

plugins {
    id("androidx.navigation.safeargs.kotlin")
    id 'kotlin-parcelize'
}

dependencies {
    implementation 'androidx.navigation:navigation-fragment-ktx:2.5.3'
    implementation 'androidx.navigation:navigation-ui-ktx:2.5.3'
    }

//Project-level gradle
buildscript {
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
    }
}
```

## Guide Resources 

addView() usage
https://stackoverflow.com/questions/2395769/how-to-programmatically-add-views-to-views

inflate XML layout as a view
https://stackoverflow.com/questions/13889225/create-views-programmatically-using-xml-on-android

SharedViewModel
https://developer.android.com/codelabs/basic-android-kotlin-training-shared-viewmodel#9

FAB icon tint
https://stackoverflow.com/questions/31113819/set-fab-icon-color

Fix deprecated onCreateOptionsMenu(), onOptionsItemSelected(), setHasOptionsMenu()
https://developer.android.com/jetpack/androidx/releases/activity#1.4.0-alpha01

## License
Educational purposes
