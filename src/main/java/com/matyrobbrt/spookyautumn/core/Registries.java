package com.matyrobbrt.spookyautumn.core;

import net.minecraftforge.eventbus.api.IEventBus;

import static com.matyrobbrt.spookyautumn.SpookyAutumn.LOGGER;

import com.matyrobbrt.spookyautumn.core.init.ArmourToolsInit;
import com.matyrobbrt.spookyautumn.core.init.BlockInit;
import com.matyrobbrt.spookyautumn.core.init.FoodInit;
import com.matyrobbrt.spookyautumn.core.init.ItemInit;

public class Registries {
	
	public static void init(IEventBus modEventBus) {
		
		BlockInit.BLOCKS.register(modEventBus);
		LOGGER.info("Blocks Loaded");
		ItemInit.ITEMS.register(modEventBus);
		FoodInit.ITEMS.register(modEventBus);
		ArmourToolsInit.ITEMS.register(modEventBus);
		LOGGER.info("Items Loaded");
		
	}

}
