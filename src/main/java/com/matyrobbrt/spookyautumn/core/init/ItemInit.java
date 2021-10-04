package com.matyrobbrt.spookyautumn.core.init;

import static com.matyrobbrt.spookyautumn.common.itemgroup.SpookyAutumnItemGroup.SPOOKY_AUTUMN;

import com.google.common.base.Supplier;
import com.matyrobbrt.spookyautumn.SpookyAutumn;
import com.matyrobbrt.spookyautumn.common.item.ModFood;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SpookyAutumn.MOD_ID);

	public static final RegistryObject<Item> SPOOKY_INGOT = register("spooky_ingot",
			() -> new Item(new Item.Properties().tab(SPOOKY_AUTUMN)));

	public static final RegistryObject<Item> CANDY_BAR = register("candy_bar",
			() -> new ModFood(new Item.Properties().tab(SPOOKY_AUTUMN)
					.food(new FoodProperties.Builder().saturationMod(3.0f).nutrition(5).build()))
							.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 1)));

	public static RegistryObject<Item> register(final String name, final Supplier<? extends Item> sup) {
		return ITEMS.register(name, sup);
	}

}
