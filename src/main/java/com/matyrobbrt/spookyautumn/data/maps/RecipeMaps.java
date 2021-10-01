package com.matyrobbrt.spookyautumn.data.maps;

import java.util.HashMap;

import com.matyrobbrt.spookyautumn.core.init.BlockInit;
import com.matyrobbrt.spookyautumn.core.init.ItemInit;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RecipeMaps {
	
	public static HashMap<Block, Item> addBlockIngot() {
		HashMap<Block, Item> map = new HashMap<>();
		map.put(BlockInit.SPOOKY_BLOCK.get(), ItemInit.SPOOKY_INGOT.get());
		return map;
	}

}
