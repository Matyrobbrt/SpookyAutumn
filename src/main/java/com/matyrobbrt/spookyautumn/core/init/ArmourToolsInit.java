package com.matyrobbrt.spookyautumn.core.init;

import static com.matyrobbrt.spookyautumn.common.itemgroup.SpookyAutumnItemGroup.SPOOKY_AUTUMN;

import com.matyrobbrt.spookyautumn.SpookyAutumn;
import com.matyrobbrt.spookyautumn.common.item.CursedArmourItem;
import com.matyrobbrt.spookyautumn.common.material.ModArmourMaterial;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmourToolsInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SpookyAutumn.MOD_ID);

	public static final RegistryObject<Item> CURSED_HELMET = ITEMS.register("cursed_helmet",
			() -> new CursedArmourItem(ModArmourMaterial.CURSED_ARMOUR, EquipmentSlot.HEAD,
					new Item.Properties().tab(SPOOKY_AUTUMN)));

}
