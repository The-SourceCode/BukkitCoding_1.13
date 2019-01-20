package com.tscforum.ep9.ep_09;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP_09 extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new MyEvents(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
