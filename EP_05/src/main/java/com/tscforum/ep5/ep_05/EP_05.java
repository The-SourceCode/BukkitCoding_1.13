package com.tscforum.ep5.ep_05;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP_05 extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("healme").setExecutor(new CommandClass());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
