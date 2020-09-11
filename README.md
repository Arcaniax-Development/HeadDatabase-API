<p align="center">
    <img src="https://i.imgur.com/rWd7qpw.png">
</p>

---

Head Database is a fast and user-friendly plugin that allows you to obtain thousands of custom Minecraft skulls that feature unique designs.
This easy-to-use heads plugin gives you access to creative designing opportunities that overall enhance the quality of your builds, and gives creative freedom to yourself and your players.

This is the API repository for HeadDatabase. This is **not** HeadDatabase.

## Links

* [Maven](https://ci.athion.net/job/HeadDatabase-API/mvn/)
* [Discord](https://discord.gg/jpRVrjd)
* [Issues](https://github.com/Brennian/HeadDatabase-API/issues)

## How to use the API

### Importing via Gradle (Groovy)
```groovy
repositories {
    maven { url = "https://ci.athion.net/HeadDatabase-API/mvn/" } // HeadDatabase-API
}

dependencies {
    implementation("net.arcaniax:HeadDatabase-API:1.0.0") // HeadDatabase-API
}
```

### Importing via Gradle (Kotlin)
```kotlin
repositories {
    maven {
        name = "HeadDatabase-API"
        url = uri("https://ci.athion.net/HeadDatabase-API/mvn/")
    }
}

dependencies {
    "implementation"("net.arcaniax:HeadDatabase-API:1.0.0")
}
```

### Importing via Maven
```xml
<!-- HeadDatabase-API -->
<repository>
    <id>headdatabase-api</id>
    <url>https://ci.athion.net/HeadDatabase-API/mvn</url>
</repository>

<!-- HeadDatabase-API -->
<dependency>
    <groupId>me.arcaniax</groupId>
    <artifactId>HeadDatanase-API</artifactId>
    <version>1.0.0</version>
</dependency>
```

# Building
Gradle is the recommended way to build the project. Use `./gradlew build` in the main project directory to build the project.

## Suggestions
Suggestions are welcome! We have a separate issue form for suggestions, that can be found [here](https://github.com/Brennian/HeadDatabase-API/issues).