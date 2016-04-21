package me.pyxled.abstractmenu;

import me.pyxled.abstractmenu.menu.MenuManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Pyxled Development 2016 (c)
 * File created: 04/20/2016
 */
public class AbstractMenu extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new MenuManager(), this);
        getCommand("inv").setExecutor(new Command());
    }
}
