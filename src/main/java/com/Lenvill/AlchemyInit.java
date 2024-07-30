package com.Lenvill;

import com.Lenvill.item.EmberforgedItems;
import com.google.common.collect.Lists;
import minefantasy.mfr.init.MineFantasyItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTBase;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreIngredient;
import teamroots.embers.api.alchemy.AspectList;
import teamroots.embers.recipe.AlchemyRecipe;
import teamroots.embers.register.BlockRegister;
import teamroots.embers.register.ItemRegister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static teamroots.embers.recipe.RecipeRegistry.alchemyRecipes;

public class AlchemyInit {

    public static void preInit(FMLInitializationEvent event) {
        Ingredient mfr_copper_plate = Ingredient.fromItem(EmberforgedItems.runed_copper_plate);
        Ingredient mfr_iron_plate = Ingredient.fromItem(EmberforgedItems.runed_iron_plate);
        Ingredient mfr_dawnstone_plate = Ingredient.fromItem(EmberforgedItems.runed_dawnstone_plate);
        Ingredient runed_scales = Ingredient.fromItem(EmberforgedItems.gilded_lead_scales);
        Ingredient runed_gears = Ingredient.fromItem(MineFantasyItems.BRONZE_GEARS);
        Ingredient lead_sword = Ingredient.fromStacks((MineFantasyItems.DRAGONFORGED_SWORD).construct("lead", "oak"));

        if(Config.enableChanges) {
            alchemyOutputRemover(new ItemStack(ItemRegister.BLASTING_CORE));
            alchemyOutputRemover(new ItemStack(ItemRegister.FLAME_BARRIER));
            alchemyOutputRemover(new ItemStack(ItemRegister.FOCAL_LENS));
            alchemyOutputRemover(new ItemStack(ItemRegister.INTELLIGENT_APPARATUS));
            alchemyOutputRemover(new ItemStack(ItemRegister.SHIFTING_SCALES));
            alchemyOutputRemover(new ItemStack(ItemRegister.TYRFING));
            alchemyOutputRemover(new ItemStack(ItemRegister.WILDFIRE_CORE));
            alchemyOutputRemover(new ItemStack(ItemRegister.WINDING_GEARS));

            alchemyOutputRemover(new ItemStack(BlockRegister.EMBER_PIPE, 8));
        }

        alchemyAdder(new ItemStack(ItemRegister.BLASTING_CORE,1), "copper", 16, 24, Ingredient.fromItem(Items.GUNPOWDER), mfr_iron_plate, mfr_iron_plate, mfr_iron_plate, new OreIngredient("ingotCopper"));
        alchemyAdder(new ItemStack(ItemRegister.FLAME_BARRIER,1), "dawnstone", 16, 32, "silver", 16, 32, Ingredient.fromItem(ItemRegister.CRYSTAL_EMBER), mfr_dawnstone_plate, mfr_dawnstone_plate, mfr_dawnstone_plate, new OreIngredient("ingotSilver"));
        alchemyAdder(new ItemStack(ItemRegister.FOCAL_LENS,1), "copper", 8, 16, "silver", 32, 64, Ingredient.fromItem(ItemRegister.CRYSTAL_EMBER), mfr_dawnstone_plate, Ingredient.fromItem(EmberforgedItems.runed_silver_plate), mfr_dawnstone_plate, Ingredient.fromItem(EmberforgedItems.runed_silver_plate));
        alchemyAdder(new ItemStack(ItemRegister.INTELLIGENT_APPARATUS,1), "copper", 24, 48, "lead", 40, 64, mfr_copper_plate, Ingredient.fromItem(ItemRegister.ARCHAIC_CIRCUIT), new OreIngredient("ingotCopper"), Ingredient.fromItem(ItemRegister.ARCHAIC_CIRCUIT), new OreIngredient("ingotCopper"));
        alchemyAdder(new ItemStack(ItemRegister.SHIFTING_SCALES,1), "lead", 32, 128, Ingredient.fromItem(ItemRegister.ASHEN_CLOTH), runed_scales, runed_scales, runed_scales, runed_scales);
        alchemyAdder(new ItemStack(ItemRegister.WILDFIRE_CORE,1), "iron", 32, 48, "silver", 24, 32, Ingredient.fromItem(ItemRegister.ANCIENT_MOTIVE_CORE), new OreIngredient("ingotDawnstone"), Ingredient.fromItem(ItemRegister.EMBER_CLUSTER), new OreIngredient("ingotDawnstone"), mfr_copper_plate);
        alchemyAdder(new ItemStack(ItemRegister.WINDING_GEARS,1), "copper", 32, 128, Ingredient.fromItem(MineFantasyItems.BRONZE_INGOT), runed_gears, runed_gears, runed_gears, runed_gears);

        alchemyAdder(new ItemStack(ItemRegister.TYRFING,1), "silver", 64, 96, "lead", 64, 96, lead_sword, new OreIngredient("blockCoal"), new OreIngredient("obsidian"), new OreIngredient("ingotLead"), new OreIngredient("ingotLead"));

        //The volitile Ember Conduit, as it is wierd
        alchemyRecipes.add(new AlchemyRecipe(
                new AspectList.AspectRangeList()
                        .setRange("dawnstone", 8, 16)
                        .setRange("iron", 8, 16)
                        .setRange("copper", 8, 16)
                        .setRange("silver", 8, 16)
                        .setRange("lead", 8, 16),
                Ingredient.fromItem(ItemRegister.WILDFIRE_CORE),
                Lists.newArrayList(new OreIngredient("ingotSilver"), mfr_dawnstone_plate, new OreIngredient("ingotSilver"), mfr_dawnstone_plate),
                new ItemStack(BlockRegister.EMBER_PIPE, 8))
        );

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

    /*
    public boolean matches(ItemStack center, List<ItemStack> test) {
        EmberforgedMain.LOG.info("Match function called");

        if (!centerIngredient.apply(center)) return false;

        ArrayList<Ingredient> oIngredients = new ArrayList<>(outsideIngredients);

        while (test.size() > oIngredients.size()) {
            oIngredients.add(Ingredient.EMPTY);
        }

        for (ItemStack stack : test) {
            Optional<Ingredient> foundNbtMatch = oIngredients.stream().filter(i -> Arrays.stream(i.getMatchingStacks()).filter(i2 -> {
                if (!i2.getEnchantmentTagList().isEmpty()) {
                    for(NBTBase n0 : i2.getEnchantmentTagList()) {
                        for(NBTBase n1 : stack.getEnchantmentTagList()) {
                            return n0.equals(n1);
                        }
                    }
                }
                return false;
            }).isParallel()).findFirst();
            // remove if present, otherwise we need to check non NBT tag
            foundNbtMatch.ifPresent(oIngredients::remove);
            // Check non NBT tag match
            Optional<Ingredient> found = oIngredients.stream().filter(x -> x.apply(stack)).findFirst();
            if (found.isPresent()) { oIngredients.remove(found.get()); } else { return false; }
        }
        return true;
    }
     */

}
