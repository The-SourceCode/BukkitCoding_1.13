package com.tscforum.ep_12;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP_12 extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new MyEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
