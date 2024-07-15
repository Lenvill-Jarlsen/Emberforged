package com.Lenvill;

import minefantasy.mfr.config.ConfigHardcore;
import minefantasy.mfr.init.MineFantasyItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import teamroots.embers.RegistryManager;

import java.util.Map;

public class SmeltingInit {
        public static void allsmelt() {
            removeSmeltingRecipe(RegistryManager.ore_aluminum);
            removeSmeltingRecipe(RegistryManager.ore_copper);
            removeSmeltingRecipe(RegistryManager.ore_lead);
            removeSmeltingRecipe(RegistryManager.ore_nickel);
            removeSmeltingRecipe(RegistryManager.ore_silver);
            removeSmeltingRecipe(RegistryManager.ore_tin);

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
}
