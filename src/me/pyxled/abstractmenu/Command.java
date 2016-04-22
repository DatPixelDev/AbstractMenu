package me.pyxled.abstractmenu;

import me.pyxled.abstractmenu.menu.MenuManager;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Pyxled Development 2016 (c)
 * File created: 04/20/2016
 */
public class Command implements CommandExecutor {
    public boolean onCommand(CommandSender cs, org.bukkit.command.Command cmd, String s, String[] args) {
        if(!(cs instanceof Player)){
            return true;
        }
        if(args.length == 0){
            return true;
        } else {
            String menu = args[0];
            if(MenuManager.menuExists(menu)){
                MenuManager.openMenu((Player)cs, menu);
            }
        }
        return true;
    }
}
