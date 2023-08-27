plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "dev.hossam.cryptocurrency"
    compileSdk = 34

    defaultConfig {
        applicationId = "dev.hossam.cryptocurrency"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    val intuit_version = "1.1.0"
    implementation("com.intuit.ssp:ssp-android:$intuit_version")
    implementation("com.intuit.sdp:sdp-android:$intuit_version")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    val nav_version = "2.7.0-rc01"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

    val lifecycle_version = "2.6.1"
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    ksp("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")

    implementation("com.google.dagger:hilt-android:2.47")
    ksp("com.google.dagger:hilt-android-compiler:2.47")

    //Room Database
    val room_version = "2.5.2"
    implementation("androidx.room:room-runtime:$room_version")
    // To use Kotlin Symbol Processing (KSP)
    ksp("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")


    implementation(project(":core:data"))


}