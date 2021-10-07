package com.matyrobbrt.spookyautumn.client.render;

import com.matyrobbrt.spookyautumn.core.init.BlockInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;


public class RenderLayers {
	
	public static void setRenderLayers() {
		ItemBlockRenderTypes.setRenderLayer(BlockInit.AUTUMN_MAPLE_LEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.AUTUMN_HICKORY_LEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.AUTUMN_BEECH_LEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.AUTUMN_OAK_LEAVES.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(BlockInit.AUTUMN_BIRCH_LEAVES.get(), RenderType.cutout());
	}
	
}
