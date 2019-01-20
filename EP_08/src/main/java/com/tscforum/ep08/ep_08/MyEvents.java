package com.tscforum.ep08.ep_08;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class MyEvents implements Listener {

    @EventHandler
    public void blockPlace(BlockPlaceEvent event){
        Block block = event.getBlock();
        Material material = block.getType();
        Player player = event.getPlayer();

        if(material.equals(Material.TNT)){
            block.setType(Material.AIR);
            player.sendMessage(ChatColor.RED + "You can not place TNT!!!");
        }

    }
}
