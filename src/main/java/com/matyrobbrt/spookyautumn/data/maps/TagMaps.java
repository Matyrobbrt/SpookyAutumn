package com.matyrobbrt.spookyautumn.data.maps;

import static com.matyrobbrt.spookyautumn.core.init.BlockInit.*;

import net.minecraft.world.level.block.Block;

public class TagMaps {

	public static final Block[] AXE_MINEABLE_BLOCKS = newBlockArray(SPOOKY_PUMPKIN.get(), MAPLE_LOG.get(),
			MAPLE_PLANKS.get(), MAPLE_WOOD.get(), STRIPPED_MAPLE_LOG.get(), STRIPPED_MAPLE_WOOD.get(), BEECH_LOG.get(),
			BEECH_PLANKS.get(), BEECH_WOOD.get(), STRIPPED_BEECH_LOG.get(), STRIPPED_BEECH_WOOD.get());

	public static Block[] newBlockArray(Block... blocks) {
		return blocks;
	}

}
