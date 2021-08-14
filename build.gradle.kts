import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    java
    id("net.minecrell.plugin-yml.bukkit") version "0.4.0"
    id("com.github.ben-manes.versions") version "0.39.0"
}

version = "1.0.0"

repositories {
    maven(url = "https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven(url = "https://oss.sonatype.org/content/groups/public/")
    mavenCentral()
}

dependencies {
    implementation("org.spigotmc:spigot-api:1.17.1-R0.1-SNAPSHOT")
    implementation("org.jetbrains:annotations:21.0.1")
}

configure<BukkitPluginDescription> {
    main = "dev.s7a.GSitPlayerMountFix.Main"
    apiVersion = "1.17"
    author = "sya_ri"
}
