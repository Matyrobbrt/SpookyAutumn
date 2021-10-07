package com.matyrobbrt.spookyautumn.core.init;

import com.google.common.base.Supplier;
import com.matyrobbrt.spookyautumn.SpookyAutumn;
import com.matyrobbrt.spookyautumn.common.block.trees.AutumnBirchTree;
import com.matyrobbrt.spookyautumn.common.block.trees.AutumnOakTree;
import com.matyrobbrt.spookyautumn.common.block.trees.BeechTree;
import com.matyrobbrt.spookyautumn.common.block.trees.HickoryTree;
import com.matyrobbrt.spookyautumn.common.block.trees.MapleTree;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
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

	// Trees
	// Maple
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
	
	public static final RegistryObject<Block> AUTUMN_MAPLE_LEAVES = BLOCKS.register("autumn_maple_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));

	public static final RegistryObject<Block> MAPLE_SAPLING = BLOCKS.register("maple_sapling",
			() -> new SaplingBlock(new MapleTree(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	// Beech
	public static final RegistryObject<Block> BEECH_LOG = BLOCKS.register("beech_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

	public static final RegistryObject<Block> BEECH_WOOD = BLOCKS.register("beech_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

	public static final RegistryObject<Block> STRIPPED_BEECH_LOG = BLOCKS.register("stripped_beech_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

	public static final RegistryObject<Block> STRIPPED_BEECH_WOOD = BLOCKS.register("stripped_beech_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

	public static final RegistryObject<Block> BEECH_PLANKS = BLOCKS.register("beech_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
	
	public static final RegistryObject<Block> AUTUMN_BEECH_LEAVES = BLOCKS.register("autumn_beech_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));

	public static final RegistryObject<Block> BEECH_SAPLING = BLOCKS.register("beech_sapling",
			() -> new SaplingBlock(new BeechTree(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	// Hickory
	public static final RegistryObject<Block> HICKORY_LOG = BLOCKS.register("hickory_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

	public static final RegistryObject<Block> HICKORY_WOOD = BLOCKS.register("hickory_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));

	public static final RegistryObject<Block> STRIPPED_HICKORY_LOG = BLOCKS.register("stripped_hickory_log",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));

	public static final RegistryObject<Block> STRIPPED_HICKORY_WOOD = BLOCKS.register("stripped_hickory_wood",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

	public static final RegistryObject<Block> HICKORY_PLANKS = BLOCKS.register("hickory_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

	public static final RegistryObject<Block> AUTUMN_HICKORY_LEAVES = BLOCKS.register("autumn_hickory_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));

	public static final RegistryObject<Block> HICKORY_SAPLING = BLOCKS.register("hickory_sapling",
			() -> new SaplingBlock(new HickoryTree(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
	
	//Oak
	public static final RegistryObject<Block> AUTUMN_OAK_LEAVES = BLOCKS.register("autumn_oak_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));

	public static final RegistryObject<Block> AUTUMN_OAK_SAPLING = BLOCKS.register("autumn_oak_sapling",
			() -> new SaplingBlock(new AutumnOakTree(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
	
	//Birch
	public static final RegistryObject<Block> AUTUMN_BIRCH_LEAVES = BLOCKS.register("autumn_birch_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion()));

	public static final RegistryObject<Block> AUTUMN_BIRCH_SAPLING = BLOCKS.register("autumn_birch_sapling",
			() -> new SaplingBlock(new AutumnBirchTree(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static RegistryObject<Block> register(final String name, final Supplier<? extends Block> sup) {
		return BLOCKS.register(name, sup);
	}

}
