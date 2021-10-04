package com.matyrobbrt.spookyautumn.core.util;

import java.util.HashMap;

import com.matyrobbrt.spookyautumn.core.init.BlockInit;

import net.minecraft.world.level.block.Block;

public class StrippingMap {
	
	public static final HashMap<Block, Block> STRIPPING_MAP = new HashMap<>();

	public static void registerStrippables() {
		STRIPPING_MAP.put(BlockInit.MAPLE_LOG.get(), BlockInit.STRIPPED_MAPLE_LOG.get());
		STRIPPING_MAP.put(BlockInit.MAPLE_WOOD.get(), BlockInit.STRIPPED_MAPLE_WOOD.get());
		STRIPPING_MAP.put(BlockInit.BEECH_LOG.get(), BlockInit.STRIPPED_BEECH_LOG.get());
		STRIPPING_MAP.put(BlockInit.BEECH_WOOD.get(), BlockInit.STRIPPED_BEECH_WOOD.get());
	}

}
