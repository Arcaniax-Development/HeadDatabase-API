import com.vanniktech.maven.publish.SonatypeHost
import com.diffplug.gradle.spotless.SpotlessPlugin
import java.net.URI

plugins {
    java
    `java-library`
    signing

    id("com.diffplug.spotless") version "7.0.4"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
    id("com.vanniktech.maven.publish") version "0.32.0"

    idea
    eclipse
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}

configurations.all {
    attributes.attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 8)
}

group = "com.arcaniax"
version = "1.3.3-SNAPSHOT"

repositories {
    maven {
        name = "PaperMC"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
}

spotless {
    java {
        licenseHeaderFile(rootProject.file("HEADER"))
        target("**/*.java")
    }
}

tasks {

    javadoc {
        val opt = options as StandardJavadocDocletOptions
        opt.links("https://jd.papermc.io/paper/1.21.5/")
        opt.noTimestamp()
    }

    withType<AbstractArchiveTask>().configureEach {
        isPreserveFileTimestamps = false
        isReproducibleFileOrder = true
    }
}


signing {
    if (!project.hasProperty("skip.signing") && !version.toString().endsWith("-SNAPSHOT")) {
        val signingKey: String? by project
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKey, signingPassword)
        signing.isRequired
        sign(publishing.publications)
    }
}

mavenPublishing {
    coordinates(
            groupId = "$group",
            artifactId = project.name,
            version = "${project.version}",
    )

    pom {
        name.set(project.name)
        description.set("The API for Head Database, a Minecraft plugin that allows you to obtain thousands of custom Minecraft skulls that feature unique designs.")
        url.set("https://github.com/Arcaniax-Development/HeadDatabase-API")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/mit")
                distribution.set("repo")
            }
        }

        developers {
            developer {
                id.set("Arcaniax")
                name.set("Arcaniax")
            }
            developer {
                id.set("NotMyFault")
                name.set("NotMyFault")
                email.set("contact(at)notmyfault.dev")
            }
        }

        scm {
            url.set("https://github.com/Arcaniax-Development/HeadDatabase-API")
            connection.set("scm:git:https://github.com/Arcaniax-Development/HeadDatabase-API.git")
            developerConnection.set("scm:git:git@github.com:Arcaniax-Development/HeadDatabase-API.git")
            tag.set(project.version.toString())
        }

        issueManagement {
            system.set("GitHub")
            url.set("https://github.com/Arcaniax-Development/HeadDatabase-API/issues")
        }

        publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    }
}
