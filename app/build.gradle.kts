plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.example.mekotlin4"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mekotlin4"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // navigation
    val nav_version = "2.5.3"
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation( "androidx.navigation:navigation-ui-ktx:$nav_version")

    //Lottie
    implementation ("com.airbnb.android:lottie:4.2.0")

    //Dots_Indicator
    implementation ("com.tbuonomo:dotsindicator:4.3")

    implementation ("androidx.room:room-runtime:2.6.1") // Библиотека "Room"
    kapt ("androidx.room:room-compiler:2.6.1") // Кодогенератор
    implementation ("androidx.room:room-ktx:2.6.1")
}

kapt {
    correctErrorTypes = true
}
