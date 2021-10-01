package com.matyrobbrt.spookyautumn.core.init;

import com.google.common.base.Supplier;
import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.world.item.Item;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SpookyAutumn.MOD_ID);
	
	public static RegistryObject<Item> register(final String name, final Supplier<? extends Item> sup) {
		return ITEMS.register(name, sup);
	}

}
