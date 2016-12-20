package com.myththewolf.omnomnom.util;

import org.bukkit.Location;

import com.sk89q.worldedit.CuboidClipboard;
import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.MaxChangedBlocksException;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.bukkit.BukkitUtil;

@SuppressWarnings("deprecation")
public class Schematic {
	
	public boolean pasteSchematic(Location origin, CuboidClipboard schematic) {
	    EditSession editSession = new EditSession(BukkitUtil.getLocalWorld(origin.getWorld()), -1); //-1 means no limit on blocks
	    try {
	        schematic.paste(editSession, new Vector(origin.getBlockX(), origin.getBlockY(), origin.getBlockZ()), true); // The 'true' boolean is whether or not to paste for air
	    } catch (MaxChangedBlocksException ignored) {
	        return false;
	    }
	    return true;
	}
}
