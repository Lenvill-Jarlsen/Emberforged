package com.Lenvill;

import com.Lenvill.fluids.FluidInit;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.item.ItemMetalComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreIngredient;
import teamroots.embers.config.ConfigMachine;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.recipe.ItemStampingRecipe;
import teamroots.embers.recipe.RecipeRegistry;
import teamroots.embers.register.FluidRegister;
import teamroots.embers.register.ItemRegister;

import static minefantasy.mfr.init.MineFantasyItems.PLATE;

public class StampInit {

    public static void initStamps() {

        //Removes old embers recipes and adds in new MFR equivalents
        if(Config.enableChanges) {
            stampTransformer(FluidRegister.FLUID_MOLTEN_COPPER, "copper");

            if(ConfigMaterial.TIN.mustLoad()) {
                stampTransformer(FluidRegister.FLUID_MOLTEN_TIN, "tin");
            }else{
                stampAdder(FluidRegister.FLUID_MOLTEN_TIN, "tin");
            }

            if(ConfigMaterial.BRONZE.mustLoad()) {
                stampTransformer(FluidRegister.FLUID_MOLTEN_BRONZE, "bronze");
            }else{
                stampAdder(FluidRegister.FLUID_MOLTEN_BRONZE, "bronze");
            }

            if(ConfigMaterial.IRON.mustLoad()) {
                stampTransformer(FluidRegister.FLUID_MOLTEN_IRON, "iron");
            }else{
                stampAdder(FluidRegister.FLUID_MOLTEN_IRON, "iron");
            }

            if(ConfigMaterial.SILVER.mustLoad()) {
                stampTransformer(FluidRegister.FLUID_MOLTEN_SILVER, "silver");
            }else{
                stampAdder(FluidRegister.FLUID_MOLTEN_IRON, "silver");
            }

            if(ConfigMaterial.GOLD.mustLoad()) {
                stampTransformer(FluidRegister.FLUID_MOLTEN_GOLD, "gold");
            }else{
                stampAdder(FluidRegister.FLUID_MOLTEN_GOLD, "gold");
            }

            if(ConfigMaterial.DAWNSTONE.mustLoad()) {
                stampTransformer(FluidRegister.FLUID_MOLTEN_DAWNSTONE, "dawnstone");
            }

            if(ConfigMaterial.LEAD.mustLoad()) {
                stampTransformer(FluidRegister.FLUID_MOLTEN_LEAD, "lead");
            }
        }

        if(ConfigMaterial.ALUMINUM.mustLoad() && Config.registerAluminum) {
            stampTransformer(FluidRegister.FLUID_MOLTEN_ALUMINUM, "aluminum");
        }
        if(ConfigMaterial.ELECTRUM.mustLoad() && Config.registerElectrum) {
            stampTransformer(FluidRegister.FLUID_MOLTEN_ELECTRUM, "electrum");
        }
        if(ConfigMaterial.NICKEL.mustLoad() && Config.registerNickel) {
            stampTransformer(FluidRegister.FLUID_MOLTEN_NICKEL, "nickel");
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
        Ingredient stampFlat = Ingredient.fromItem(ItemRegister.STAMP_FLAT);
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(new OreIngredient("stoneLimestone"),null, stampFlat,new ItemStack(MineFantasyItems.FLUX,4)));
    }

    //Function to standardize the removal of recipes from the stamper
    private static void stampRemover(Fluid fluid) {
        int plateAmount = ConfigMachine.STAMPER.stampPlateAmount * RecipeRegistry.INGOT_AMOUNT;
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), new ItemStack(ItemRegister.STAMP_BAR, 1)));
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, plateAmount), new ItemStack(ItemRegister.STAMP_PLATE, 1)));
    }

    //Function to standardize the addition of recipes to the stamper
    private static void stampAdder(Fluid fluid, String material) {
        int plateAmount = 2 * RecipeRegistry.INGOT_AMOUNT;
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(ItemRegister.STAMP_BAR), MineFantasyItems.bar(material)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, plateAmount), Ingredient.fromItem(ItemRegister.STAMP_PLATE), ((ItemMetalComponent) PLATE).createComponentItemStack(material, 1)));
    }

    //Combo function to just make everything super easy
    private static void stampTransformer(Fluid fluid, String material) {
        int plateAmount = ConfigMachine.STAMPER.stampPlateAmount * RecipeRegistry.INGOT_AMOUNT;
        int mfrPlateAmount = 2 * RecipeRegistry.INGOT_AMOUNT;

        //Bars first
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), new ItemStack(ItemRegister.STAMP_BAR, 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, RecipeRegistry.INGOT_AMOUNT), Ingredient.fromItem(ItemRegister.STAMP_BAR), MineFantasyItems.bar(material)));

        //Then plates
        RecipeRegistry.stampingRecipes.remove(RecipeRegistry.getStampingRecipe(ItemStack.EMPTY, new FluidStack(fluid, plateAmount), new ItemStack(ItemRegister.STAMP_PLATE, 1)));
        RecipeRegistry.stampingRecipes.add(new ItemStampingRecipe(Ingredient.EMPTY, new FluidStack(fluid, mfrPlateAmount), Ingredient.fromItem(ItemRegister.STAMP_PLATE), ((ItemMetalComponent) PLATE).createComponentItemStack(material, 1)));
    }
}
