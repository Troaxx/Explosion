package me.tro.Explosion;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMovementListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block targetBlock = player.getTargetBlockExact(5);

        // Check if the player is looking at a grass block
        if (targetBlock != null && targetBlock.getType() == Material.GRASS_BLOCK) {
            // Create explosion with power 5
            player.getWorld().createExplosion(targetBlock.getLocation(), 5F, true, true);
        }
    }
} 