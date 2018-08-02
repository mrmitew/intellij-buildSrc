# What is 'buildSrc' ?

From [Gradle's documentation](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:build_sources)
> The directory buildSrc is treated as an included build. Upon discovery of the directory, Gradle automatically compiles and tests this code and puts it in the classpath of your build script. For multi-project builds there can be only one buildSrc directory, which has to sit in the root project directory. buildSrc should be preferred over script plugins as it is easier to maintain, refactor and test the code.

Having said that, we can create a `buildSrc` module and use Kotlin code to make our lives easier when it comes to managing dependencies for our projects and get IDE auto-completion support!

# Example of usage

```import dependencies.*
...

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

# Instructions
1. Clone this repo onto your project's root directory under the name of "buildSrc" and build your project.

OR

1. Create `buildSrc` folder in the root of your project
2. Create `src/main/java` folder structure inside `buildSrc` and put your custom code there
3. Create `build.gradle.kts` file inside `buildSrc` with contents:
```
import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}
```
4. Build your project

# Troubleshoot
* If the IDE cannot find rerference to your code, make sure you have imported the right package. Try also cleaning, syncing and building the project.

## Communication
* Author: Stefan Mitev
* E-mail: mr.mitew [at] gmail . com
* [Github issues](https://github.com/mrmitew/intellij-buildSrc/issues)
