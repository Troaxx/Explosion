package me.tro.Explosion;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Register the event listener
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
        getLogger().info("Explosion plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Explosion plugin has been disabled!");
    }
} 