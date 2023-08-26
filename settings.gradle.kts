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

rootProject.name = "Cryptocurrency"
include(":app")
include(":cryptocurrencies:data:local")
include(":cryptocurrencies:data:repository")
include(":cryptocurrencies:presentation")
include(":cryptocurrency:data:local")
include(":cryptocurrency:data:repository")
include(":cryptocurrency:domain:model")
include(":cryptocurrency:domain:dto")
include(":cryptocurrency:presentation")
include(":cryptocurrencies:data:remote")
include(":cryptocurrency:data:remote")
include(":cryptocurrency:domain:repository")
include(":cryptocurrencies:domain:model")
include(":cryptocurrencies:domain:dto")
include(":cryptocurrencies:domain:repository")
