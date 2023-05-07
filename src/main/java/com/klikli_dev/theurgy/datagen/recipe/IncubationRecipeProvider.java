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

        //metal ingots from ore sulfurs
        this.makeRecipe(Tags.Items.INGOTS_IRON, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.IRON_ORE.get());
        this.makeRecipe(Tags.Items.INGOTS_COPPER, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.COPPER_ORE.get());
        this.makeRecipe(Tags.Items.INGOTS_GOLD, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.GOLD_ORE.get());
        this.makeRecipe(Tags.Items.INGOTS_NETHERITE, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.NETHERITE_ORE.get());
        this.makeRecipe(this.tag("forge:ores/uranium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.URANIUM_ORE.get());
        this.makeRecipe(this.tag("forge:ores/silver"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.SILVER_ORE.get());
        this.makeRecipe(this.tag("forge:ores/azure_silver"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.AZURE_SILVER_ORE.get());
        this.makeRecipe(this.tag("forge:ores/zinc"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.ZINC_ORE.get());
        this.makeRecipe(this.tag("forge:ores/osmium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.OSMIUM_ORE.get());
        this.makeRecipe(this.tag("forge:ores/nickel"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.NICKEL_ORE.get());
        this.makeRecipe(this.tag("forge:ores/lead"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.LEAD_ORE.get());
        this.makeRecipe(this.tag("forge:ores/allthemodium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.ALLTHEMODIUM_ORE.get());
        this.makeRecipe(this.tag("forge:ores/unobtainium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.UNOBTAINIUM_ORE.get());
        this.makeRecipe(this.tag("forge:ores/iridium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.IRIDIUM_ORE.get());
        this.makeRecipe(this.tag("forge:ores/tin"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.TIN_ORE.get());
        this.makeRecipe(this.tag("forge:ores/cinnabar"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.CINNABAR_ORE.get());
        this.makeRecipe(this.tag("forge:ores/crimson_iron"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.CRIMSON_IRON_ORE.get());
        this.makeRecipe(this.tag("forge:ores/platinum"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.PLATINUM_ORE.get());
        this.makeRecipe(this.tag("forge:ores/vibranium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.VIBRANIUM_ORE.get());

        //metal ingots from raw material sulfurs
        this.makeRecipe(Tags.Items.INGOTS_IRON, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.IRON_RAW.get());
        this.makeRecipe(Tags.Items.INGOTS_COPPER, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.COPPER_RAW.get());
        this.makeRecipe(Tags.Items.INGOTS_GOLD, ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.GOLD_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/uranium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.URANIUM_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/azure_silver"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.AZURE_SILVER_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/silver"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.SILVER_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/zinc"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.ZINC_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/osmium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.OSMIUM_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/nickel"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.NICKEL_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/lead"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.LEAD_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/allthemodium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.ALLTHEMODIUM_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/unobtainium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.UNOBTAINIUM_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/iridium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.IRIDIUM_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/tin"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.TIN_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/cinnabar"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.CINNABAR_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/crimson_iron"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.CRIMSON_IRON_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/platinum"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.PLATINUM_RAW.get());
        this.makeRecipe(this.tag("forge:raw_materials/vibranium"), ItemRegistry.MERCURY_SHARD.get(), SaltRegistry.MINERAL.get(), SulfurRegistry.VIBRANIUM_RAW.get());
    }

    public void makeRecipe(TagKey<Item> result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur) {
        this.makeRecipe(result, 1, mercury, salt, sulfur, TIME);
    }

    public void makeRecipe(TagKey<Item> result, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(result, 1, mercury, salt, sulfur, incubationTime);
    }

    public void makeRecipe(TagKey<Item> result, int resultCount, Item mercury, AlchemicalSaltItem salt, AlchemicalSulfurItem sulfur, int incubationTime) {
        this.makeRecipe(this.name(result) + "_from_" + this.name(sulfur), result, resultCount, mercury, salt, sulfur, incubationTime);
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
