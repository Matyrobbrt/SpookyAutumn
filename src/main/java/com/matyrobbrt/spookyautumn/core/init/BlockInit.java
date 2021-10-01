package com.matyrobbrt.spookyautumn.core.init;

import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			SpookyAutumn.MOD_ID);

	public static final RegistryObject<Block> SPOOKY_PUMPKIN = BLOCKS.register("spooky_pumpkin",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)));

}
