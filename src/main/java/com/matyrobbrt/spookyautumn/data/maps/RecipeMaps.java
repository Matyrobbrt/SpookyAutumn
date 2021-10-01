package com.matyrobbrt.spookyautumn.data.maps;

import static com.matyrobbrt.spookyautumn.core.init.BlockInit.SPOOKY_BLOCK;
import static com.matyrobbrt.spookyautumn.core.init.ItemInit.SPOOKY_INGOT;

import java.util.HashMap;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RecipeMaps {
	
	public static HashMap<Block, Item> addBlockIngot() {
		HashMap<Block, Item> map = new HashMap<>();
		map.put(SPOOKY_BLOCK.get(), SPOOKY_INGOT.get());
		return map;
	}

}
