package com.tscforum.ep10;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP10 extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();

        this.getServer().getPluginManager().registerEvents(new MyEvents(this), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
