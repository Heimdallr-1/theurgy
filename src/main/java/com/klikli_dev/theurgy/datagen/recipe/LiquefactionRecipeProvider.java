/*
 * SPDX-FileCopyrightText: 2022 klikli-dev
 *
 * SPDX-License-Identifier: MIT
 */

package com.klikli_dev.theurgy.datagen.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.klikli_dev.theurgy.Theurgy;
import com.klikli_dev.theurgy.TheurgyConstants;
import com.klikli_dev.theurgy.content.recipe.LiquefactionRecipe;
import com.klikli_dev.theurgy.registry.FluidRegistry;
import com.klikli_dev.theurgy.registry.RecipeTypeRegistry;
import com.klikli_dev.theurgy.registry.SulfurRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.Tags;

import java.util.function.BiConsumer;

public class LiquefactionRecipeProvider extends JsonRecipeProvider {

    public static final int TIME = LiquefactionRecipe.DEFAULT_LIQUEFACTION_TIME;

    public LiquefactionRecipeProvider(PackOutput packOutput) {
        super(packOutput, Theurgy.MODID, "liquefaction");
    }

    @Override
    void buildRecipes(BiConsumer<ResourceLocation, JsonObject> recipeConsumer) {
        var salAmmoniac = FluidRegistry.SAL_AMMONIAC.get();


        //Vanilla
        //Sulfurs with overrideTagSourceName
        this.makeRecipe(SulfurRegistry.LOGS.get(), ItemTags.LOGS, salAmmoniac, 10);

        //Crops
        this.makeRecipe(SulfurRegistry.WHEAT.get(), Items.WHEAT, salAmmoniac, 10);

        //Common Metals Ore Sulfurs
        this.makeRecipe(SulfurRegistry.IRON_ORE.get(), 3, Tags.Items.ORES_IRON, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.COPPER_ORE.get(), 3, Tags.Items.ORES_COPPER, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.GOLD_ORE.get(), 3, Tags.Items.ORES_GOLD, salAmmoniac, 15);
        this.makeRecipe(SulfurRegistry.NETHERITE_ORE.get(), 3, Tags.Items.ORES_NETHERITE_SCRAP, salAmmoniac, 100);
        this.makeRecipe(SulfurRegistry.URANIUM_ORE.get(), 3, this.tag("forge:ores/uranium"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.SILVER_ORE.get(), 3, this.tag("forge:ores/silver"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.AZURE_SILVER_ORE.get(), 3, this.tag("forge:ores/azure_silver"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.ZINC_ORE.get(), 3, this.tag("forge:ores/zinc"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.OSMIUM_ORE.get(), 3, this.tag("forge:ores/osmium"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.NICKEL_ORE.get(), 3, this.tag("forge:ores/nickel"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.LEAD_ORE.get(), 3, this.tag("forge:ores/lead"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.ALLTHEMODIUM_ORE.get(), 3, this.tag("forge:ores/allthemodium"), salAmmoniac, 100);
        this.makeRecipe(SulfurRegistry.UNOBTAINIUM_ORE.get(), 3, this.tag("forge:ores/unobtainium"), salAmmoniac, 100);
        this.makeRecipe(SulfurRegistry.IRIDIUM_ORE.get(), 3, this.tag("forge:ores/iridium"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.TIN_ORE.get(), 3, this.tag("forge:ores/tin"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.CINNABAR_ORE.get(), 3, this.tag("forge:ores/cinnabar"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.CRIMSON_IRON_ORE.get(), 3, this.tag("forge:ores/crimson_iron"), salAmmoniac, 20);
        this.makeRecipe(SulfurRegistry.PLATINUM_ORE.get(), 3, this.tag("forge:ores/platinum"), salAmmoniac, 20);
        this.makeRecipe(SulfurRegistry.VIBRANIUM_ORE.get(), 3, this.tag("forge:ores/vibranium"), salAmmoniac, 20);

        //Common Gems Ore Sulfurs
        this.makeRecipe(SulfurRegistry.DIAMOND_ORE.get(), 4, Tags.Items.ORES_DIAMOND, salAmmoniac, 100);
        this.makeRecipe(SulfurRegistry.EMERALD_ORE.get(), 4, Tags.Items.ORES_EMERALD, salAmmoniac, 100);
        this.makeRecipe(SulfurRegistry.LAPIS_ORE.get(), 10, Tags.Items.ORES_LAPIS, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.QUARTZ_ORE.get(), 8, Tags.Items.ORES_QUARTZ, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.RUBY_ORE.get(), 6, this.tag("forge:ores/ruby"), salAmmoniac, 15);
        this.makeRecipe(SulfurRegistry.APATITE_ORE.get(), 8, this.tag("forge:ores/apatite"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.PERIDOT_ORE.get(), 6, this.tag("forge:ores/peridot"), salAmmoniac, 15);
        this.makeRecipe(SulfurRegistry.FLUORITE_ORE.get(), 6, this.tag("forge:ores/fluorite"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.SAPPHIRE_ORE.get(), 6, this.tag("forge:ores/sapphire"), salAmmoniac, 15);

        //Other Common Ores
        this.makeRecipe(SulfurRegistry.REDSTONE_ORE.get(), 9, Tags.Items.ORES_REDSTONE, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.COAL_ORE.get(), 4, Tags.Items.ORES_COAL, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.SULFUR_ORE.get(), 6, this.tag("forge:ores/sulfur"), salAmmoniac, 10);

        //Common Raw Materials Sulfurs
        this.makeRecipe(SulfurRegistry.IRON_RAW.get(), 2, Tags.Items.RAW_MATERIALS_IRON, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.COPPER_RAW.get(), 2, Tags.Items.RAW_MATERIALS_COPPER, salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.GOLD_RAW.get(), 2, Tags.Items.RAW_MATERIALS_GOLD, salAmmoniac, 15);
        this.makeRecipe(SulfurRegistry.URANIUM_RAW.get(), 2, this.tag("forge:raw_materials/uranium"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.AZURE_SILVER_RAW.get(), 2, this.tag("forge:raw_materials/azure_silver"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.SILVER_RAW.get(), 2, this.tag("forge:raw_materials/silver"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.ZINC_RAW.get(), 2, this.tag("forge:raw_materials/zinc"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.OSMIUM_RAW.get(), 2, this.tag("forge:raw_materials/osmium"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.NICKEL_RAW.get(), 2, this.tag("forge:raw_materials/nickel"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.LEAD_RAW.get(), 2, this.tag("forge:raw_materials/lead"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.ALLTHEMODIUM_RAW.get(), 2, this.tag("forge:raw_materials/allthemodium"), salAmmoniac, 100);
        this.makeRecipe(SulfurRegistry.UNOBTAINIUM_RAW.get(), 2, this.tag("forge:raw_materials/unobtainium"), salAmmoniac, 100);
        this.makeRecipe(SulfurRegistry.IRIDIUM_RAW.get(), 2, this.tag("forge:raw_materials/iridium"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.TIN_RAW.get(), 2, this.tag("forge:raw_materials/tin"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.CINNABAR_RAW.get(), 2, this.tag("forge:raw_materials/cinnabar"), salAmmoniac, 10);
        this.makeRecipe(SulfurRegistry.CRIMSON_IRON_RAW.get(), 2, this.tag("forge:raw_materials/crimson_iron"), salAmmoniac, 20);
        this.makeRecipe(SulfurRegistry.PLATINUM_RAW.get(), 2, this.tag("forge:raw_materials/platinum"), salAmmoniac, 20);
        this.makeRecipe(SulfurRegistry.VIBRANIUM_RAW.get(), 2, this.tag("forge:raw_materials/vibranium"), salAmmoniac, 20);
    }

    protected String ore(String name) {
        return name + "_ore";
    }

    protected String raw(String name) {
        return name + "_raw";
    }

    protected String dust(String name) {
        return name + "_dust";
    }

    public void makeRecipe(Item sulfurName, Item ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfurName, 1, ingredient, solvent, solventAmount, TIME);
    }

    public void makeRecipe(Item sulfur, Item ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {
        this.makeRecipe(sulfur, 1, ingredient, solvent, solventAmount, liquefactionTime);
    }

    public void makeRecipe(Item sulfur, int resultCount, Item ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfur, resultCount, ingredient, solvent, solventAmount, TIME);
    }

    public void makeRecipe(Item sulfur, int resultCount, Item ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {

        var nbt = this.makeSulfurNbt(ingredient);
        this.recipeConsumer.accept(
                this.modLoc(this.name(sulfur)),
                this.makeRecipeJson(
                        this.makeItemIngredient(this.locFor(ingredient)),
                        this.makeFluidIngredient(this.locFor(solvent), solventAmount),
                        this.makeItemResult(this.locFor(sulfur), resultCount, nbt), liquefactionTime));

    }

    public void makeRecipe(Item sulfurName, TagKey<Item> ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfurName, 1, ingredient, solvent, solventAmount, LiquefactionRecipe.DEFAULT_LIQUEFACTION_TIME);
    }

    public void makeRecipe(Item sulfurName, TagKey<Item> ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {
        this.makeRecipe(sulfurName, 1, ingredient, solvent, solventAmount, liquefactionTime);
    }

    public void makeRecipe(Item sulfur, int resultCount, TagKey<Item> ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfur, resultCount, ingredient, solvent, solventAmount, LiquefactionRecipe.DEFAULT_LIQUEFACTION_TIME);
    }

    public void makeRecipe(Item sulfur, int resultCount, TagKey<Item> ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {

        var nbt = this.makeSulfurNbt(ingredient);
        var recipe = this.makeRecipeJson(
                this.makeTagIngredient(ingredient.location()),
                this.makeFluidIngredient(this.locFor(solvent), solventAmount),
                this.makeItemResult(this.locFor(sulfur), resultCount, nbt), liquefactionTime);

        var conditions = new JsonArray();
        conditions.add(this.makeTagNotEmptyCondition(ingredient.location().toString()));
        recipe.add("conditions", conditions);

        this.recipeConsumer.accept(
                this.modLoc(this.name(sulfur)),
                recipe
        );

    }


    public JsonObject makeSulfurNbt(Item ingredient) {
        var nbt = new JsonObject();
        nbt.addProperty(TheurgyConstants.Nbt.SULFUR_SOURCE_ID, this.locFor(ingredient).toString());
        return nbt;
    }

    public JsonObject makeSulfurNbt(TagKey<Item> ingredient) {
        var nbt = new JsonObject();
        nbt.addProperty(TheurgyConstants.Nbt.SULFUR_SOURCE_ID, "#" + ingredient.location());
        return nbt;
    }

    public JsonObject makeRecipeJson(JsonObject ingredient, JsonObject solvent, JsonObject result, int liquefactionTime) {
        var recipe = new JsonObject();
        recipe.addProperty("type", RecipeTypeRegistry.LIQUEFACTION.getId().toString());
        recipe.add("solvent", solvent);
        recipe.add("ingredient", ingredient);
        recipe.add("result", result);
        recipe.addProperty("liquefaction_time", liquefactionTime);
        return recipe;
    }

    @Override
    public String getName() {
        return "Liquefaction Recipes";
    }
}
