package com.matyrobbrt.spookyautumn.common.item;

import java.util.ArrayList;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModFood extends Item {

	public ArrayList<MobEffectInstance> effects;

	public ModFood(Properties pProperties) {
		super(pProperties);
	}

	public ModFood addEffect(MobEffectInstance effect) {
		this.effects.add(effect);
		return this;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {

		this.effects.forEach(effect -> {
			if (!pPlayer.hasEffect(effect.getEffect()))
				pPlayer.getItemInHand(pUsedHand).getOrCreateTag().putBoolean("noCancel", true);
		});

		if (pPlayer.getItemInHand(pUsedHand).getOrCreateTag().getBoolean("noCancel"))
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
