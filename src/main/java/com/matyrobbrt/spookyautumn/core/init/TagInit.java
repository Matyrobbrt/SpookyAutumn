package com.matyrobbrt.spookyautumn.core.init;

import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;

public class TagInit {

	public static class Blocks {
		
		public static final Tag.Named<Block> PICKAXE_MINABLE = minecraft("mineable/pickaxe");
		
		public static final Tag.Named<Block> IRON_MINING_LEVEL = minecraft("needs_iron_tool");
		
		public static Tag.Named<Block> forge(String path) {
			return BlockTags.bind(new ResourceLocation("forge", path).toString());
		}
		
		public static Tag.Named<Block> minecraft(String path) {
			return BlockTags.bind(new ResourceLocation("minecraft", path).toString());
		}

		public static Tag.Named<Block> mod(String path) {
			return BlockTags.bind(new ResourceLocation(SpookyAutumn.MOD_ID, path).toString());
		}
	}
	
}
