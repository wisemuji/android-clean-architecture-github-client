object Version {
    const val KOTLIN = "1.4.20"
    const val RETROFIT = "2.9.0"
    const val COROUTINE = "1.4.2"
    const val HILT = "2.31.2-alpha"
    const val HILT_JETPACK = "1.0.0-alpha03"
    const val MOSHI = "1.11.0"
}

object ProjectConfig {
    const val GRADLE = "com.android.tools.build:gradle:4.1.1"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
    const val HILT_ANDROID_GRADLE_PLUGIN =
        "com.google.dagger:hilt-android-gradle-plugin:${Version.HILT}"
}

object AndroidConfig {
    const val COMPILE_TARGET_SDK = 30
    const val APP_ID = "com.wisemuji.githubclient"
    const val MIN_SDK = 21
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object BasicDependency {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN}"
}

object AndroidXDependency {
    const val CORE_KTX = "androidx.core:core-ktx:1.3.2"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val APPCOMPAT = "androidx.appcompat:appcompat:1.2.0"
    const val LIFECYCLE_EXT = "androidx.lifecycle:lifecycle-extensions:2.2.0"
}

object CoroutineDependency {
    const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.COROUTINE}"
    const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.COROUTINE}"
}

object RemoteDependency {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Version.RETROFIT}"
    const val RETROFIT_CONVERTER_MOSHI = "com.squareup.retrofit2:converter-moshi:${Version.RETROFIT}"
    const val MOSHI = "com.squareup.moshi:moshi:${Version.MOSHI}"
    const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:${Version.MOSHI}"
}

object TestDependency {
    const val JUNIT = "junit:junit:4.12"
    const val ANDROIDX_JUNIT = "androidx.test.ext:junit:1.1.2"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:3.3.0"
}

object HiltConfig {
    const val HILT_ANDROID = "com.google.dagger:hilt-android:${Version.HILT}"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Version.HILT}"
    const val HILT_COMPILER = "androidx.hilt:hilt-compiler:${Version.HILT_JETPACK}"
}
