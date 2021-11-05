import org.cadixdev.gradle.licenser.LicenseExtension

plugins {
    java
    `java-library`
    `maven-publish`
    signing

    id("org.cadixdev.licenser") version "0.6.1"

    idea
    eclipse
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(16))
}

tasks.compileJava.configure {
    options.release.set(8)
}

configurations.all {
    attributes.attribute(TargetJvmVersion.TARGET_JVM_VERSION_ATTRIBUTE, 16)
}

group = "com.arcaniax"
version = "1.3.1"

var versuffix by extra("SNAPSHOT")
version = if (!project.hasProperty("release")) {
    String.format("%s-%s", project.version, versuffix)
} else {
    String.format(project.version as String)
}

repositories {
    mavenCentral()
    maven {
        name = "PaperMC"
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
}

configure<LicenseExtension> {
    header(rootProject.file("HEADER"))
    include("**/*.java")
    newLine.set(false)
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
        opt.links("https://papermc.io/javadocs/paper/1.17/")
    }
}

java {
    withSourcesJar()
    withJavadocJar()
}

signing {
    if (!version.toString().endsWith("-SNAPSHOT")) {
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

    repositories {
        mavenLocal()
        val nexusUsername: String? by project
        val nexusPassword: String? by project
        if (nexusUsername != null && nexusPassword != null) {
            maven {
                val releasesRepositoryUrl =
                    "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                val snapshotRepositoryUrl =
                    "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                url = uri(
                    if (version.toString().endsWith("-SNAPSHOT")) snapshotRepositoryUrl
                    else releasesRepositoryUrl
                )

                credentials {
                    username = nexusUsername
                    password = nexusPassword
                }
            }
        } else {
            logger.warn("No nexus repository is added; nexusUsername or nexusPassword is null.")
        }
    }
}
