package com.matyrobbrt.spookyautumn.core.init;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.placement.FeatureDecorator;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import net.minecraftforge.event.world.BiomeLoadingEvent;

public class FeatureInit {

	public static void addOres(final BiomeLoadingEvent event) {
		addOre(event, OreConfiguration.Predicates.NATURAL_STONE, BlockInit.SPOOKY_ORE.get().defaultBlockState(), 5, 10,
				15, 4);
	}

	public static void addOre(final BiomeLoadingEvent event, RuleTest rule, BlockState state, int veinSize,
			int minHeight, int maxHeight, int amount) {
		event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreConfiguration(rule, state, veinSize))
						.decorated(FeatureDecorator.RANGE.configured(new RangeDecoratorConfiguration(
								UniformHeight.of(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(100)))))
						.squared().count(amount));
	}

}
