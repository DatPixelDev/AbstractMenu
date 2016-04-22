package me.pyxled.abstractmenu.menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Pyxled Development 2016 (c)
 * File created: 04/21/2016
 */
public class GiveMenu extends Menu {
    public GiveMenu() {
        super("Give Menu", 54);
    }

    public void registerItems() {
        putItem(0, new ItemStack(Material.BEDROCK, 1), "&0&lBedrock", "&7Click to receive this item.");
        putItem(0, new ItemStack(Material.GRASS, 1), "&a&lGrass", "&7Click to receive this item.");
        putItem(0, new ItemStack(Material.GOLDEN_APPLE, 1, (short)1), "&6&lGolden Apple", "&7Click to receive this item.");
        putItem(0, new ItemStack(Material.STONE, 1), "&7&lStone", "&7Click to receive this item.");
        putItem(0, new ItemStack(Material.EXP_BOTTLE, 1), "&2&lEXP Bottles", "&7Click to receive this item.");
        putItem(0, new ItemStack(Material.DIAMOND, 1), "&b&lDiamond", "&7Click to receive this item.");
    }

    public void click(ItemStack item, Player player) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7You received " + item.getItemMeta().getDisplayName() + "&7!"));
        player.getInventory().addItem(item);
    }
}
