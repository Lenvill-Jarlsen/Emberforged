package com.Lenvill;

import com.google.common.collect.Lists;
import minefantasy.mfr.item.ItemMetalComponent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import teamroots.embers.RegistryManager;
import teamroots.embers.api.alchemy.AspectList;
import teamroots.embers.recipe.AlchemyRecipe;
import teamroots.embers.recipe.RecipeRegistry;

import static minefantasy.mfr.init.MineFantasyItems.PLATE;

public class AlchemyInit {

    public static void preInit(FMLInitializationEvent event) {
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 32, 48).setRange("silver", 24, 32), Ingredient.fromItem(RegistryManager.ancient_motive_core), Lists.newArrayList(Ingredient.fromItem(RegistryManager.ingot_dawnstone), Ingredient.fromItem(RegistryManager.ember_cluster), Ingredient.fromItem(RegistryManager.ingot_dawnstone), Ingredient.fromItem((((ItemMetalComponent) PLATE).createComponentItemStack("copper")).getItem())), new ItemStack(RegistryManager.wildfire_core,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper", 16, 24), Ingredient.fromItem(Items.GUNPOWDER), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("copper", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("iron", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("iron", 1).getItem()), Ingredient.fromItem(RegistryManager.ingot_copper)), new ItemStack(RegistryManager.blasting_core,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 16, 32).setRange("silver", 16, 32), Ingredient.fromItem(RegistryManager.crystal_ember), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(RegistryManager.ingot_silver)), new ItemStack(RegistryManager.flame_barrier,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  8, 16).setRange("silver", 32, 64), Ingredient.fromItem(RegistryManager.crystal_ember), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("silver", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("silver", 1).getItem())), new ItemStack(RegistryManager.focal_lens,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("lead",  32, 128), Ingredient.fromItem(RegistryManager.ashen_cloth), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem())), new ItemStack(RegistryManager.shifting_scales,1)));
        RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  32, 128), Ingredient.fromItem(RegistryManager.ingot_bronze), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem())), new ItemStack(RegistryManager.winding_gears,1)));
    }
}
