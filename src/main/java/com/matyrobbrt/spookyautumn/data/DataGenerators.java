package com.matyrobbrt.spookyautumn.data;

import com.matyrobbrt.spookyautumn.SpookyAutumn;
import com.matyrobbrt.spookyautumn.data.common.BlockTagsProvider;
import com.matyrobbrt.spookyautumn.data.common.RecipeProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = SpookyAutumn.MOD_ID, bus = Bus.MOD)
public class DataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		
		BlockTagsProvider blockTags = new BlockTagsProvider(gen, existingFileHelper);
		gen.addProvider(blockTags);
		//gen.addProvider(new ItemTagsProvider(gen, blockTags, existingFileHelper));
		
		gen.addProvider(new RecipeProvider(gen));
	}

}
