package com.matyrobbrt.spookyautumn.core.util;

import com.matyrobbrt.spookyautumn.core.init.BlockInit;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.level.block.Block;
import java.util.Map;

public class StrippingMap {
	
	public static void createStrippable(Block input, Block output) {
		AxeItem.STRIPPABLES = Map.copyOf(AxeItem.STRIPPABLES);
		AxeItem.STRIPPABLES.put(input, output);
	}

	public static void registerStrippables() {
		createStrippable(BlockInit.MAPLE_LOG.get(), BlockInit.STRIPPED_MAPLE_LOG.get());
		createStrippable(BlockInit.MAPLE_WOOD.get(), BlockInit.STRIPPED_MAPLE_WOOD.get());
	}

}
