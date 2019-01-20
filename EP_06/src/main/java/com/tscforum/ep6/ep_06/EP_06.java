package com.tscforum.ep6.ep_06;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP_06 extends JavaPlugin {
    MyEvents myEvents = new MyEvents();

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(myEvents, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
