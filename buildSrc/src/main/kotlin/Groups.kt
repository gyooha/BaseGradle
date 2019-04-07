import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.kotlinGroup() {
    add("implementation", Deps.kotlinLib)
    add("implementation", Deps.coroutine)
}

fun DependencyHandler.androidGroup() {
    add("implementation", Deps.appCompat)
    add("implementation", Deps.core)
    add("implementation", Deps.constraint)
    add("implementation", Deps.recyclerView)
    add("implementation", Deps.roomWithRx)
    add("implementation", Deps.roomRuntime)
    add("kapt", Deps.roomCompiler)
}

fun DependencyHandler.networkGroup() {
    add("implementation", Deps.retrofit)
    add("implementation", Deps.okhttp)
    add("implementation", Deps.jacksonKotlinModule)
    add("implementation", Deps.jacksonCore)
    add("implementation", Deps.jacksonDatabind)
    add("implementation", Deps.jacksonAnnotation)
}

fun DependencyHandler.rxGroup() {
    add("implementation", Deps.rxKotlin)
    add("implementation", Deps.rxAndroid)
}

fun DependencyHandler.testGroup() {
    add("implementation", Deps.junit)
    add("implementation", Deps.roomTest)
    add("implementation", Deps.runner)
    add("implementation", Deps.espresso)
}