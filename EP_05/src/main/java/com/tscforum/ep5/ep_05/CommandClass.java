package com.tscforum.ep5.ep_05;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandClass implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("healme")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (args.length < 1) {
                    player.sendMessage(ChatColor.RED + "Please include how much you want to be healed by");
                    return true;
                } else if (args.length == 1) {
                    try {
                        double phealth = player.getHealth();
                        double addhealth = Double.parseDouble(args[0]);
                        if (phealth < 20) {
                            player.setHealth(phealth + addhealth);
                            player.sendMessage(ChatColor.GRAY + "You have been healed for " +
                                    ChatColor.GREEN + addhealth + " health");
                            return true;
                        } else {
                            player.sendMessage(ChatColor.YELLOW + "If you take some damage...i could heal you!");
                            return true;
                        }
                    } catch (NumberFormatException e) {
                        player.sendMessage(ChatColor.RED + "Please input a real number!");
                        return true;
                    }
                }

            } else {
                sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
            }
        }
        return true;
    }
}
