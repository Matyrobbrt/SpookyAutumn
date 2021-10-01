package com.matyrobbrt.spookyautumn.data.common;

import java.util.function.Consumer;

import com.matyrobbrt.spookyautumn.data.maps.RecipeMaps;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider {

	public RecipeProvider(DataGenerator pGenerator) {
		super(pGenerator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

		RecipeMaps.addBlockIngot().forEach((block, ingot) -> {
			ShapelessRecipeBuilder.shapeless(ingot, 9).requires(block, 1).unlockedBy("has_item", has(block))
					.save(consumer);
			ShapelessRecipeBuilder.shapeless(block, 1).requires(ingot, 9).unlockedBy("has_item", has(ingot))
					.save(consumer);
		});
		
	}

}
