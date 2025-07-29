# Explosion

A Minecraft plugin that creates explosions when players walk on grass blocks.

## Description

Explosion is a simple yet entertaining Minecraft plugin that creates explosions whenever a player walks on a grass block. The plugin monitors player movement and triggers a powerful explosion (with a power level of 5) when a player is detected standing on a grass block.

## Features

- **Grass Detection**: Automatically detects when players are standing on grass blocks
- **Instant Explosions**: Creates immediate explosions at the player's location
- **Configurable Power**: Current explosion power is set to 5 (medium-sized explosion)

## Installation

1. Download the latest version of the plugin from the releases page
2. Place the JAR file in your server's `plugins` folder
3. Restart your server or use a plugin manager to load the plugin
4. No additional configuration required - the plugin works immediately after installation

## Usage

Simply walk on grass blocks in-game, and explosions will automatically trigger at your location. Be careful where you step!

## Technical Details

- **Plugin Name**: Explosion
- **Version**: 1.0
- **API Version**: 1.13+
- **Main Class**: me.tro.Explosion.Main
- **Author**: trotro (troaxx)

## Code Structure

- `Main.java` - The main plugin class that handles initialization and event registration
- `PlayerMovementListener.java` - Event listener that detects player movement and triggers explosions
- `plugin.yml` - Plugin metadata and configuration file

## Requirements

- Bukkit/Spigot/Paper server (compatible with API version 1.13 or higher)
- Players should be careful around grass areas!

## Permissions

This plugin does not implement any permission nodes.

## Commands

This plugin does not implement any commands.


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Disclaimer

This plugin can cause significant terrain damage. Use responsibly on servers where griefing is allowed or where land protection plugins are in place.
