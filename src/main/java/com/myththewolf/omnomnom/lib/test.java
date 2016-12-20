package com.myththewolf.omnomnom.lib;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class test implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3)
	{
		Player p = (Player) arg0;
		p.getInventory().addItem(Skull("MythTheWolf","test",3));
		p.setFoodLevel(3);
		return true;
	}
	
	public static ItemStack Skull(String skullOwner, String displayName, int quantity) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, quantity, (short) SkullType.PLAYER.ordinal());
        SkullMeta SM = (SkullMeta) skull.getItemMeta();
        SM.setOwner(skullOwner);
        skull.setItemMeta(SM);
        return skull;

    }
}
