package com.bilgiland.buildsrc


object Libs {

    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:" + Versions.kotlin

    const val BUILD_GRADLE = "com.android.tools.build:gradle:" + Versions.BUILD_GRADLE

    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:" + Versions.kotlin

    const val MATERIAL_DESIGN = "com.google.android.material:material:" + Versions.materialDesign


    const val APPCOMPAT = "androidx.appcompat:appcompat:" + Versions.appCompat

    const val CORE_KTX = "androidx.core:core-ktx:" + Versions.coreKtx

    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:" + Versions.constraintLayout

    const val JUnit = "junit:junit:" + Versions.junit

    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:" + Versions.COROUTINES

    const val HILT = "com.google.dagger:hilt-android:" + Versions.HILT

    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:" + Versions.HILT
}