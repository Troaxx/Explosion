# Explosion Plugin

A Minecraft plugin that creates explosions when players look at grass blocks within a 5-block radius.

## Features

* **Smart Detection**: Creates explosions when players look directly at grass blocks (within 5 blocks)
* **Powerful Impact**: Generates explosions with power level 5
* **Block Breaking**: Explosions can break blocks and cause damage
* **No Configuration Needed**: Works right out of the box

## Requirements

* Java 8 or higher
* Minecraft server 1.19.x (Paper, Spigot, or Bukkit)
* Maven (for building from source)

## Quick Start

1. Download the latest `Explosion-1.0-SNAPSHOT.jar` from the releases
2. Place it in your server's `plugins` folder
3. Restart your server
4. Look at any grass block within 5 blocks to create an explosion!

## Building from Source

### Prerequisites
1. Install Java 8 or higher
2. Install Maven
3. Clone this repository

### Build Steps
```bash
# Clone the repository
git clone https://github.com/Troaxx/Explosion.git

# Navigate to project directory
cd Explosion

# Build with Maven
mvn clean package
```

The compiled JAR will be in the `target` folder as `Explosion-1.0-SNAPSHOT.jar`

## Implementation Details

### How it Works
The plugin uses the following mechanics:
1. Monitors player movement using `PlayerMoveEvent`
2. Uses `player.getTargetBlockExact(5)` to check what block the player is looking at
3. If the target block is a grass block, creates an explosion using `World.createExplosion()`

### Key Classes
- `Main.java`: Plugin initialization and event registration
  ```java
  public class Main extends JavaPlugin {
      @Override
      public void onEnable() {
          getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
      }
  }
  ```

- `PlayerMovementListener.java`: Handles explosion logic
  ```java
  @EventHandler
  public void onPlayerMove(PlayerMoveEvent event) {
      Player player = event.getPlayer();
      Block targetBlock = player.getTargetBlockExact(5);

      if (targetBlock != null && targetBlock.getType() == Material.GRASS_BLOCK) {
          player.getWorld().createExplosion(targetBlock.getLocation(), 5F, true, true);
      }
  }
  ```

## Configuration

No configuration is needed! The plugin works with these default settings:
- Detection range: 5 blocks
- Explosion power: 5.0
- Block damage: Enabled
- Entity damage: Enabled

## Troubleshooting

1. **Plugin doesn't load**
   - Check server logs for errors
   - Verify you're using Minecraft 1.19.x
   - Ensure the JAR is in the plugins folder

2. **No explosions**
   - Make sure you're looking directly at grass blocks
   - Verify you're within 5 blocks of the target
   - Check if other plugins are preventing explosions

3. **Build fails**
   - Ensure Maven is properly installed
   - Check your Java version (Java 8+)
   - Try running `mvn clean install` for detailed error messages

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Safety Warning ⚠️

This plugin can cause significant terrain damage. Use with caution and consider:
- Using world protection plugins
- Setting up protected regions
- Backing up your world regularly
