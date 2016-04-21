package me.pyxled.abstractmenu.menu;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Pyxled Development 2016 (c)
 * File created: 04/20/2016
 */
public class MenuManager implements Listener {
    private static MenuManager instance;
    private Map<String, Menu> menus;

    public MenuManager(){
        menus = new HashMap<>();
        if(instance == null){
            instance = new MenuManager();
        }
        registerMenu("example_menu", new ExampleMenu());
    }
    public static MenuManager getInstance(){
        return instance;
    }
    public void registerMenu(String id, Menu menu) {
        menus.put(id, menu);
    }
    public Menu getMenu(String id){
        return menus.get(id);
    }
    public void openMenu(Player p, String id){
        p.openInventory(getMenu(id).inv);
    }
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (((e.getWhoClicked() instanceof Player)) && (e.getInventory().getName() != null) && (e.getCurrentItem() != null)) {
            for (Menu m : menus.values()) {
                if (e.getInventory().getName().equals(m.inv.getName())) {
                    m.click(e.getCurrentItem(), (Player) e.getWhoClicked());
                    e.setCancelled(true);
                }
            }
        }
    }
}
