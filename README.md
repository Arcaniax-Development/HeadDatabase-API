<p align="center">
    <img src="https://i.imgur.com/rWd7qpw.png">
</p>

---

Head Database is a fast and user-friendly plugin that allows you to obtain thousands of custom Minecraft skulls that feature unique designs.
This easy-to-use heads plugin gives you access to creative designing opportunities that overall enhances the quality of your builds, and gives creative freedom to yourself and your players.

This is the API repository for HeadDatabase. This is **not** HeadDatabase.
If you are looking for the plugin HeadDatabase, get it [from spigot](https://www.spigotmc.org/resources/14280/).

## Links

* [Discord](https://discord.gg/jpRVrjd)
* [Issues](https://github.com/Arcaniax-Development/HeadDatabase-API/issues)

## How to use the API

### Importing via Gradle
```kotlin
repositories {
    maven {
        name = "HeadDatabase-API"
        url = uri("https://mvn.intellectualsites.com/content/groups/public/")
    }
}

dependencies {
    compileOnly("me.arcaniax:HeadDatabase-API:1.1.0")
}
```

### Importing via Maven
```xml
<!-- HeadDatabase-API -->
<repository>
    <id>HeadDatabase-API</id>
    <url>https://mvn.intellectualsites.com/content/groups/public/</url>
</repository>

<!-- HeadDatabase-API -->
<dependency>
    <groupId>me.arcaniax</groupId>
    <artifactId>HeadDatabase-API</artifactId>
    <version>1.1.0</version>
    <scope>provided</scope>
</dependency>
```

# Building
Gradle is the recommended way to build the project. Use `./gradlew build` in the main project directory to build the project.

## Suggestions
Suggestions are welcome! We have a separate issue form for suggestions, that can be found [here](https://github.com/Brennian/HeadDatabase-API/issues).

## Example usage
```java
import me.arcaniax.hdb.api.DatabaseLoadEvent;
import me.arcaniax.hdb.api.HeadDatabaseAPI;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class HeadDatabaseAPIPlugin extends JavaPlugin implements Listener {

    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onDatabaseLoad(DatabaseLoadEvent e) {
        HeadDatabaseAPI api = new HeadDatabaseAPI();
        try {
            ItemStack item = api.getItemHead("7129");
            getLogger().info(api.getItemID(item));
        } catch (NullPointerException nullPointerException) {
            getLogger().info("Could not find the head you were looking for");
        }
    }
}
```
### Tips:

- Don't forget to add `HeadDatabase` to `depend` or `softdepend` section of your `plugin.yml`
- Listen to `DatabaseLoadEvent` and register your events afterwards. The event is fired once HeadDatabase is loaded successfully.
