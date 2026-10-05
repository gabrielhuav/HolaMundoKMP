rootProject.name = "HolaMundoKMP"

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    // Descarga sola el JDK que pida un toolchain si en la máquina no lo hay.
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// `shared`: el código Kotlin + Compose que comparten Android e iOS (la pantalla de "Hola Mundo").
// `androidApp`: la app de Android, que solo abre una Activity y dibuja la pantalla de `shared`.
// La app de iOS no es un módulo de Gradle: es el proyecto Xcode de `iosApp/`.
include(":shared")
include(":androidApp")
