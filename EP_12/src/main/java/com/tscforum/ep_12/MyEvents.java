package com.tscforum.ep_12;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MyEvents implements Listener {

    @EventHandler
    public void onjoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        boolean hasjoined = player.hasPlayedBefore();

        if(!hasjoined){
            event.setJoinMessage(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.YELLOW + " has joined for the first time!!");
        }else{
            player.sendMessage(ChatColor.BLUE + "Welcome back!");
        }
    }
}
