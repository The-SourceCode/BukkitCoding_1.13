package com.tscforum.ep9.ep_09;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class MyEvents implements Listener {

    @EventHandler
    public void chatCheck(AsyncPlayerChatEvent event){
        String message = event.getMessage();

        if(message.contains("dog")){
            event.setCancelled(true);
        }
    }
}
