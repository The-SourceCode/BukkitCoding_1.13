package com.tsc.ep11;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MyEvents implements Listener {

    @EventHandler
    public void blockbreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();

        if (block.getType().equals(Material.DIAMOND_ORE)) {
            ItemStack itemStack = new ItemStack(Material.DIAMOND, 2);
            ItemMeta meta = itemStack.getItemMeta();
            meta.setDisplayName(ChatColor.AQUA + "Diamond");

            List<String> lore = new ArrayList<>();
            lore.add("This is a dimamond!");
            lore.add(ChatColor.GREEN + "Value: $10");

            meta.setLore(lore);
            itemStack.setItemMeta(meta);
            player.getInventory().addItem(itemStack);
        }
    }
}
