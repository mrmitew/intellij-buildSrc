# What is 'buildSrc' ?
// TODO

# Why should I use it ?

You will be able to declare your dependencies (and not only) as this:

```import dependencies.*

apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
apply plugin: 'kotlin-android-extensions'

android {
    compileSdkVersion Versions.compile_sdk
    buildToolsVersion Versions.buildTools

    defaultConfig {
        applicationId "com.github.mrmitew.buildSrc"
        minSdkVersion Versions.min_sdk
        targetSdkVersion Versions.target_sdk
        versionCode Versions.code
        versionName Versions.name
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
}

dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    api CommonDependencies.kotlin_stdlib_jdk7
    api CommonDependencies.kotlin_coroutines_android
    api CommonDependencies.kotlin_coroutines_core

    api UiDependencies.appcompat_x
    api UiDependencies.constraint_layoutx
    api UiDependencies.design_x

    testImplementation TestDependencies.junit
    androidTestImplementation TestDependencies.android_test_runnerx
    androidTestImplementation TestDependencies.espresso_corex
}
```

# How to use it?
Clone this repo onto your project's root directory and build your project.

# Troubleshoot
// TODO
