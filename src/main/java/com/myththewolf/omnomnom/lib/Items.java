package com.myththewolf.omnomnom.lib;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Items {
	public static final HashMap<ItemStack,Integer> items = new HashMap<ItemStack,Integer>();
	public static final List<ShapedRecipe> itemC = new ArrayList<ShapedRecipe>();
	
	public static void makeRecipies()
	{
		
	    Skull skull = new Skull();  
	addRecipie(3, "CCC", "BAB", "CCC", skull.HAMBURGER, Material.COOKED_BEEF, Material.BREAD, Material.AIR);
	addRecipie(2, "CCC", "BAB", "CCC", skull.TACO, Material.COOKED_BEEF, Material.WHEAT, Material.AIR);
	addRecipie(2, "CCC","BAB","CCC", skull.SUSHI, Material.RAW_FISH, Material.WATER_LILY, Material.AIR);	
	addRecipie(2, "AAA","BBB","CCC", skull.PANCAKES, Material.SUGAR, Material.MILK_BUCKET,Material.WHEAT);
	addRecipie(0, "CBC","CAC","CCC", skull.CORN, Material.STICK,Material.WHEAT,Material.AIR);
	addRecipie(4, "AAA","BBB","CCC", skull.POPCORN, Material.AIR,Material.WHEAT,Material.LAVA_BUCKET);
	}
	public static void addRecipie(int hung,String patA, String patB, String patC, ItemStack out, Material a, Material b, Material c)
	{
		ShapedRecipe rec = new ShapedRecipe(out);
		rec.shape(patA,patB,patC);
		rec.setIngredient('A', a);
		rec.setIngredient('B', b);
		rec.setIngredient('C', c);
		items.put(out, hung);
		Bukkit.getServer().addRecipe(rec);
	}
}
