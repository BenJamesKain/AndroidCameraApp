plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.cameratestkotlin2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.cameratestkotlin2"
        minSdk = 26
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

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    val cameraxversion = "1.2.3"
    implementation("androidx.camera:camera-core:${cameraxversion}")
    implementation("androidx.camera:camera-camera2:${cameraxversion}")
    implementation("androidx.camera:camera-lifecycle:${cameraxversion}")
    implementation("androidx.camera:camera-video:${cameraxversion}")

    implementation("androidx.camera:camera-view:${cameraxversion}")
    implementation("androidx.camera:camera-extensions:${cameraxversion}")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}