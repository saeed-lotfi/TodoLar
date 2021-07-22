plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(DefaultConfig.compileSdk)

    defaultConfig {
        applicationId(DefaultConfig.id)
        minSdkVersion(DefaultConfig.minSdk)
        targetSdkVersion(DefaultConfig.targetSdk)
        versionCode(Releases.appVersionCode)
        versionName(Releases.appVersionName)

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(true)
            consumerProguardFiles("proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}

dependencies {

    implementation(com.bilgiland.buildsrc.Libs.KOTLIN)
    implementation(com.bilgiland.buildsrc.Libs.CORE_KTX)
    implementation(com.bilgiland.buildsrc.Libs.APPCOMPAT)
    implementation(com.bilgiland.buildsrc.Libs.MATERIAL_DESIGN)
    implementation(com.bilgiland.buildsrc.Libs.CONSTRAINT_LAYOUT)
    implementation(com.bilgiland.buildsrc.Libs.COROUTINES)

    implementation(com.bilgiland.buildsrc.Libs.HILT)
    kapt(com.bilgiland.buildsrc.Libs.HILT_COMPILER)

    testImplementation(com.bilgiland.buildsrc.Libs.JUnit)

    implementation(project(Modules.localStorage))
}