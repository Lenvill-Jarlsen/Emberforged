package com.Lenvill.fluids;

import com.Lenvill.item.EmberforgedItems;
import minefantasy.mfr.init.MineFantasyItems;
import minefantasy.mfr.item.ItemMetalComponent;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreIngredient;
import teamroots.embers.ConfigManager;
import teamroots.embers.RegistryManager;
import teamroots.embers.recipe.ItemMeltingRecipe;
import teamroots.embers.recipe.RecipeRegistry;

import java.awt.*;

public class FluidInit {

    public static MoltenFluid molten_steel;
    public static MoltenFluid molten_pig_iron;
    public static MoltenFluid molten_black_steel;
    public static MoltenFluid molten_blue_steel;
    public static MoltenFluid molten_red_steel;
    public static MoltenFluid molten_adamantium;
    public static MoltenFluid molten_mithril;
    public static MoltenFluid molten_ignotumite;
    public static MoltenFluid molten_mithium;
    public static MoltenFluid molten_enderforge;
    public static MoltenFluid molten_tungsten;

    public static void preInitFluids(FMLPreInitializationEvent event) {
        initFluids();
        registerFluids();
    }

    private static void initFluids() {
        molten_steel = new MoltenFluid("molten_steel", new Color(206, 199, 206));
        molten_pig_iron = new MoltenFluid("molten_pig_iron", new Color(94, 92, 90));
        molten_black_steel = new MoltenFluid("molten_black_steel", new Color(26, 25, 25));
        molten_blue_steel = new MoltenFluid("molten_blue_steel", new Color(13, 13, 217));
        molten_red_steel = new MoltenFluid("molten_red_steel", new Color(218, 13, 13));
        molten_adamantium = new MoltenFluid("molten_adamantium", new Color(31, 119, 8));
        molten_mithril = new MoltenFluid("molten_mithril", new Color(255, 1, 234));
        molten_ignotumite = new MoltenFluid("molten_ignotumite", new Color(13, 238, 13));
        molten_mithium = new MoltenFluid("molten_mithium", new Color(0, 229, 253));
        molten_enderforge = new MoltenFluid("molten_enderforge", new Color(148, 16, 203));
        molten_tungsten = new MoltenFluid("molten_tungsten", new Color(7, 75, 14));
    }

    private static void registerFluids() {
        FluidRegistry.registerFluid(molten_steel);
        FluidRegistry.addBucketForFluid(molten_steel);
        FluidRegistry.registerFluid(molten_pig_iron);
        FluidRegistry.addBucketForFluid(molten_pig_iron);
        FluidRegistry.registerFluid(molten_black_steel);
        FluidRegistry.addBucketForFluid(molten_black_steel);
        FluidRegistry.registerFluid(molten_blue_steel);
        FluidRegistry.addBucketForFluid(molten_blue_steel);
        FluidRegistry.registerFluid(molten_red_steel);
        FluidRegistry.addBucketForFluid(molten_red_steel);
        FluidRegistry.registerFluid(molten_adamantium);
        FluidRegistry.addBucketForFluid(molten_adamantium);
        FluidRegistry.registerFluid(molten_mithril);
        FluidRegistry.addBucketForFluid(molten_mithril);
        FluidRegistry.registerFluid(molten_ignotumite);
        FluidRegistry.addBucketForFluid(molten_ignotumite);
        FluidRegistry.registerFluid(molten_mithium);
        FluidRegistry.addBucketForFluid(molten_mithium);
        FluidRegistry.registerFluid(molten_enderforge);
        FluidRegistry.addBucketForFluid(molten_enderforge);
        FluidRegistry.registerFluid(molten_tungsten);
        FluidRegistry.addBucketForFluid(molten_tungsten);
    }

    public static void addFluidRecipes() {
        meltAdd(MineFantasyItems.STEEL_INGOT, molten_steel);
        meltAdd(MineFantasyItems.PIG_IRON_INGOT, molten_pig_iron);
        meltAdd(MineFantasyItems.BLACK_STEEL_INGOT, molten_black_steel);
        meltAdd(MineFantasyItems.BLUE_STEEL_INGOT, molten_blue_steel);
        meltAdd(MineFantasyItems.RED_STEEL_INGOT, molten_red_steel);
        meltAdd(MineFantasyItems.ADAMANTIUM_INGOT, molten_adamantium);
        meltAdd(MineFantasyItems.MITHRIL_INGOT, molten_mithril);
        meltAdd(MineFantasyItems.IGNOTUMITE_INGOT, molten_ignotumite);
        meltAdd(MineFantasyItems.MITHIUM_INGOT, molten_mithium);
        meltAdd(MineFantasyItems.ENDER_INGOT, molten_enderforge);
        meltAdd(MineFantasyItems.TUNGSTEN_INGOT, molten_tungsten);

        meltAdd("tin", RegistryManager.fluid_molten_tin);
        meltAdd("copper", RegistryManager.fluid_molten_copper);
        meltAdd("bronze", RegistryManager.fluid_molten_bronze);
        meltAdd("iron", RegistryManager.fluid_molten_iron);
        meltAdd("pig_iron", molten_pig_iron);
        meltAdd("steel", molten_steel);
        meltAdd("black_steel", molten_black_steel);
        meltAdd("blue_steel", molten_blue_steel);
        meltAdd("red_steel", molten_red_steel);

        meltAdd("silver", RegistryManager.fluid_molten_silver);
        meltAdd("gold", RegistryManager.fluid_molten_gold);

        meltAdd("adamantium", molten_adamantium);
        meltAdd("mithril", molten_mithril);
        meltAdd("ignotumite", molten_ignotumite);
        meltAdd("mithium", molten_mithium);
        meltAdd("ender", molten_enderforge);
        meltAdd("tungsten", molten_tungsten);

        meltAdd("dawnstone", RegistryManager.fluid_molten_dawnstone);
        meltAdd("lead", RegistryManager.fluid_molten_lead);

        if(ConfigManager.enableAluminum) {
            meltAdd("Aluminum", RegistryManager.fluid_molten_nickel);
        }
        if(ConfigManager.enableElectrum) {
            meltAdd("Aluminum", RegistryManager.fluid_molten_nickel);
        }
        if(ConfigManager.enableNickel) {
            meltAdd("nickel", RegistryManager.fluid_molten_nickel);
        }

        //A couple of specific recipes
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromItem(EmberforgedItems.runed_dawnstone_plate),new FluidStack(RegistryManager.fluid_molten_dawnstone, 288)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromItem(EmberforgedItems.runed_copper_plate),new FluidStack(RegistryManager.fluid_molten_copper, 288)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromItem(EmberforgedItems.runed_iron_plate),new FluidStack(RegistryManager.fluid_molten_iron, 288)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromItem(EmberforgedItems.runed_silver_plate),new FluidStack(RegistryManager.fluid_molten_silver, 288)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromItem(EmberforgedItems.gilded_lead_scales),new FluidStack(RegistryManager.fluid_molten_lead, 144)));
    }

    private static void meltAdd(String material, Fluid fluid) {
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromStacks(MineFantasyItems.bar(material)),new FluidStack(fluid, 144)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromStacks(((ItemMetalComponent) MineFantasyItems.CHAIN_MESH).createComponentItemStack(material, 1)),new FluidStack(fluid, 144)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SCALE_MESH).createComponentItemStack(material, 1)),new FluidStack(fluid, 144)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromStacks(((ItemMetalComponent) MineFantasyItems.SPLINT_MESH).createComponentItemStack(material, 1)),new FluidStack(fluid, 144)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromStacks(((ItemMetalComponent) MineFantasyItems.METAL_HUNK).createComponentItemStack(material, 1)),new FluidStack(fluid, 36)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromStacks(((ItemMetalComponent) MineFantasyItems.PLATE).createComponentItemStack(material, 1)),new FluidStack(fluid, 288)));
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(OreIngredient.fromStacks(((ItemMetalComponent) MineFantasyItems.PLATE_HUGE).createComponentItemStack(material, 1)),new FluidStack(fluid, 576)));
    }

    private static void meltAdd(Item item, Fluid fluid) {
        RecipeRegistry.meltingRecipes.add(new ItemMeltingRecipe(Ingredient.fromItem(item),new FluidStack(fluid, 144)));
    }

}
