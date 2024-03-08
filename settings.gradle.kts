pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Lesson1"
include(":app")
include(":layouttype")
include(":control_lesson1")
include(":controll_lesson1")
include(":layout")
include(":layoutactivity")
include(":block6")
include(":buttonclicker")
