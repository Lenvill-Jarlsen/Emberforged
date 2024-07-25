package com.Lenvill;

import com.google.common.collect.Lists;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.item.ItemMetalComponent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreIngredient;
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
        Ingredient mfr_copper_plate = Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("copper"));
        Ingredient mfr_iron_plate = Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("iron"));
        Ingredient mfr_dawnstone_plate = Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("dawnstone"));;
        Ingredient lead_sword = Ingredient.fromStacks((MineFantasyItems.DRAGONFORGED_SWORD).construct("lead", "birch"));

        if(Config.enableChanges) {
            alchemyOutputRemover(new ItemStack(RegistryManager.blasting_core));
            alchemyOutputRemover(new ItemStack(RegistryManager.flame_barrier));
            alchemyOutputRemover(new ItemStack(RegistryManager.focal_lens));
            alchemyOutputRemover(new ItemStack(RegistryManager.intelligent_apparatus));
            alchemyOutputRemover(new ItemStack(RegistryManager.shifting_scales));
            alchemyOutputRemover(new ItemStack(RegistryManager.wildfire_core, 1));
            alchemyOutputRemover(new ItemStack(RegistryManager.winding_gears, 1));

            alchemyOutputRemover(new ItemStack(RegistryManager.ember_pipe, 8));
        }

        alchemyAdder(new ItemStack(RegistryManager.blasting_core,1), "copper", 16, 24, Ingredient.fromItem(Items.GUNPOWDER), mfr_iron_plate, mfr_iron_plate, mfr_iron_plate, Ingredient.fromStacks(MineFantasyItems.bar("copper")));
        alchemyAdder(new ItemStack(RegistryManager.flame_barrier,1), "dawnstone", 16, 32, "silver", 16, 32, Ingredient.fromItem(RegistryManager.crystal_ember), mfr_dawnstone_plate, mfr_dawnstone_plate, mfr_dawnstone_plate, Ingredient.fromStacks(MineFantasyItems.bar("silver")));
        alchemyAdder(new ItemStack(RegistryManager.focal_lens,1), "copper", 8, 16, "silver", 32, 64, Ingredient.fromItem(RegistryManager.crystal_ember), mfr_dawnstone_plate, Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("silver")), mfr_dawnstone_plate, Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("silver")));
        alchemyAdder(new ItemStack(RegistryManager.intelligent_apparatus,1), "copper", 24, 48, "lead", 40, 64, mfr_copper_plate, Ingredient.fromItem(RegistryManager.archaic_circuit), Ingredient.fromStacks(MineFantasyItems.bar("copper")), Ingredient.fromItem(RegistryManager.archaic_circuit), Ingredient.fromStacks(MineFantasyItems.bar("copper")));
        alchemyAdder(new ItemStack(RegistryManager.shifting_scales,1), "lead", 32, 128, Ingredient.fromItem(RegistryManager.ashen_cloth), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")), Ingredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack("lead")));
        alchemyAdder(new ItemStack(RegistryManager.wildfire_core,1), "iron", 32, 48, "silver", 24, 32, Ingredient.fromItem(RegistryManager.ancient_motive_core), Ingredient.fromStacks(MineFantasyItems.bar("dawnstone")), Ingredient.fromItem(RegistryManager.ember_cluster), Ingredient.fromStacks(MineFantasyItems.bar("dawnstone")), mfr_copper_plate);
        alchemyAdder(new ItemStack(RegistryManager.winding_gears,1), "copper", 32, 128, Ingredient.fromItem(MineFantasyItems.BRONZE_GEARS), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")), Ingredient.fromStacks(((ItemMetalComponent) PLATE).createComponentItemStack("bronze")));

        alchemyAdder(new ItemStack(RegistryManager.tyrfing,1), "silver", 64, 96, "lead", 64, 96, lead_sword, new OreIngredient("blockCoal"), new OreIngredient("obsidian"), Ingredient.fromStacks(MineFantasyItems.bar("lead")), Ingredient.fromStacks(MineFantasyItems.bar("lead")));

        //The volitile Ember Conduit, as it is wierd
        alchemyRecipes.add(new AlchemyRecipe(
                new AspectList.AspectRangeList()
                        .setRange("dawnstone", 8, 16)
                        .setRange("iron", 8, 16)
                        .setRange("copper", 8, 16)
                        .setRange("silver", 8, 16)
                        .setRange("lead", 8, 16),
                Ingredient.fromItem(RegistryManager.wildfire_core),
                Lists.newArrayList(Ingredient.fromStacks(MineFantasyItems.bar("silver")), mfr_dawnstone_plate, Ingredient.fromStacks(MineFantasyItems.bar("silver")), mfr_dawnstone_plate),
                new ItemStack(RegistryManager.ember_pipe, 8))
        );

        //alchemyRemover(new ItemStack(RegistryManager.ancient_motive_core), new ItemStack(RegistryManager.ingot_dawnstone, 1), new ItemStack(RegistryManager.ember_cluster, 1), new ItemStack(RegistryManager.ingot_dawnstone, 1), new ItemStack(RegistryManager.plate_copper, 1));
        //alchemyRemover(new ItemStack(Items.GUNPOWDER, 1), new ItemStack(RegistryManager.plate_iron, 1), new ItemStack(RegistryManager.plate_iron, 1),new ItemStack(RegistryManager.plate_iron, 1),new ItemStack(RegistryManager.ingot_copper, 1));
        //alchemyRemover(new ItemStack(RegistryManager.crystal_ember, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.ingot_silver, 1));
        //alchemyRemover(new ItemStack(RegistryManager.crystal_ember, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_silver, 1), new ItemStack(RegistryManager.plate_dawnstone, 1), new ItemStack(RegistryManager.plate_silver, 1));
        //alchemyRemover(new ItemStack(RegistryManager.ashen_cloth, 1), new ItemStack(RegistryManager.plate_lead, 1), new ItemStack(RegistryManager.plate_lead, 1), new ItemStack(RegistryManager.plate_lead, 1), new ItemStack(RegistryManager.plate_lead, 1));
        if(ConfigManager.enableBronze) {
            //alchemyRemover(new ItemStack(RegistryManager.ingot_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1), new ItemStack(RegistryManager.plate_bronze, 1));
        }

        /*
        TO-DO:
            Intelligent Apparatus
            Volatile Ember Conduit

            Tyrfing
         */

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

    private static void alchemyOutputRemover(ItemStack output) {
        for(int i = 0; i < alchemyRecipes.size(); i++) {
            if(alchemyRecipes.get(i).result.isItemEqual(output)) {
                alchemyRecipes.remove(alchemyRecipes.get(i));
            }
        }
    }

}
