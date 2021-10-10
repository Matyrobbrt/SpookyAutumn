package com.matyrobbrt.spookyautumn.core.world.gen;

import java.util.Random;
import java.util.Set;

import com.matyrobbrt.spookyautumn.common.block.trees.MapleTree;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class TreeGeneration {

	public static void generateTrees(final BiomeLoadingEvent event) {
		MapleTree mapleTree = new MapleTree();
		Random random = new Random();
		
		ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);
		
		if(types.contains());
	}
}
