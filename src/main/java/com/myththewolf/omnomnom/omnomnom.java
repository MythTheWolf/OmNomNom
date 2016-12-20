package com.myththewolf.omnomnom;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.myththewolf.omnomnom.event.RightClickEvent;
import com.myththewolf.omnomnom.lib.Items;
import com.myththewolf.omnomnom.lib.test;

public class omnomnom extends JavaPlugin {

	public void onEnable()
	{
		getCommand("test").setExecutor(new test());
		Bukkit.getServer().getPluginManager().registerEvents(new RightClickEvent(), this);
		Items.makeRecipies();
	}

	
}
