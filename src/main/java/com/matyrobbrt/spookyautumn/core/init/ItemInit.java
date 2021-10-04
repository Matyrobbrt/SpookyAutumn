package com.matyrobbrt.spookyautumn.core.init;

import static com.matyrobbrt.spookyautumn.common.itemgroup.SpookyAutumnItemGroup.SPOOKY_AUTUMN;

import com.google.common.base.Supplier;
import com.matyrobbrt.spookyautumn.SpookyAutumn;

import net.minecraft.world.item.Item;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SpookyAutumn.MOD_ID);

	public static final RegistryObject<Item> SPOOKY_INGOT = register("spooky_ingot",
			() -> new Item(new Item.Properties().tab(SPOOKY_AUTUMN)));


	public static RegistryObject<Item> register(final String name, final Supplier<? extends Item> sup) {
		return ITEMS.register(name, sup);
	}

}
