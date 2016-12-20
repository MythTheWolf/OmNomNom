package com.myththewolf.omnomnom.lib;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Skull {
	public ItemStack HAMBURGER;
	public ItemStack TACO;
	public ItemStack SUSHI;
	public ItemStack PANCAKES;
	public ItemStack CORN;
	public ItemStack POPCORN;
	public Skull()
	{
		 	HAMBURGER = this.GetSkull("simbasbestbud","Hamburger",1);
		 	TACO = this.GetSkull("Crunchy_Taco34","Crunchy Taco",1);
		 	SUSHI = this.GetSkull("lmaoki", "Raw Sushi", 1);
		 	PANCAKES = this.GetSkull("Weed_Pancakes", "Fluffy Pancakes", 1);
		 	CORN = this.GetSkull("theCornyJoke", "Corn on the cob", 1);
		 	POPCORN = this.GetSkull("ZachWarnerHD", "Popcorn!", 1);
		 	
	}
	
	public ItemStack GetSkull(String skullOwner, String displayName, int quantity) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1,(short) SkullType.PLAYER.ordinal());
        SkullMeta SM = (SkullMeta) skull.getItemMeta();
        SM.setOwner(skullOwner);
        SM.setDisplayName(displayName);
        SM.setLore(Arrays.asList(displayName));
        skull.setItemMeta(SM);
        return skull;
	}
}
