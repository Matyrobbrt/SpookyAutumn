package com.matyrobbrt.spookyautumn.core.init;

import com.google.common.base.Supplier;
import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			SpookyAutumn.MOD_ID);

	public static final RegistryObject<Block> SPOOKY_PUMPKIN = BLOCKS.register("spooky_pumpkin",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)));

	public static final RegistryObject<Block> SPOOKY_BLOCK = BLOCKS.register("spooky_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

	public static final RegistryObject<Block> SPOOKY_ORE = register("spooky_ore",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
	
	
	//Trees
	public static final RegistryObject<Block> MAPLE_LOG = BLOCKS.register("maple_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
	
	public static final RegistryObject<Block> MAPLE_WOOD = BLOCKS.register("maple_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
	
	public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = BLOCKS.register("stripped_maple_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
	
	public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = BLOCKS.register("stripped_maple_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
	
	public static final RegistryObject<Block> MAPLE_PLANKS = BLOCKS.register("maple_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	
	
	

	public static RegistryObject<Block> register(final String name, final Supplier<? extends Block> sup) {
		return BLOCKS.register(name, sup);
	}

}
