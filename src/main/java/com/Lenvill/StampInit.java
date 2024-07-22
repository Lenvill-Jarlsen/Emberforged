package com.Lenvill;

import com.Lenvill.fluids.FluidInit;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.item.ItemMetalComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreIngredient;
import teamroots.embers.ConfigManager;
import teamroots.embers.RegistryManager;
import teamroots.embers.recipe.ItemStampingRecipe;
import teamroots.embers.recipe.RecipeRegistry;

import static minefantasy.mfr.init.MineFantasyItems.PLATE;

public class StampInit {

    public static void initStamps() {

        //Removes old embers recipes and adds in new MFR equivalents
        if(Config.enableChanges) {
            stampTransformer(RegistryManager.fluid_molten_copper, "copper");

            if(ConfigManager.enableTin) {
                stampTransformer(RegistryManager.fluid_molten_tin, "tin");
            }else{
                stampAdder(RegistryManager.fluid_molten_tin, "tin");
            }

            if (ConfigManager.enableBronze) {
                stampTransformer(RegistryManager.fluid_molten_bronze, "bronze");
            }else{
                stampAdder(RegistryManager.fluid_molten_bronze, "bronze");
            }

            stampTransformer(RegistryManager.fluid_molten_iron, "iron");

            stampTransformer(RegistryManager.fluid_molten_silver, "silver");

            stampTransformer(RegistryManager.fluid_molten_gold, "gold");

            stampTransformer(RegistryManager.fluid_molten_dawnstone, "dawnstone");

            stampTransformer(RegistryManager.fluid_molten_lead, "lead");
        }

        if(ConfigManager.enableAluminum) {
            stampTransformer(RegistryManager.fluid_molten_aluminum, "aluminum");
        }
        if(ConfigManager.enableElectrum) {
            stampTransformer(RegistryManager.fluid_molten_electrum, "electrum");
        }
        if(ConfigManager.enableNickel) {
            stampTransformer(RegistryManager.fluid_molten_nickel, "nickel");
        }

        //Add support for MFR metals not covered in Embers
        stampAdder(FluidInit.molten_steel, "steel");
        stampAdder(FluidInit.molten_pig_iron, "pig_iron");
        stampAdder(FluidInit.molten_black_steel, "black_steel");
        stampAdder(FluidInit.molten_blue_steel, "blue_steel");
        stampAdder(FluidInit.molten_red_steel, "red_steel");
        stampAdder(FluidInit.molten_adamantium, "adamantium");
        stampAdder(FluidInit.molten_mithril, "mithril");
        stampAdder(FluidInit.molten_ignotumite, "ignotumite");
        stampAdder(FluidInit.molten_mithium, "mithium");
        stampAdder(FluidInit.molten_enderforge, "ender");
        stampAdder(FluidInit.molten_tungsten, "tungsten");

        //And some other misc stamper recipes
        Ingredient stampFlat = Ingredient.fromItem(RegistryManager.stamp_flat);
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(new OreIngredient("stoneLimestone"),null, stampFlat,new ItemStack(MineFantasyItems.FLUX,4)));
    }

    //Function to standardize the removal of recipes from the stamper
    private static void stampRemover(Fluid fluid) {
        int plateAmount = ConfigManager.stampPlateAmount * RecipeRegistry.INGOT_AMOUNT;
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), new ItemStack(RegistryManager.stamp_bar, 1)));
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, plateAmount), new ItemStack(RegistryManager.stamp_plate, 1)));
    }

    //Function to standardize the addition of recipes to the stamper
    private static void stampAdder(Fluid fluid, String material) {
        int plateAmount = 2 * RecipeRegistry.INGOT_AMOUNT;
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar(material)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, plateAmount), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack(material, 1)));
    }

    //Combo function to just make everything super easy
    private static void stampTransformer(Fluid fluid, String material) {
        int plateAmount = ConfigManager.stampPlateAmount * RecipeRegistry.INGOT_AMOUNT;
        int mfrPlateAmount = 2 * RecipeRegistry.INGOT_AMOUNT;

        //Bars first
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), new ItemStack(RegistryManager.stamp_bar, 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(RegistryManager.stamp_bar), MineFantasyItems.bar(material)));

        //Then plates
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, plateAmount), new ItemStack(RegistryManager.stamp_plate, 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, mfrPlateAmount), Ingredient.fromItem(RegistryManager.stamp_plate), ((ItemMetalComponent) PLATE).createComponentItemStack(material, 1)));
    }
}
