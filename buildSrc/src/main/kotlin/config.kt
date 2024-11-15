import org.gradle.api.JavaVersion

abstract class CommonConfig {
    open val compileSdk = 35
    open val minSdk = 23
    open val targetSdk = 35
    open val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    open val isMinifyEnabled = false
    open val consumerRulesFile = "consumer-rules.pro"
    open val proguardAndroidOptimiseFile = "proguard-android-optimize.txt"
    open val proguardRulesFile = "proguard-rules.pro"
    open val sourceCompatibility = JavaVersion.VERSION_11
    open val targetCompatibility = JavaVersion.VERSION_11
    open val jvmTarget = "11"

    companion object {
        const val COMMON_NAMESPACE = "com.example.testapp2"
    }
}

object AppConfig : CommonConfig() {
    const val nameSpace = COMMON_NAMESPACE
    const val applicationId = COMMON_NAMESPACE
    const val versionCode = 1
    const val versionName = "1.0"
}

object CoreConfig : CommonConfig() {
    const val nameSpace = "$COMMON_NAMESPACE.core"
}