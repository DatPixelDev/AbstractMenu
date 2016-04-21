package me.pyxled.abstractmenu.menu;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Pyxled Development 2016 (c)
 * File created: 04/20/2016
 */
public class ExampleMenu extends Menu {

    public ExampleMenu() {
        super("Example Menu", 54);
    }

    public void registerItems() {
        putItem(0, new ItemStack(Material.COMPASS), "&e&lCompass", "&7Points to your spawnpoint.");
        putItem(2, new ItemStack(Material.GOLDEN_APPLE), "&6&lGolden Apple", "&7Regenerates your health", "&7faster than usual");
    }

    public void click(ItemStack item, Player player) {
        if(item.hasItemMeta()){
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7You clicked " + item.getItemMeta().getDisplayName() +"&7!"));
        }
    }
}
