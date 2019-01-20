package com.tscforum.ep7.ep_07;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class MyEvents implements Listener {
    @EventHandler
    public void blockBreak(BlockBreakEvent event){
        Block block = event.getBlock();
        Material material = block.getType();
        Player player = event.getPlayer();
            player.sendMessage(ChatColor.GRAY + "You have broke " + ChatColor.YELLOW + material);
    }
}
