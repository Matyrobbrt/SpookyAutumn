package com.matyrobbrt.spookyautumn.common.events;

import com.matyrobbrt.spookyautumn.SpookyAutumn;
import com.matyrobbrt.spookyautumn.core.util.StrippingMap;

import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;

import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SpookyAutumn.MOD_ID)
public class PlayerEvents {

	@SuppressWarnings("resource")
	@SubscribeEvent
	public static void handleStripping(PlayerInteractEvent.RightClickBlock event) {
		ItemStack axe = event.getItemStack();
		Player player = event.getPlayer();
		BlockPos blockpos = event.getHitVec().getBlockPos();
		if (axe.getItem() instanceof AxeItem) {
			BlockState clickedBlock = event.getWorld().getBlockState(blockpos);
			if (StrippingMap.STRIPPING_MAP.containsKey(clickedBlock.getBlock())) {
				event.getWorld().setBlockAndUpdate(blockpos,
						StrippingMap.STRIPPING_MAP.get(clickedBlock.getBlock()).defaultBlockState()
								.setValue(RotatedPillarBlock.AXIS, clickedBlock.getValue(RotatedPillarBlock.AXIS)));
				player.level.playSound(player, blockpos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);

				if (player != null) {
					axe.hurtAndBreak(1, player, (p_150686_) -> {
						p_150686_.broadcastBreakEvent(event.getHand());
					});
				}
				Minecraft.getInstance().gameRenderer.displayItemActivation(axe);
				return;
			}
		}
	}

}
