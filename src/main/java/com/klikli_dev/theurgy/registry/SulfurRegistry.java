/*
 * SPDX-FileCopyrightText: 2023 klikli-dev
 *
 * SPDX-License-Identifier: MIT
 */

package com.klikli_dev.theurgy.registry;

import com.klikli_dev.theurgy.Theurgy;
import com.klikli_dev.theurgy.content.item.AlchemicalSulfurItem;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class SulfurRegistry {
    public static final DeferredRegister<Item> SULFURS = DeferredRegister.create(ForgeRegistries.ITEMS, Theurgy.MODID);

    public static final RegistryObject<AlchemicalSulfurItem> LOGS =
            register("logs", () -> new AlchemicalSulfurItem(new Item.Properties()).overrideTagSourceName(true));

    //Crops
    public static final RegistryObject<AlchemicalSulfurItem> WHEAT =
            register("wheat", () -> new AlchemicalSulfurItem(new Item.Properties()));

    //Metal Ores
    public static final RegistryObject<AlchemicalSulfurItem> IRON_ORE =
            register(ore("iron"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> COPPER_ORE =
            register(ore("copper"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> SILVER_ORE =
            register(ore("silver"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> GOLD_ORE =
            register(ore("gold"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> NETHERITE_ORE =
            register(ore("netherite"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> URANIUM_ORE =
            register(ore("uranium"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> AZURE_SILVER_ORE =
            register(ore("azure_silver"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> ZINC_ORE =
            register(ore("zinc"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> OSMIUM_ORE =
            register(ore("osmium"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> NICKEL_ORE =
            register(ore("nickel"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> LEAD_ORE =
            register(ore("lead"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> ALLTHEMODIUM_ORE =
            register(ore("allthemodium"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> UNOBTAINIUM_ORE =
            register(ore("unobtainium"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> IRIDIUM_ORE =
            register(ore("iridium"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> TIN_ORE =
            register(ore("tin"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> CINNABAR_ORE =
            register(ore("cinnabar"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> CRIMSON_IRON_ORE =
            register(ore("crimson_iron"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> PLATINUM_ORE =
            register(ore("platinum"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> VIBRANIUM_ORE =
            register(ore("vibranium"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    //Common Gems Ore Sulfurs

    public static final RegistryObject<AlchemicalSulfurItem> DIAMOND_ORE =
            register(ore("diamond"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> EMERALD_ORE =
            register(ore("emerald"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> LAPIS_ORE =
            register(ore("lapis"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> QUARTZ_ORE =
            register(ore("quartz"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> RUBY_ORE =
            register(ore("ruby"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> APATITE_ORE =
            register(ore("apatite"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> PERIDOT_ORE =
            register(ore("peridot"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> FLUORITE_ORE =
            register(ore("fluorite"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> SAPPHIRE_ORE =
            register(ore("sapphire"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    //Other Common Ores
    public static final RegistryObject<AlchemicalSulfurItem> REDSTONE_ORE =
            register(ore("redstone"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> COAL_ORE =
            register(ore("coal"), () -> new AlchemicalSulfurItem(new Item.Properties()));
    public static final RegistryObject<AlchemicalSulfurItem> SULFUR_ORE =
            register(ore("sulfur"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    //  this.makeRecipe("iron", 2, Tags.Items.RAW_MATERIALS_IRON, salAmmoniac, 10);
    //        this.makeRecipe(this.raw("copper"), 2, Tags.Items.RAW_MATERIALS_COPPER, salAmmoniac, 10);
    //        this.makeRecipe(this.raw("gold"), 2, Tags.Items.RAW_MATERIALS_GOLD, salAmmoniac, 15);
    //        this.makeRecipe(this.raw("netherite"), 2, Tags.Items.ORES_NETHERITE_SCRAP, salAmmoniac, 100);
    //        this.makeRecipe(this.raw("uranium"), 2, this.tag("forge:raw_materials/uranium"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("azure_silver"), 2, this.tag("forge:raw_materials/azure_silver"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("silver"), 2, this.tag("forge:raw_materials/silver"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("zinc"), 2, this.tag("forge:raw_materials/zinc"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("osmium"), 2, this.tag("forge:raw_materials/osmium"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("nickel"), 2, this.tag("forge:raw_materials/nickel"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("lead"), 2, this.tag("forge:raw_materials/lead"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("allthemodium"), 2, this.tag("forge:raw_materials/allthemodium"), salAmmoniac, 100);
    //        this.makeRecipe(this.raw("unobtainium"), 2, this.tag("forge:raw_materials/unobtainium"), salAmmoniac, 100);
    //        this.makeRecipe(this.raw("iridium"), 2, this.tag("forge:raw_materials/iridium"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("tin"), 2, this.tag("forge:raw_materials/tin"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("cinnabar"), 2, this.tag("forge:raw_materials/cinnabar"), salAmmoniac, 10);
    //        this.makeRecipe(this.raw("crimson_iron"), 2, this.tag("forge:raw_materials/crimson_iron"), salAmmoniac, 20);
    //        this.makeRecipe(this.raw("platinum"), 2, this.tag("forge:raw_materials/platinum"), salAmmoniac, 20);
    //        this.makeRecipe(this.raw("vibranium"), 2, this.tag("forge:raw_materials/vibranium"), salAmmoniac, 20);

    //Common Raw Materials Sulfurs

    public static final RegistryObject<AlchemicalSulfurItem> IRON_RAW =
            register(raw("iron"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> COPPER_RAW =
            register(raw("copper"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> GOLD_RAW =
            register(raw("gold"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> NETHERITE_RAW =
            register(raw("netherite"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> URANIUM_RAW =
            register(raw("uranium"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> AZURE_SILVER_RAW =
            register(raw("azure_silver"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> SILVER_RAW =
            register(raw("silver"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> ZINC_RAW =
            register(raw("zinc"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> OSMIUM_RAW =
                register(raw("osmium"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> NICKEL_RAW =
            register(raw("nickel"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> LEAD_RAW =
            register(raw("lead"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> ALLTHEMODIUM_RAW =
            register(raw("allthemodium"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> UNOBTAINIUM_RAW =
            register(raw("unobtainium"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> IRIDIUM_RAW =
            register(raw("iridium"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> TIN_RAW =
            register(raw("tin"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> CINNABAR_RAW =
            register(raw("cinnabar"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> CRIMSON_IRON_RAW =
            register(raw("crimson_iron"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> PLATINUM_RAW =
            register(raw("platinum"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static final RegistryObject<AlchemicalSulfurItem> VIBRANIUM_RAW =
            register(raw("vibranium"), () -> new AlchemicalSulfurItem(new Item.Properties()));

    public static <T extends Item> RegistryObject<T> register(String name, Supplier<T> sup) {
        return SULFURS.register("alchemical_sulfur_" + name, sup);
    }

    protected static String ore(String name) {
        return name + "_ore";
    }

    protected static String raw(String name) {
        return name + "_raw";
    }

    protected static String dust(String name) {
        return name + "_dust";
    }

    /**
     * We add only those sulfurs that have a recipe to the creative tab.
     * Other sulfurs are registered, but should not be shown to players, as the related items are from mods that are not loaded
     */
    public static void onBuildCreativeModTabs(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ItemRegistry.THEURGY_TAB) {
            //event will only be called client side, but other SulfurRegistry calls can come from the server, so we need to guard against dist
            DistHelper.onBuildCreativeModTabs(event);
        }
    }

    public static class DistHelper {
        public static void onBuildCreativeModTabs(CreativeModeTabEvent.BuildContents event) {
            var level = Minecraft.getInstance().level;
            if (level == null) {
                return;
            }

            var recipeManager = level.getRecipeManager();
            var liquefactionRecipes = recipeManager.getAllRecipesFor(RecipeTypeRegistry.LIQUEFACTION.get());

            SULFURS.getEntries().stream()
                    .map(RegistryObject::get)
                    .map(AlchemicalSulfurItem.class::cast)
                    .forEach(sulfur -> {
                        liquefactionRecipes.stream()
                                .filter(recipe -> recipe.getResultItem(level.registryAccess()) != null && recipe.getResultItem(level.registryAccess()).getItem() == sulfur)
                                .forEach(recipe -> event.accept(recipe.getResultItem(level.registryAccess()).copyWithCount(1)));
                    });
        }
    }

}
