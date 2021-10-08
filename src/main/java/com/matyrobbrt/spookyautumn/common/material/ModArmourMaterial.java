package com.matyrobbrt.spookyautumn.common.material;

import java.util.function.Supplier;

import com.matyrobbrt.spookyautumn.core.init.ItemInit;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmourMaterial implements ArmorMaterial {

	CURSED_ARMOUR("cursed_armour", 16, new int[] {
			3, 6, 7, 3
	}, 9, SoundEvents.ARMOR_EQUIP_IRON, 1.0F, 0.1f, () -> Ingredient.of(ItemInit.SPOOKY_INGOT.get()));

	public static final int[] baseDurability = new int[] {
			128, 144, 160, 112
	};
	private final String name;
	private final int durabilityMultiplier;
	private int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	ModArmourMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability, SoundEvent equipSound,
			float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient.get();
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return ModArmourMaterial.baseDurability[slot.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return this.armorVal[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}

	public void setDefenseForSlot(EquipmentSlot slot, int defense) {
		this.armorVal[slot.getIndex()] = defense;
	}

}
