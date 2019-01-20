package com.tscforum.ep7.ep_07;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP_07 extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new MyEvents(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
