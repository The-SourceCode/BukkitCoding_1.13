package com.tscforum.ep4.ep_04;

import org.bukkit.plugin.java.JavaPlugin;

public final class EP04 extends JavaPlugin {

    public int time = 2;
    private Time timeclass = new Time(this);
    @Override
    public void onEnable() {
        timeclass.getTime();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
