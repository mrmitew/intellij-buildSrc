@file:Suppress("unused")

package dependencies

object Versions {
    const val code = 1
    const val name = "1.0.0-alpha.1"

    const val compile_sdk = 28
    const val min_sdk = 16
    const val target_sdk = 28
    const val buildTools = "28.0.1"

    // Common
    const val kotlin = "1.2.51"
    const val kotlin_coroutines = "0.24.0"
    const val kotlin_native = "0.8"
    const val lifecycle = "1.1.1"
    const val lifecycle_x = "2.0.0-beta01"
    const val support = "28.0.0-alpha3"
    const val kotlin_ktx = "1.0.0-alpha1"

    // Reactive
    const val rxandroid = "2.0.2"
    const val rxkotlin = "2.2.0"

    // Serialization
    const val gson = "2.8.2"

    // Networking
    const val retrofit = "2.4.0"
    const val logging_interceptor = "3.10.0"
    const val retrofit_kotlin_coroutines_adapter = "1.0.0"
    const val okHttp = "3.10.0"

    // DI
    const val koin = "0.9.3"

    // UI
    const val constraint_layout = "1.1.1"
    const val aac_navigation = "1.0.0-alpha02" // "2.0.0-alpha1"
    const val kotlin_coroutines_runtime_permission = "1.0.1"
    // Android X
    const val appcompatx = "1.0.0-beta01"
    const val designx = "1.0.0-alpha1"
    const val constraint_layoutx = "1.1.2"

    // Test
    const val junit = "4.12"
    const val assertj_core = "3.9.1"
    const val mockito_kotlin = "1.5.0"
    const val android_test_runner = "1.0.2"
    const val android_test_runnerx = "1.1.0-alpha3"
    const val espresso_core = "3.0.2"
    const val espresso_corex = "3.1.0-alpha3"
}

object CommonDependencies {
    const val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_stdlib_common = "org.jetbrains.kotlin:kotlin-stdlib-common:${Versions.kotlin}"
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val lifecycle_extensions = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
    const val lifecycle_compiler = "android.arch.lifecycle:compiler:${Versions.lifecycle}"
    const val lifecycle_x_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_x}"
    const val lifecycle_x_livedata = "androidx.lifecycle:lifecycle-livedata:${Versions.lifecycle_x}"
    const val lifecycle_x_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle_x}"
    const val kotlin_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlin_coroutines}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin_coroutines}"
    const val kotlin_ktx = "androidx.core:core-ktx:{${Versions.kotlin_ktx}"
}

object ReactiveDependencies {
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"
    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"
}

object SerializationDependencies {
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
}

object NetworkingDependencies {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor}"
    const val retrofit_kotlin_coroutines_adapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:${Versions.retrofit_kotlin_coroutines_adapter}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val retrofit_gson_coverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
}

object DiDependencies {
    const val koin = "org.koin:koin-core:${Versions.koin}"
    const val koin_android = "org.koin:koin-android:${Versions.koin}"
    const val koin_aac = "org.koin:koin-android-architecture:${Versions.koin}"
}

object UiDependencies {
    const val support_v4 = "com.android.support:support-v4:${Versions.support}"
    const val appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support}"
    const val appcompat_x = "androidx.appcompat:appcompat:${Versions.appcompatx}"
    const val design = "com.android.support:design:${Versions.support}"
    const val design_x = "com.google.android.material:material:${Versions.designx}"
    const val cardview_v7 = "com.android.support:cardview-v7:${Versions.support}"
    const val recyclerview_v7 = "com.android.support:recyclerview-v7:${Versions.support}"
    const val constraint_layout = "com.android.support.constraint:constraint-layout:${Versions.constraint_layout}"
    const val constraint_layoutx = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layoutx}"
    const val aac_navigation_fragment = "android.arch.navigation:navigation-fragment-ktx:${Versions.aac_navigation}"
    const val aac_navigation_ui = "android.arch.navigation:navigation-ui-ktx:${Versions.aac_navigation}"
    const val kotlin_coroutines_runtime_permission = "com.github.florent37:runtime-permission-kotlin:${Versions.kotlin_coroutines_runtime_permission}"
}

object TestDependencies {
    const val junit = "junit:junit:${Versions.junit}"
    const val assertj_core = "org.assertj:assertj-core:${Versions.assertj_core}"
    const val mockito_kotlin = "com.nhaarman:mockito-kotlin:${Versions.mockito_kotlin}"
    const val lifecycle_testing = "android.arch.core:core-testing:${Versions.lifecycle}"
    const val android_test_runner = "com.android.support.test:runner:${Versions.android_test_runner}"
    const val android_test_runnerx = "androidx.test:runner:${Versions.android_test_runnerx}"
    const val espresso_core = "com.android.support.test.espresso:espresso-core:${Versions.espresso_core}"
    const val espresso_corex = "androidx.test.espresso:espresso-core:${Versions.espresso_corex}"
}