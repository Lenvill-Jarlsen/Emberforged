package com.Lenvill;

import com.google.common.collect.Lists;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.item.ItemMetalComponent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import teamroots.embers.ConfigManager;
import teamroots.embers.RegistryManager;
import teamroots.embers.api.alchemy.AspectList;
import teamroots.embers.recipe.AlchemyRecipe;
import teamroots.embers.recipe.RecipeRegistry;

import java.util.ArrayList;
import java.util.List;

import static minefantasy.mfr.init.MineFantasyItems.PLATE;
import static teamroots.embers.recipe.RecipeRegistry.alchemyRecipes;

public class AlchemyInit {

    public static void preInit(FMLInitializationEvent event) {

        alchemyAdder(new ItemStack(RegistryManager.wildfire_core,1), "iron", 32, 48, "silver", 24, 32, Ingredient.fromItem(RegistryManager.ancient_motive_core), Ingredient.fromStacks(MineFantasyItems.bar("dawnstone")), Ingredient.fromItem(RegistryManager.ember_cluster), Ingredient.fromStacks(MineFantasyItems.bar("dawnstone")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("copper")));
        alchemyAdder(new ItemStack(RegistryManager.blasting_core,1), "copper", 16, 24, Ingredient.fromItem(Items.GUNPOWDER), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("iron")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("iron")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("iron")), Ingredient.fromStacks(MineFantasyItems.bar("copper")));
        alchemyAdder(new ItemStack(RegistryManager.flame_barrier,1), "dawnstone", 16, 32, "silver", 16, 32, Ingredient.fromItem(RegistryManager.crystal_ember), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone")), Ingredient.fromStacks(MineFantasyItems.bar("silver")));
        alchemyAdder(new ItemStack(RegistryManager.focal_lens,1), "copper", 8, 16, "silver", 32, 64, Ingredient.fromItem(RegistryManager.crystal_ember), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("silver")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("silver")));
        alchemyAdder(new ItemStack(RegistryManager.shifting_scales,1), "lead", 32, 128, Ingredient.fromItem(RegistryManager.ashen_cloth), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")));
        alchemyAdder(new ItemStack(RegistryManager.winding_gears,1), "copper", 32, 128, Ingredient.fromItem(MineFantasyItems.BRONZE_GEARS), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")));

        alchemyRemover(new ItemStack(RegistryManager.ancient_motive_core), new ItemStack(RegistryManager.ingot_dawnstone, 1), new ItemStack(RegistryManager.ember_cluster, 1), new ItemStack(RegistryManager.ingot_dawnstone, 1), new ItemStack(RegistryManager.plate_copper, 1));
        alchemyRemover(new ItemStack(Items.GUNPOWDER, 1), new ItemStack(RegistryManager.plate_iron, 1), new ItemStack(RegistryManager.plate_iron, 1),new ItemStack(RegistryManager.plate_iron, 1),new ItemStack(RegistryManager.ingot_copper, 1));
        alchemyRemover(new ItemStack(RegistryManager.crystal_ember, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.ingot_silver, 1));
        alchemyRemover(new ItemStack(RegistryManager.crystal_ember, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_silver, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_silver, 1));
        alchemyRemover(new ItemStack(RegistryManager.ashen_cloth, 1), new ItemStack(RegistryManager.plate_lead, 1), new ItemStack(RegistryManager.plate_lead, 1), new ItemStack(RegistryManager.plate_lead, 1), new ItemStack(RegistryManager.plate_lead, 1));
        if(ConfigManager.enableBronze) {
            alchemyRemover(new ItemStack(RegistryManager.ingot_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1));
        }else{
            alchemyRemover(new ItemStack(MineFantasyItems.BRONZE_INGOT, 1), null, null, null, null);
        }

        //RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("iron", 32, 48).setRange("silver", 24, 32), Ingredient.fromItem(RegistryManager.ancient_motive_core), Lists.newArrayList(Ingredient.fromItem(RegistryManager.ingot_dawnstone), Ingredient.fromItem(RegistryManager.ember_cluster), Ingredient.fromItem(RegistryManager.ingot_dawnstone), Ingredient.fromItem((((ItemMetalComponent) PLATE).createComponentItemStack("copper")).getItem())), new ItemStack(RegistryManager.wildfire_core,1)));
        //RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper", 16, 24), Ingredient.fromItem(Items.GUNPOWDER), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("copper", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("iron", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("iron", 1).getItem()), Ingredient.fromItem(RegistryManager.ingot_copper)), new ItemStack(RegistryManager.blasting_core,1)));
        //RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("dawnstone", 16, 32).setRange("silver", 16, 32), Ingredient.fromItem(RegistryManager.crystal_ember), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(RegistryManager.ingot_silver)), new ItemStack(RegistryManager.flame_barrier,1)));
        //RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  8, 16).setRange("silver", 32, 64), Ingredient.fromItem(RegistryManager.crystal_ember), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("silver", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("silver", 1).getItem())), new ItemStack(RegistryManager.focal_lens,1)));
        //RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("lead",  32, 128), Ingredient.fromItem(RegistryManager.ashen_cloth), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("lead", 1).getItem())), new ItemStack(RegistryManager.shifting_scales,1)));
        //RecipeRegistry.alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange("copper",  32, 128), Ingredient.fromItem(RegistryManager.ingot_bronze), Lists.newArrayList(Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem()), Ingredient.fromItem(((ItemMetalComponent) PLATE).createComponentItemStack("bronze", 1).getItem())), new ItemStack(RegistryManager.winding_gears,1)));
    }

    private static void alchemyAdder(ItemStack output, String aspect_1, int aspect_min_1, int aspect_max_1, String aspect_2, int aspect_min_2, int aspect_max_2, Ingredient center, Ingredient left, Ingredient top, Ingredient right, Ingredient bottom) {
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange(aspect_1, aspect_min_1, aspect_max_1).setRange(aspect_2, aspect_min_2, aspect_max_2), center, Lists.newArrayList(left, top, right, bottom), output));
    }
    private static void alchemyAdder(ItemStack output, String aspect, int aspect_min, int aspect_max, Ingredient center, Ingredient left, Ingredient top, Ingredient right, Ingredient bottom) {
        alchemyRecipes.add(new AlchemyRecipe(new AspectList.AspectRangeList().setRange(aspect, aspect_min, aspect_max), center, Lists.newArrayList(left, top, right, bottom), output));
    }


    private static void alchemyRemover(ItemStack center, ItemStack left, ItemStack top, ItemStack right, ItemStack bottom) {
        ArrayList<ItemStack> input = new ArrayList<ItemStack>();
        input.add(left);
        input.add(top);
        input.add(right);
        input.add(bottom);
        //EmberforgedMain.LOG.info(RecipeRegistry.getAlchemyRecipe(new ItemStack(RegistryManager.ancient_motive_core), input));
        RecipeRegistry.alchemyRecipes.remove(RecipeRegistry.getAlchemyRecipe(center, input));
    }

    //WIP function to pull names fron the AlchemyRecipe registry based on OreIngredient inputs
    public static AlchemyRecipe getAlchemyRecipeEx(ItemStack center, List<ItemStack> outside) {
        AlchemyRecipe matchedRecipe = null;

        for (AlchemyRecipe recipe : alchemyRecipes) {
            if (recipe.matches(center, outside) && (matchedRecipe == null || recipe.outsideIngredients.size() > matchedRecipe.outsideIngredients.size()))
                matchedRecipe = recipe;
        }

        return matchedRecipe;
    }

}
