package com.tscforum.ep3.ep3;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class EP3 extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "Debugger!");
        this.getCommand("test").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        getServer().getConsoleSender().sendMessage(ChatColor.AQUA + "This command works!");
        if(command.getName().equalsIgnoreCase("test")){
            Player player = Bukkit.getPlayer("malikdbuseck");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "You are awesome!!!");
        }
        return true;
    }
}
