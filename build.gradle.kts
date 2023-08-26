import com.diffplug.gradle.spotless.SpotlessPlugin
import java.net.URI

plugins {
    java
    `java-library`
    `maven-publish`
    signing

    id("com.diffplug.spotless") version "6.20.0"
    id("io.github.gradle-nexus.publish-plugin") version "1.3.0"

    idea
    eclipse
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

configurations.all {
    attributes.attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 8)
}

group = "com.arcaniax"
version = "1.3.2-SNAPSHOT"

repositories {
    maven {
        name = "PaperMC"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT")
}

spotless {
    java {
        licenseHeaderFile(rootProject.file("HEADER"))
        target("**/*.java")
    }
}

tasks {

    compileJava {
        options.compilerArgs.addAll(arrayOf("-Xmaxerrs", "1000"))
        options.compilerArgs.add("-Xlint:all")
        for (disabledLint in arrayOf("processing", "path", "fallthrough", "serial"))
            options.compilerArgs.add("-Xlint:$disabledLint")
        options.isDeprecation = true
        options.encoding = "UTF-8"
    }

    javadoc {
        val opt = options as StandardJavadocDocletOptions
        opt.addStringOption("Xdoclint:none", "-quiet")
        opt.tags(
            "apiNote:a:API Note:",
            "implSpec:a:Implementation Requirements:",
            "implNote:a:Implementation Note:"
        )
        opt.links("https://jd.papermc.io/paper/1.21/")
    }
}

java {
    withSourcesJar()
    withJavadocJar()
}

signing {
    if (!version.toString().endsWith("-SNAPSHOT")) {
        val signingKey: String? by project
        val signingPassword: String? by project
        useInMemoryPgpKeys(signingKey, signingPassword)
        signing.isRequired
        sign(publishing.publications)
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])

            pom {

                name.set(project.name + " " + project.version)
                description.set("The API for Head Database, a Minecraft plugin that allows you to obtain thousands of custom Minecraft skulls that feature unique designs.")
                url.set("https://github.com/Arcaniax-Development/HeadDatabase-API")

                licenses {
                    license {
                        name.set("GNU General Public License, Version 3.0")
                        url.set("https://www.gnu.org/licenses/gpl-3.0.html")
                        distribution.set("repo")
                    }
                }

                developers {
                    developer {
                        id.set("Arcaniax")
                        name.set("Arcaniax")
                    }
                }

                scm {
                    url.set("https://github.com/Arcaniax-Development/HeadDatabase-API")
                    connection.set("scm:https://Arcaniax-Development@github.com/Arcaniax-Development/HeadDatabase-API.git")
                    developerConnection.set("scm:git://github.com/Arcaniax-Development/HeadDatabase-API.git")
                }

                issueManagement {
                    system.set("GitHub")
                    url.set("https://github.com/Arcaniax-Development/HeadDatabase-API/issues")
                }
            }
        }
    }
}

nexusPublishing {
    this.repositories {
        sonatype {
            nexusUrl.set(URI.create("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(URI.create("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
        }
    }
}
