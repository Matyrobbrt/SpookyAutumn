package com.matyrobbrt.spookyautumn.core.init;

import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.level.block.Block;

public class TagInit {

	public static class Blocks {
		
		public static final Tag.Named<Block> PICKAXE_MINABLE = minecraft("mineable/pickaxe");
		public static final Tag.Named<Block> AXE_MINABLE = minecraft("mineable/axe");
		
		public static final Tag.Named<Block> WOOD_MINING_LEVEL = forge("needs_wood_tool");
		public static final Tag.Named<Block> STONE_MINING_LEVEL = minecraft("needs_stone_tool");
		public static final Tag.Named<Block> IRON_MINING_LEVEL = minecraft("needs_iron_tool");
		
		public static final Tag.Named<Block> LOGS = minecraft("logs");
		public static final Tag.Named<Block> PLANKS = minecraft("planks");
		public static final Tag.Named<Block> LEAVES = minecraft("leaves");
		public static final Tag.Named<Block> LOGS_THAT_BURN = minecraft("logs_that_burn");
		public static final Tag.Named<Block> SAPLINGS = minecraft("saplings");
		
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
