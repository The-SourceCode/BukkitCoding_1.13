package com.tscforum.ep_13;

import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class MyEvents implements Listener {

    @EventHandler
    public void join(PlayerJoinEvent event){
        Player player = event.getPlayer();
        Firework firework = player.getWorld().spawn(player.getLocation(), Firework.class);
        FireworkMeta fireworkMeta = firework.getFireworkMeta();
        FireworkEffect.Builder builder = FireworkEffect.builder();

        fireworkMeta.addEffect(builder.trail(true).withColor(Color.FUCHSIA).build());
        fireworkMeta.addEffect(builder.withColor(Color.AQUA).build());
        fireworkMeta.addEffect(builder.withFade(Color.FUCHSIA).build());
        fireworkMeta.addEffect(builder.with(FireworkEffect.Type.CREEPER).build());
        fireworkMeta.setPower(1);

        firework.setFireworkMeta(fireworkMeta);
    }
}
