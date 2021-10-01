package com.matyrobbrt.spookyautumn.core.init;

import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SpookyAutumn.MOD_ID);

}
