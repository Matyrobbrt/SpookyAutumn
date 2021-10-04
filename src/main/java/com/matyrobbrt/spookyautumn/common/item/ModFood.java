package com.matyrobbrt.spookyautumn.common.item;

import java.util.ArrayList;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModFood extends Item {

	public ArrayList<MobEffectInstance> effects = new ArrayList<>();

	public ModFood(Properties pProperties) {
		super(pProperties);
	}

	/**
	 * Add an effect instance to the food
	 * @param effect the effect to add
	 * @return
	 */
	public ModFood addEffect(MobEffectInstance effect) {
		this.effects.add(effect);
		return this;
	}

	public ArrayList<MobEffect> getMobEffects() {
		ArrayList<MobEffect> mobEffects = new ArrayList<>();
		this.effects.forEach(effect -> {
			mobEffects.add(effect.getEffect());
		});
		return mobEffects;
	}

	public boolean playerNeedsAddingEffect(Player player) {
		boolean needsAdding = false;
		for (int i = 0; i <= getMobEffects().size() - 1; i++) {
			if (!player.hasEffect(getMobEffects().get(i)))
				needsAdding = true;
		}
		return needsAdding;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

		if (!playerNeedsAddingEffect(pPlayer))
			return InteractionResultHolder.fail(pPlayer.getItemInHand(pUsedHand));

		return super.use(pLevel, pPlayer, pUsedHand);
	}

	@Override
	public ItemStack finishUsingItem(ItemStack pStack, Level pLevel, LivingEntity pLivingEntity) {

		if (pLivingEntity instanceof Player) {
			Player player = (Player) pLivingEntity;
			this.effects.forEach(effect -> {
				if (!player.hasEffect(effect.getEffect()))
					player.addEffect(effect);
			});
		}

		return super.finishUsingItem(pStack, pLevel, pLivingEntity);
	}

}
