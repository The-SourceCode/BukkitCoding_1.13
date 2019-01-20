package com.tscforum.ep10;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.List;

public class MyEvents implements Listener {

    private EP10 plugin;

    public MyEvents(EP10 ep10) {
        plugin = ep10;
    }

    @EventHandler
    public void chatEvent(AsyncPlayerChatEvent event) {
        String message = event.getMessage();
        Player player = event.getPlayer();

        boolean enabled = plugin.getConfig().getBoolean("enabled");
        int incidents = plugin.getConfig().getInt("incidents." + player.getUniqueId().toString());
        List<String> wordlist = plugin.getConfig().getStringList("banned-words");

        if (enabled) {
            for (String bannedword : wordlist) {
                if (message.contains(bannedword)) {
                    event.setCancelled(true);
                    player.sendMessage(ChatColor.RED + "You can not say that!");

                    if (incidents != 0) {
                        incidents++;
                        plugin.getConfig().set("incidents." + player.getUniqueId().toString(), incidents);
                        plugin.saveConfig();
                    }else{
                        plugin.getConfig().set("incidents." + player.getUniqueId().toString(), 1);
                        plugin.saveConfig();
                    }
                }
            }
        }
    }


}
