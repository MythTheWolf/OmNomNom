package com.myththewolf.omnomnom.event;

import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

public class LoadChunk implements Listener{
	@EventHandler
	public void onChunkLoad(ChunkLoadEvent e)
	{
		Random r = new Random();
		Chunk[] chunks = e.getWorld().getLoadedChunks();
		for(int ii = 0; ii < 10; ii++) {
		int i = r.nextInt(chunks.length);
		Chunk c = chunks[i];
		int x = r.nextInt(16);
		int z = r.nextInt(16);
		Location loc = new Location(e.getWorld(), c.getX() * 16 + x, 160, c.getZ() * 16 + z);
		System.out.println(loc);
		}
	}
}
