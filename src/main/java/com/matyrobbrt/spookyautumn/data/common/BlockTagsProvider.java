package com.matyrobbrt.spookyautumn.data.common;

import static com.matyrobbrt.spookyautumn.core.init.TagInit.Blocks.LOGS;

import com.matyrobbrt.spookyautumn.SpookyAutumn;
import com.matyrobbrt.spookyautumn.core.init.BlockInit;
import com.matyrobbrt.spookyautumn.core.init.TagInit.Blocks;
import com.matyrobbrt.spookyautumn.data.maps.TagMaps;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsProvider extends net.minecraft.data.tags.BlockTagsProvider {

	public BlockTagsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
		super(pGenerator, SpookyAutumn.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags() {

		tag(Blocks.AXE_MINABLE).add(TagMaps.AXE_MINEABLE_BLOCKS);
		
		tag(Blocks.PICKAXE_MINABLE).add(BlockInit.SPOOKY_BLOCK.get());

		tag(Blocks.WOOD_MINING_LEVEL).add(BlockInit.SPOOKY_PUMPKIN.get()).add(BlockInit.SPOOKY_BLOCK.get());

		tag(LOGS).add(TagMaps.LOGS);

	}

}
