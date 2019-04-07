object Versions {
    const val kotlin = "1.3.21"
    const val appCompat = "1.0.2"
    const val core = "1.1.0-alpha05"
    const val constraint = "1.1.3"
    const val retrofit = "2.5.0"
    const val okhttp = "3.14.0"
    const val rxKotlin = "2.3.0"
    const val rxAndroid = "2.1.1"
    const val jacksonDataBind = "2.9.7"
    const val jacksonCore = "2.9.7"
    const val jacksonAnnotation = "2.9.6"
    const val jacksonKotlinModule = "2.9.7"
    const val room = "2.0.0"
    const val recyclerView = "1.0.0"
    const val coroutine = "1.1.1"
    const val junit = "4.12"
    const val runner = "1.2.0-alpha03"
    const val espresso = "3.2.0-alpha03"
}

object Deps {
    const val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"

    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val roomWithRx = "android.arch.persistence.room:rxjava2:${Versions.room}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val jacksonKotlinModule = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.jacksonKotlinModule}"
    const val jacksonCore = "com.fasterxml.jackson.core:jackson-core:${Versions.jacksonCore}"
    const val jacksonDatabind = "com.fasterxml.jackson.core:jackson-databind:${Versions.jacksonDataBind}"
    const val jacksonAnnotation = "com.fasterxml.jackson.core:jackson-annotations:${Versions.jacksonAnnotation}"

    const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxKotlin}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"

    const val junit = "junit:junit:${Versions.junit}"
    const val roomTest = "android.arch.persistence.room:testing:${Versions.room}"
    const val runner = "androidx.test:runner:${Versions.runner}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}