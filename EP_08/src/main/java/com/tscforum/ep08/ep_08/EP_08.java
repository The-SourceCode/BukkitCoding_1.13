package com.tscforum.ep08.ep_08;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP_08 extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new MyEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
