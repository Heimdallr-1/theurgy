/*
 * SPDX-FileCopyrightText: 2022 klikli-dev
 *
 * SPDX-License-Identifier: MIT
 */

package com.klikli_dev.theurgy.datagen.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.klikli_dev.theurgy.Theurgy;
import com.klikli_dev.theurgy.content.item.AlchemicalSaltItem;
import com.klikli_dev.theurgy.content.item.AlchemicalSulfurItem;
import com.klikli_dev.theurgy.content.recipe.IncubationRecipe;
import com.klikli_dev.theurgy.registry.ItemRegistry;
import com.klikli_dev.theurgy.registry.RecipeTypeRegistry;
import com.klikli_dev.theurgy.registry.SaltRegistry;
import com.klikli_dev.theurgy.registry.SulfurRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.BiConsumer;

public class IncubationRecipeProvider extends JsonRecipeProvider {

    public static final int TIME = IncubationRecipe.DEFAULT_INCUBATION_TIME;

    public IncubationRecipeProvider(PackOutput packOutput) {
        super(packOutput, Theurgy.MODID, "incubation");
    }

    @Override
    void buildRecipes(BiConsumer<ResourceLocation, JsonObject> recipeConsumer) {
        this.makeRecipe(Items.WHEAT, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.CROPS.get(), SulfurRegistry.WHEAT.get());

        this.makeRecipe(Tags.Items.ORES_IRON, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.IRON_ORE.get());
    }

    public void makeRecipe(TagKey<Item> result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur) {
        this.makeRecipe(result, 1, mercury, salt, sulfur, TIME);
    }

    public void makeRecipe(TagKey<Item> result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(result, 1, mercury, salt, sulfur, incubationTime);
    }

    public void makeRecipe(TagKey<Item> result, int resultCount, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(this.name(result), result, resultCount, mercury, salt, sulfur, incubationTime);
    }

    public void makeRecipe(String recipeName, TagKey<Item> result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(recipeName, result, 1, mercury, salt, sulfur, incubationTime);
    }

    public void makeRecipe(String recipeName, TagKey<Item> result, int resultCount, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {

        var recipe = this.makeRecipeJson(
                this.makeItemIngredient(this.locFor(mercury)),
                this.makeItemIngredient(this.locFor(salt)),
                this.makeItemIngredient(this.locFor(sulfur)),
                this.makeTagResult(this.locFor(result), resultCount), incubationTime);

        var conditions = new JsonArray();
        conditions.add(this.makeTagNotEmptyCondition(result.location().toString()));
        recipe.add("conditions", conditions);

        this.recipeConsumer.accept(
                this.modLoc(recipeName),
                recipe
        );
    }

    public void makeRecipe(Item result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur) {
        this.makeRecipe(result, 1, mercury, salt, sulfur, TIME);
    }

    public void makeRecipe(Item result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(result, 1, mercury, salt, sulfur, incubationTime);
    }

    public void makeRecipe(Item result, int resultCount, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(this.name(result), result, resultCount, mercury, salt, sulfur, incubationTime);
    }

    public void makeRecipe(String recipeName, Item result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(recipeName, result, 1, mercury, salt, sulfur, incubationTime);
    }

    public void makeRecipe(String recipeName, Item result, int resultCount, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.recipeConsumer.accept(
                this.modLoc(recipeName),
                this.makeRecipeJson(
                        this.makeItemIngredient(this.locFor(mercury)),
                        this.makeItemIngredient(this.locFor(salt)),
                        this.makeItemIngredient(this.locFor(sulfur)),
                        this.makeItemResult(this.locFor(result), resultCount), incubationTime));

    }

    public JsonObject makeRecipeJson(JsonObject mercury, JsonObject salt, JsonObject sulfur, JsonObject result, int incubationTime) {
        var recipe = new JsonObject();
        recipe.addProperty("type", RecipeTypeRegistry.INCUBATION.getId().toString());
        recipe.add("mercury", mercury);
        recipe.add("salt", salt);
        recipe.add("sulfur", sulfur);
        recipe.add("result", result);
        recipe.addProperty("incubation_time", incubationTime);
        return recipe;
    }

    @Override
    public String getName() {
        return "Incubation Recipes";
    }
}
