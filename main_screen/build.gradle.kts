plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = MainScreenConfig.nameSpace
    compileSdk = MainScreenConfig.compileSdk

    defaultConfig {
        minSdk = MainScreenConfig.minSdk

        testInstrumentationRunner = MainScreenConfig.testInstrumentationRunner
        consumerProguardFiles(MainScreenConfig.consumerRulesFile)
    }

    buildTypes {
        release {
            isMinifyEnabled = MainScreenConfig.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile(MainScreenConfig.proguardAndroidOptimiseFile),
                MainScreenConfig.proguardRulesFile
            )
        }
    }
    buildFeatures {
        viewBinding = MainScreenConfig.viewBinding
    }
    compileOptions {
        sourceCompatibility = MainScreenConfig.sourceCompatibility
        targetCompatibility = MainScreenConfig.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = MainScreenConfig.jvmTarget
    }
}

dependencies {

    // Android
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    // Tests
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}