package com.matyrobbrt.spookyautumn.data.common;

import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;

import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemTagsProvider extends net.minecraft.data.tags.ItemTagsProvider {

	public ItemTagsProvider(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider,
			ExistingFileHelper existingFileHelper) {
		super(pGenerator, pBlockTagsProvider, SpookyAutumn.MOD_ID, existingFileHelper);
	}

}
