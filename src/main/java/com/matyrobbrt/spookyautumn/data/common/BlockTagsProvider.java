package com.matyrobbrt.spookyautumn.data.common;

import com.matyrobbrt.spookyautumn.SpookyAutumn;
import com.matyrobbrt.spookyautumn.core.init.BlockInit;
import com.matyrobbrt.spookyautumn.core.init.TagInit.Blocks;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsProvider extends net.minecraft.data.tags.BlockTagsProvider {

	public BlockTagsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
		super(pGenerator, SpookyAutumn.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		tag(Blocks.AXE_MINABLE).add(BlockInit.SPOOKY_PUMPKIN.get());
		tag(Blocks.WOOD_MINING_LEVEL).add(BlockInit.SPOOKY_PUMPKIN.get());
	}

}
