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
        this.makeRecipe("logs", ItemTags.LOGS, salAmmoniac, 10);

        //Crops
        this.makeRecipe("wheat", Items.WHEAT, salAmmoniac, 10);

        //Common Metals Ore Sulfurs
        this.makeRecipe(this.ore("iron"), 3, Tags.Items.ORES_IRON, salAmmoniac, 10);
        this.makeRecipe(this.ore("copper"), 3, Tags.Items.ORES_COPPER, salAmmoniac, 10);
        this.makeRecipe(this.ore("gold"), 3, Tags.Items.ORES_GOLD, salAmmoniac, 15);
        this.makeRecipe(this.ore("netherite"), 3, Tags.Items.ORES_NETHERITE_SCRAP, salAmmoniac, 100);
        this.makeRecipe(this.ore("uranium"), 3, this.tag("forge:ores/uranium"), salAmmoniac, 10);
        this.makeRecipe(this.ore("silver"), 3, this.tag("forge:ores/silver"), salAmmoniac, 10);
        this.makeRecipe(this.ore("azure_silver"), 3, this.tag("forge:ores/azure_silver"), salAmmoniac, 10);
        this.makeRecipe(this.ore("zinc"), 3, this.tag("forge:ores/zinc"), salAmmoniac, 10);
        this.makeRecipe(this.ore("osmium"), 3, this.tag("forge:ores/osmium"), salAmmoniac, 10);
        this.makeRecipe(this.ore("nickel"), 3, this.tag("forge:ores/nickel"), salAmmoniac, 10);
        this.makeRecipe(this.ore("lead"), 3, this.tag("forge:ores/lead"), salAmmoniac, 10);
        this.makeRecipe(this.ore("allthemodium"), 3, this.tag("forge:ores/allthemodium"), salAmmoniac, 100);
        this.makeRecipe(this.ore("unobtainium"), 3, this.tag("forge:ores/unobtainium"), salAmmoniac, 100);
        this.makeRecipe(this.ore("iridium"), 3, this.tag("forge:ores/iridium"), salAmmoniac, 10);
        this.makeRecipe(this.ore("tin"), 3, this.tag("forge:ores/tin"), salAmmoniac, 10);
        this.makeRecipe(this.ore("cinnabar"), 3, this.tag("forge:ores/cinnabar"), salAmmoniac, 10);
        this.makeRecipe(this.ore("crimson_iron"), 3, this.tag("forge:ores/crimson_iron"), salAmmoniac, 20);
        this.makeRecipe(this.ore("platinum"), 3, this.tag("forge:ores/platinum"), salAmmoniac, 20);
        this.makeRecipe(this.ore("vibranium"), 3, this.tag("forge:ores/vibranium"), salAmmoniac, 20);

        //Common Gems Ore Sulfurs
        this.makeRecipe(this.ore("diamond"), 4, Tags.Items.ORES_DIAMOND, salAmmoniac, 100);
        this.makeRecipe(this.ore("emerald"), 4, Tags.Items.ORES_EMERALD, salAmmoniac, 100);
        this.makeRecipe(this.ore("lapis"), 10, Tags.Items.ORES_LAPIS, salAmmoniac, 10);
        this.makeRecipe(this.ore("quartz"), 8, Tags.Items.ORES_QUARTZ, salAmmoniac, 10);
        this.makeRecipe(this.ore("ruby"), 6, this.tag("forge:ores/ruby"), salAmmoniac, 15);
        this.makeRecipe(this.ore("apatite"), 8, this.tag("forge:ores/apatite"), salAmmoniac, 10);
        this.makeRecipe(this.ore("peridot"), 6, this.tag("forge:ores/peridot"), salAmmoniac, 15);
        this.makeRecipe(this.ore("fluorite"), 6, this.tag("forge:ores/fluorite"), salAmmoniac, 10);
        this.makeRecipe(this.ore("sapphire"), 6, this.tag("forge:ores/sapphire"), salAmmoniac, 15);

        //Other Common Ores
        this.makeRecipe(this.ore("redstone"), 9, Tags.Items.ORES_REDSTONE, salAmmoniac, 10);
        this.makeRecipe(this.ore("coal"), 4, Tags.Items.ORES_COAL, salAmmoniac, 10);
        this.makeRecipe(this.ore("sulfur"), 6, this.tag("forge:ores/sulfur"), salAmmoniac, 10);

        //Common Raw Materials Sulfurs
        this.makeRecipe("iron", 2, Tags.Items.RAW_MATERIALS_IRON, salAmmoniac, 10);
        this.makeRecipe(this.raw("copper"), 2, Tags.Items.RAW_MATERIALS_COPPER, salAmmoniac, 10);
        this.makeRecipe(this.raw("gold"), 2, Tags.Items.RAW_MATERIALS_GOLD, salAmmoniac, 15);
        this.makeRecipe(this.raw("netherite"), 2, Tags.Items.ORES_NETHERITE_SCRAP, salAmmoniac, 100);
        this.makeRecipe(this.raw("uranium"), 2, this.tag("forge:raw_materials/uranium"), salAmmoniac, 10);
        this.makeRecipe(this.raw("azure_silver"), 2, this.tag("forge:raw_materials/azure_silver"), salAmmoniac, 10);
        this.makeRecipe(this.raw("silver"), 2, this.tag("forge:raw_materials/silver"), salAmmoniac, 10);
        this.makeRecipe(this.raw("zinc"), 2, this.tag("forge:raw_materials/zinc"), salAmmoniac, 10);
        this.makeRecipe(this.raw("osmium"), 2, this.tag("forge:raw_materials/osmium"), salAmmoniac, 10);
        this.makeRecipe(this.raw("nickel"), 2, this.tag("forge:raw_materials/nickel"), salAmmoniac, 10);
        this.makeRecipe(this.raw("lead"), 2, this.tag("forge:raw_materials/lead"), salAmmoniac, 10);
        this.makeRecipe(this.raw("allthemodium"), 2, this.tag("forge:raw_materials/allthemodium"), salAmmoniac, 100);
        this.makeRecipe(this.raw("unobtainium"), 2, this.tag("forge:raw_materials/unobtainium"), salAmmoniac, 100);
        this.makeRecipe(this.raw("iridium"), 2, this.tag("forge:raw_materials/iridium"), salAmmoniac, 10);
        this.makeRecipe(this.raw("tin"), 2, this.tag("forge:raw_materials/tin"), salAmmoniac, 10);
        this.makeRecipe(this.raw("cinnabar"), 2, this.tag("forge:raw_materials/cinnabar"), salAmmoniac, 10);
        this.makeRecipe(this.raw("crimson_iron"), 2, this.tag("forge:raw_materials/crimson_iron"), salAmmoniac, 20);
        this.makeRecipe(this.raw("platinum"), 2, this.tag("forge:raw_materials/platinum"), salAmmoniac, 20);
        this.makeRecipe(this.raw("vibranium"), 2, this.tag("forge:raw_materials/vibranium"), salAmmoniac, 20);
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

    public void makeRecipe(String sulfurName, Item ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfurName, 1, ingredient, solvent, solventAmount, TIME);
    }

    public void makeRecipe(String sulfurName, Item ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {
        this.makeRecipe(sulfurName, 1, ingredient, solvent, solventAmount, liquefactionTime);
    }

    public void makeRecipe(String sulfurName, int resultCount, Item ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfurName, resultCount, ingredient, solvent, solventAmount, TIME);
    }

    public void makeRecipe(String sulfurName, int resultCount, Item ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {

        var nbt = this.makeSulfurNbt(ingredient);
        this.recipeConsumer.accept(
                this.modLoc(sulfurName),
                this.makeRecipeJson(
                        this.makeItemIngredient(this.locFor(ingredient)),
                        this.makeFluidIngredient(this.locFor(solvent), solventAmount),
                        this.makeItemResult(this.modLoc("alchemical_sulfur_" + sulfurName), resultCount, nbt), liquefactionTime));

    }

    public void makeRecipe(String sulfurName, TagKey<Item> ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfurName, 1, ingredient, solvent, solventAmount, LiquefactionRecipe.DEFAULT_LIQUEFACTION_TIME);
    }

    public void makeRecipe(String sulfurName, TagKey<Item> ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {
        this.makeRecipe(sulfurName, 1, ingredient, solvent, solventAmount, liquefactionTime);
    }

    public void makeRecipe(String sulfurName, int resultCount, TagKey<Item> ingredient, Fluid solvent, int solventAmount) {
        this.makeRecipe(sulfurName, resultCount, ingredient, solvent, solventAmount, LiquefactionRecipe.DEFAULT_LIQUEFACTION_TIME);
    }

    public void makeRecipe(String sulfurName, int resultCount, TagKey<Item> ingredient, Fluid solvent, int solventAmount, int liquefactionTime) {

        var nbt = this.makeSulfurNbt(ingredient);
        var recipe = this.makeRecipeJson(
                this.makeTagIngredient(ingredient.location()),
                this.makeFluidIngredient(this.locFor(solvent), solventAmount),
                this.makeItemResult(this.modLoc("alchemical_sulfur_" + sulfurName), resultCount, nbt), liquefactionTime);

        var conditions = new JsonArray();
        conditions.add(this.makeTagNotEmptyCondition(ingredient.location().toString()));
        recipe.add("conditions", conditions);

        this.recipeConsumer.accept(
                this.modLoc(sulfurName),
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
