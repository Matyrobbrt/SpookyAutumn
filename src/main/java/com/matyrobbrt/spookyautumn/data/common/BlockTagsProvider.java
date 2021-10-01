package com.matyrobbrt.spookyautumn.data.common;

import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.data.DataGenerator;

import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagsProvider extends net.minecraft.data.tags.BlockTagsProvider {

	public BlockTagsProvider(DataGenerator pGenerator, ExistingFileHelper existingFileHelper) {
		super(pGenerator, SpookyAutumn.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags() {
		
	}

}
