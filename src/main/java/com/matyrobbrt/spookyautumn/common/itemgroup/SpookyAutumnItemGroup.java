package com.matyrobbrt.spookyautumn.common.itemgroup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class SpookyAutumnItemGroup extends CreativeModeTab {

	public static final SpookyAutumnItemGroup SPOOKY_AUTUMN = new SpookyAutumnItemGroup(CreativeModeTab.TABS.length,
			"spookyautumn");

	public SpookyAutumnItemGroup(int pId, String pLangId) {
		super(pId, pLangId);
	}

	@Override
	public ItemStack makeIcon() {
		return ItemStack.EMPTY;
	}

}
