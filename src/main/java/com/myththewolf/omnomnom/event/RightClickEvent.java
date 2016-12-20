package com.myththewolf.omnomnom.event;

import java.util.Map;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import com.myththewolf.omnomnom.lib.Items;

public class RightClickEvent implements Listener {
	@EventHandler

	public void onInteractEvent(PlayerInteractEvent e)
	{

		Action a = e.getAction();
		if (a == Action.LEFT_CLICK_AIR || a == Action.LEFT_CLICK_BLOCK)
			return;
		if (e.getPlayer().getInventory().getItemInMainHand().getType() == Material.AIR
				|| e.getPlayer().getInventory().getItemInMainHand().getType() == null)
		{
			return;
		}
		if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore() == false)
		{
			return;
		}
		if (a == Action.RIGHT_CLICK_BLOCK || a == Action.RIGHT_CLICK_AIR)
		{
			String SERV = "";
			String PLAY = "";
		
			Items.items.entrySet().iterator();
			for (Map.Entry<ItemStack, Integer> entry : Items.items.entrySet())
			{
				SERV = entry.getKey().getItemMeta().getLore().get(0).toString();
				PLAY = e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().get(0).toString();
				if (SERV.equals(PLAY))
				{
				
					ItemStack stack = e.getPlayer().getInventory().getItemInMainHand();
					int food = e.getPlayer().getFoodLevel();
					e.getPlayer().setFoodLevel(food + entry.getValue());
					 if (stack.getAmount() > 1) {
						 e.getPlayer().getInventory().getItemInMainHand().setAmount(stack.getAmount()-1);
						 e.setCancelled(true);
						 return;
					 }else{
						 e.getPlayer().getInventory().remove(e.getPlayer().getInventory().getItemInMainHand());
						 e.setCancelled(true);
						 return;
					 }
					
				}
			}

		}
	}
}
