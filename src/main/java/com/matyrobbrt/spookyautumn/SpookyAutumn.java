package com.matyrobbrt.spookyautumn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.matyrobbrt.spookyautumn.common.itemgroup.SpookyAutumnItemGroup;
import com.matyrobbrt.spookyautumn.core.init.BlockInit;
import com.matyrobbrt.spookyautumn.core.init.BlockItemInit;
import com.matyrobbrt.spookyautumn.core.init.FeatureInit;
import com.matyrobbrt.spookyautumn.core.init.ItemInit;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * The SpookyAutumn mod
 * 
 * @author matyrobbrt
 * @author ABlackPikatchu
 *
 */
@Mod("spookyautumn")
@Mod.EventBusSubscriber(modid = SpookyAutumn.MOD_ID, bus = Bus.MOD)
public class SpookyAutumn {
	public static final String MOD_ID = "spookyautumn";
	public static final Logger LOGGER = LogManager.getLogger();

	public SpookyAutumn() {
		IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.BLOCKS.register(modBus);
		ItemInit.ITEMS.register(modBus);

		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockItemInit.BLOCKITEM_BLOCKS.forEach(block -> {
			event.getRegistry()
					.register(new BlockItem(block, new Item.Properties().tab(SpookyAutumnItemGroup.SPOOKY_AUTUMN))
							.setRegistryName(block.getRegistryName()));
		});
	}
}
