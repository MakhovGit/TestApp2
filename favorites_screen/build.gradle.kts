plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = FavoritesScreenConfig.nameSpace
    compileSdk = FavoritesScreenConfig.compileSdk

    defaultConfig {
        minSdk = FavoritesScreenConfig.minSdk

        testInstrumentationRunner = FavoritesScreenConfig.testInstrumentationRunner
        consumerProguardFiles(FavoritesScreenConfig.consumerRulesFile)
    }

    buildTypes {
        release {
            isMinifyEnabled = FavoritesScreenConfig.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile(FavoritesScreenConfig.proguardAndroidOptimiseFile),
                FavoritesScreenConfig.proguardRulesFile
            )
        }
    }
    buildFeatures {
        viewBinding = FavoritesScreenConfig.viewBinding
    }
    compileOptions {
        sourceCompatibility = FavoritesScreenConfig.sourceCompatibility
        targetCompatibility = FavoritesScreenConfig.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = FavoritesScreenConfig.jvmTarget
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