import net.minecrell.gradle.licenser.LicenseExtension

plugins {
    id("java")
    id("net.minecrell.licenser") version "0.4.1"
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
    maven {
        name = "Spigot"
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots")
    }
}

dependencies {
    "compileOnly"("org.spigotmc:spigot-api:1.16.2-R0.1-SNAPSHOT")
}

version = "1.0.0"

configure<LicenseExtension> {
    header = rootProject.file("HEADER")
    include("**/*.java")

}