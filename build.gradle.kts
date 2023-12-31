// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val agp_version by extra("8.1.0-rc01")
    val agp_version1 by extra("8.1.0")
    dependencies {
        classpath("com.android.tools.build:gradle:$agp_version1")
        val nav_version = "2.7.1"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
    id("com.google.dagger.hilt.android") version "2.44" apply false
    id("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
    id("com.android.dynamic-feature") version "8.1.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.0" apply false
}