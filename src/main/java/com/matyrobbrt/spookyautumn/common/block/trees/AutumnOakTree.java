package com.matyrobbrt.spookyautumn.common.block.trees;

import java.util.Random;

import com.matyrobbrt.spookyautumn.core.world.gen.ConfiguredFeatures;

import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;

public class AutumnOakTree extends AbstractTreeGrower{

	@Override
	protected ConfiguredFeature<TreeConfiguration, ?> getConfiguredFeature(Random pRandom, boolean pLargeHive) {
		return ConfiguredFeatures.AUTUMN_OAK;
	}

}
