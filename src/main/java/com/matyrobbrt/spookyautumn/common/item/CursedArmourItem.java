package com.matyrobbrt.spookyautumn.common.item;

import java.util.Random;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CursedArmourItem extends ArmorItem {

	public static Random rand = new Random();

	public CursedArmourItem(ArmorMaterial pMaterial, EquipmentSlot pSlot, Properties pProperties) {
		super(pMaterial, pSlot, pProperties);
	}

	@Override
	public void onArmorTick(ItemStack stack, Level world, Player player) {
		EquipmentSlot equipSlot = getEquipmentSlot(stack);
		switch (equipSlot) {
		case HEAD:
			helmetTick(stack, world, player);
		default:
			break;
		}
	}

	public void helmetTick(ItemStack stack, Level world, Player player) {
		if (rand.nextInt(120) == 5) {
			Creeper creeper = new Creeper(EntityType.CREEPER, world);
			creeper.setPos(player.getX(), player.getY(), player.getZ());
			world.addFreshEntity(creeper);
		}
	}

}
