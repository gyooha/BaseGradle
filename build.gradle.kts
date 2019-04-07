// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.3.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.21")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks {
    val cleanStandard by registering(Delete::class) {
        println("clean start")
        delete(buildDir)
        println("clean end")
    }
}
