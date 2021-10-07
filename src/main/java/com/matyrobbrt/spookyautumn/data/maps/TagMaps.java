package com.matyrobbrt.spookyautumn.data.maps;

import static com.matyrobbrt.spookyautumn.core.init.BlockInit.*;

import net.minecraft.world.level.block.Block;

public class TagMaps {

	public static final Block[] AXE_MINEABLE_BLOCKS = newBlockArray(SPOOKY_PUMPKIN.get(), MAPLE_LOG.get(),
			MAPLE_PLANKS.get(), MAPLE_WOOD.get(), STRIPPED_MAPLE_LOG.get(), STRIPPED_MAPLE_WOOD.get(), BEECH_LOG.get(),
			BEECH_PLANKS.get(), BEECH_WOOD.get(), STRIPPED_BEECH_LOG.get(), STRIPPED_BEECH_WOOD.get(),
			HICKORY_LOG.get(), HICKORY_WOOD.get(), STRIPPED_HICKORY_LOG.get(), STRIPPED_HICKORY_WOOD.get());

	public static final Block[] LOGS = newBlockArray(MAPLE_LOG.get(), BEECH_LOG.get(), HICKORY_LOG.get());
	public static final Block[] BURNABLE_LOGS = newBlockArray(MAPLE_LOG.get(), BEECH_LOG.get(), HICKORY_LOG.get());

	public static final Block[] PLANKS = newBlockArray(MAPLE_PLANKS.get(), BEECH_PLANKS.get(), HICKORY_PLANKS.get());

	public static final Block[] LEAVES = newBlockArray(AUTUMN_MAPLE_LEAVES.get(), AUTUMN_BEECH_LEAVES.get(),
			AUTUMN_HICKORY_LEAVES.get(), AUTUMN_OAK_LEAVES.get(), AUTUMN_BIRCH_LEAVES.get());

	public static Block[] newBlockArray(Block... blocks) {
		return blocks;
	}

}
