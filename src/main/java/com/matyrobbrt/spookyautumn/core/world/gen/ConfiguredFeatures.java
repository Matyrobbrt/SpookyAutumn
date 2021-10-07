package com.matyrobbrt.spookyautumn.core.world.gen;

import com.matyrobbrt.spookyautumn.core.init.BlockInit;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class ConfiguredFeatures {

	public static final ConfiguredFeature<TreeConfiguration, ?> MAPLE = register("maple",
			Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(
					new SimpleStateProvider(BlockInit.MAPLE_LOG.get().defaultBlockState()),
					new StraightTrunkPlacer(4, 2, 0),
					new SimpleStateProvider(BlockInit.AUTUMN_MAPLE_LEAVES.get().defaultBlockState()),
					new SimpleStateProvider(BlockInit.MAPLE_SAPLING.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
							.ignoreVines().build()));

	public static final ConfiguredFeature<TreeConfiguration, ?> BEECH = register("beech",
			Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(
					new SimpleStateProvider(BlockInit.BEECH_LOG.get().defaultBlockState()),
					new StraightTrunkPlacer(4, 2, 0),
					new SimpleStateProvider(BlockInit.AUTUMN_BEECH_LEAVES.get().defaultBlockState()),
					new SimpleStateProvider(BlockInit.BEECH_SAPLING.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
							.ignoreVines().build()));

	public static final ConfiguredFeature<TreeConfiguration, ?> HICKORY = register("beech",
			Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(
					new SimpleStateProvider(BlockInit.HICKORY_LOG.get().defaultBlockState()),
					new StraightTrunkPlacer(4, 2, 0),
					new SimpleStateProvider(BlockInit.AUTUMN_HICKORY_LEAVES.get().defaultBlockState()),
					new SimpleStateProvider(BlockInit.HICKORY_SAPLING.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
							.ignoreVines().build()));

	public static final ConfiguredFeature<TreeConfiguration, ?> AUTUMN_OAK = register("autumn_oak",
			Feature.TREE.configured((new TreeConfiguration.TreeConfigurationBuilder(
					new SimpleStateProvider(Blocks.OAK_LOG.defaultBlockState()), new StraightTrunkPlacer(4, 2, 0),
					new SimpleStateProvider(BlockInit.AUTUMN_OAK_LEAVES.get().defaultBlockState()),
					new SimpleStateProvider(BlockInit.AUTUMN_OAK_SAPLING.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
							.ignoreVines().build()));

	public static final ConfiguredFeature<TreeConfiguration, ?> AUTUMN_BIRCH = register("autumn_birch", Feature.TREE.configured(
			(new TreeConfiguration.TreeConfigurationBuilder(new SimpleStateProvider(Blocks.BIRCH_LOG.defaultBlockState()),
					new StraightTrunkPlacer(5, 2, 0), new SimpleStateProvider(BlockInit.AUTUMN_BIRCH_LEAVES.get().defaultBlockState()),
					new SimpleStateProvider(BlockInit.AUTUMN_BIRCH_SAPLING.get().defaultBlockState()),
					new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)))
							.ignoreVines().build()));

	private static <FC extends FeatureConfiguration> ConfiguredFeature<FC, ?> register(String pId,
			ConfiguredFeature<FC, ?> pConfiguredFeature) {
		return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, pId, pConfiguredFeature);
	}

}
