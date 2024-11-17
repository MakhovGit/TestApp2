plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = AccountScreenConfig.nameSpace
    compileSdk = AccountScreenConfig.compileSdk

    defaultConfig {
        minSdk = AccountScreenConfig.minSdk

        testInstrumentationRunner = AccountScreenConfig.testInstrumentationRunner
        consumerProguardFiles(AccountScreenConfig.consumerRulesFile)
    }

    buildTypes {
        release {
            isMinifyEnabled = AccountScreenConfig.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile(AccountScreenConfig.proguardAndroidOptimiseFile),
                AccountScreenConfig.proguardRulesFile
            )
        }
    }
    buildFeatures {
        viewBinding = AccountScreenConfig.viewBinding
    }
    compileOptions {
        sourceCompatibility = AccountScreenConfig.sourceCompatibility
        targetCompatibility = AccountScreenConfig.targetCompatibility
    }
    kotlinOptions {
        jvmTarget = AccountScreenConfig.jvmTarget
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