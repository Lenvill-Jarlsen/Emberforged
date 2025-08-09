package com.Lenvill;

import minefantasy.mfr.config.ConfigHardcore;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.register.BlockRegister;
import teamroots.embers.register.ItemRegister;

import java.util.Map;

public class SmeltingInit {
        public static void allsmelt() {
            if(ConfigMaterial.ALUMINUM.mustLoad()) {
                removeSmeltingRecipe(BlockRegister.ORE_ALUMINUM);
            }
            if(ConfigMaterial.COPPER.mustLoad()) {
                removeSmeltingRecipe(BlockRegister.ORE_COPPER);
            }
            if(ConfigMaterial.LEAD.mustLoad()) {
                removeSmeltingRecipe(BlockRegister.ORE_LEAD);
            }
            if(ConfigMaterial.NICKEL.mustLoad()){
                removeSmeltingRecipe(BlockRegister.ORE_NICKEL);
            }
            if(ConfigMaterial.SILVER.mustLoad()) {
                removeSmeltingRecipe(BlockRegister.ORE_SILVER);
            }
            if(ConfigMaterial.TIN.mustLoad()) {
                removeSmeltingRecipe(BlockRegister.ORE_TIN);
            }

            if(Config.recipeChanges || ConfigHardcore.preventCeramic) {
                removeSmeltingRecipe(ItemRegister.BLEND_CAMINITE);
                removeSmeltingRecipe(ItemRegister.STAMP_BAR_RAW);
                removeSmeltingRecipe(ItemRegister.STAMP_PLATE_RAW);
                removeSmeltingRecipe(ItemRegister.STAMP_GEAR_RAW);
                removeSmeltingRecipe(ItemRegister.STAMP_FLAT_RAW);
                removeSmeltingRecipe(ItemRegister.PLATE_CAMINITE_RAW);
            }

            /*
            // Rendered obsolete by the data-driven update
            for (ItemStack ore: OreDictionary.getOres("oreAluminum")) {
                addsmeltall(ore, MineFantasyItems.bar("aluminum"));
            }
            for (ItemStack ore: OreDictionary.getOres("oreLead")) {
                addsmeltall(ore, MineFantasyItems.bar("lead"));
            }
            for (ItemStack ore: OreDictionary.getOres("oreNickel")) {
                addsmeltall(ore, MineFantasyItems.bar("nickel"));
            }
             */
        }

        /*
        //Also rendered obsolete by the data-driven update
        private static void addsmeltall (ItemStack ore, ItemStack bar) {
            if (ConfigHardcore.HCCreduceIngots) {
                BloomRecipe.addRecipe(ore, bar);
            }
            BigFurnaceRecipes.addRecipe(ore, bar, 0);
        }

         */

        private static void removeSmeltingRecipe(Block ore) {
            if (ConfigHardcore.HCCreduceIngots) {
                Map<ItemStack, ItemStack> SmeltingRecipes = FurnaceRecipes.instance().getSmeltingList();
                ItemStack oreItem = null;
                for (ItemStack item : SmeltingRecipes.keySet()) {
                    if (item.getItem() == Item.getItemFromBlock(ore)) {
                        oreItem = item;
                    }
                }
                if (oreItem != null) {
                    FurnaceRecipes.instance().getSmeltingList().remove(oreItem);
                }
            }
        }

    private static void removeSmeltingRecipe(Item ore) {
        Map<ItemStack, ItemStack> SmeltingRecipes = FurnaceRecipes.instance().getSmeltingList();
        ItemStack oreItem = null;
        for (ItemStack item : SmeltingRecipes.keySet()) {
            if (item.getItem() == ore) {
                oreItem = item;
            }
        }
        if (oreItem != null) {
            FurnaceRecipes.instance().getSmeltingList().remove(oreItem);
        }
    }
}
