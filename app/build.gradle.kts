import java.io.FileInputStream
import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

fun getApiKey(propertyKey: String): String {
    val properties = Properties()
    var apiKey = ""
    try {
        val localPropertiesFile = rootProject.file("local.properties")
        if (localPropertiesFile.exists()) {
            properties.load(FileInputStream(localPropertiesFile))
            apiKey = properties.getProperty(propertyKey, "") // Provide a default empty string if not found
        }
    } catch (e: Exception) {
        // Handle exception (e.g., log it) or let it be empty
        println("Warning: Could not read API key from local.properties: ${e.message}")
    }
    return apiKey
}

android {
    namespace = "com.practice.retrofitmvvm"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.practice.retrofitmvvm"
        minSdk = 31
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // The type of the field will be String, the name will be NEWS_API_KEY
        buildConfigField("String", "NEWS_API_KEY", "\"${getApiKey("NEWS_API_KEY")}\"")
    }

    buildFeatures {
        buildConfig = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Networking
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.1")

    // DI
    implementation("com.google.dagger:dagger:2.48.1")
    kapt("com.google.dagger:dagger-compiler:2.48.1")
    
    // Custom Tabs for news links
    implementation("androidx.browser:browser:1.8.0")

    // Compose dependencies
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.activity.compose)
    
    // Compose Image Loading
    implementation("io.coil-kt:coil-compose:2.6.0")
}
