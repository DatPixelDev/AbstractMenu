package me.pyxled.abstractmenu.menu;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Pyxled Development 2016 (c)
 * File created: 04/20/2016
 */
public abstract class Menu {
    public Inventory inv;

    public Menu(String name, int size)
    {
        this.inv = Bukkit.createInventory(null, size, name);
        registerItems();
    }

    public Menu(String name, InventoryType type)
    {
        this.inv = Bukkit.createInventory(null, type, name);
        registerItems();
    }
    public void putItem(int slot, ItemStack is, String name, String... lore){
        ItemMeta m = is.getItemMeta();
        m.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> newlore = new ArrayList<>();
        for(String s : lore){
            newlore.add(ChatColor.translateAlternateColorCodes('&', s));
        }
        m.setLore(newlore);
        is.setItemMeta(m);
        inv.setItem(slot, is);
    }

    public abstract void registerItems();

    public abstract void click(ItemStack item, Player player);
}
