package com.tsc.ep11;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP11 extends JavaPlugin {

    @Override
    public void onEnable() {

    this.getServer().getPluginManager().registerEvents(new MyEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
