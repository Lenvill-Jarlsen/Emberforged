package com.Lenvill;

import com.google.common.collect.Lists;
import minefantasy.mfr.registry.recipe.DummyRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.register.ItemRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class CraftingInit {
    public static void removeRecipes() {
        if (Config.recipeChanges) {
            ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;

            //Remove Ember's Plates
            if(Config.disableEmbersPlates) {
                if (ConfigMaterial.ALUMINUM.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_ALUMINUM);
                }
                if (ConfigMaterial.BRONZE.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_BRONZE);
                }
                if (ConfigMaterial.COPPER.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_COPPER);
                }
                if (ConfigMaterial.DAWNSTONE.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_DAWNSTONE);
                }
                if (ConfigMaterial.ELECTRUM.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_ELECTRUM);
                }
                if (ConfigMaterial.GOLD.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_GOLD);
                }
                if (ConfigMaterial.IRON.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_IRON);
                }
                if (ConfigMaterial.LEAD.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_LEAD);
                }
                if (ConfigMaterial.NICKEL.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_NICKEL);
                }
                if (ConfigMaterial.SILVER.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_SILVER);
                }
                if (ConfigMaterial.TIN.mustLoad()) {
                    manualRemover(ItemRegister.PLATE_TIN);
                }
            }

            //The rest of the recipe removals
            recipeRegistry.remove(getRL("alchemy_pedestal"));
            recipeRegistry.remove(getRL("alchemy_tablet"));
            recipeRegistry.remove(getRL("ashen_cloak_chest"));
            recipeRegistry.remove(getRL("beam_cannon"));
            recipeRegistry.remove(getRL("beam_splitter"));
            recipeRegistry.remove(getRL("bin"));
            recipeRegistry.remove(getRL("breaker"));

            recipeRegistry.remove(getRL("blend_caminite"));

            recipeRegistry.remove(getRL("plate_caminite_raw"));
            recipeRegistry.remove(getRL("stamp_bar_raw"));
            recipeRegistry.remove(getRL("stamp_flat_raw"));
            recipeRegistry.remove(getRL("stamp_plate_raw"));
            recipeRegistry.remove(getRL("stamp_gear_raw"));
            recipeRegistry.remove(getRL("stamp_rod_raw"));
            recipeRegistry.remove(getRL("stamp_round_raw"));

            recipeRegistry.remove(getRL("caster_orb"));
            recipeRegistry.remove(getRL("catalyzer"));
            recipeRegistry.remove(getRL("charger"));
            recipeRegistry.remove(getRL("cinder_plinth"));
            recipeRegistry.remove(getRL("clockwork_attenuator"));
            recipeRegistry.remove(getRL("axe_clockwork"));
            recipeRegistry.remove(getRL("pickaxe_clockwork"));
            recipeRegistry.remove(getRL("combustor"));
            recipeRegistry.remove(getRL("crystal_cell"));
            recipeRegistry.remove(getRL("dawnstone_mail"));
            recipeRegistry.remove(getRL("diffraction_barrel"));
            recipeRegistry.remove(getRL("ember_activator"));
            recipeRegistry.remove(getRL("ember_belt"));
            recipeRegistry.remove(getRL("ember_bore"));
            recipeRegistry.remove(getRL("ember_bulb"));
            recipeRegistry.remove(getRL("ember_cartridge"));
            recipeRegistry.remove(getRL("ember_funnel"));
            recipeRegistry.remove(getRL("ember_gauge"));
            recipeRegistry.remove(getRL("ember_injector"));
            recipeRegistry.remove(getRL("ember_jar"));
            recipeRegistry.remove(getRL("ember_pulser"));
            recipeRegistry.remove(getRL("ember_relay"));
            recipeRegistry.remove(getRL("ember_siphon"));
            recipeRegistry.remove(getRL("staff_ember"));
            recipeRegistry.remove(getRL("fluid_gauge"));
            recipeRegistry.remove(getRL("pipe"));
            recipeRegistry.remove(getRL("fluid_transfer"));
            recipeRegistry.remove(getRL("glimmer_lamp"));
            recipeRegistry.remove(getRL("grandhammer"));
            recipeRegistry.remove(getRL("heat_coil"));
            recipeRegistry.remove(getRL("ignition_cannon"));
            recipeRegistry.remove(getRL("inferno_forge"));
            recipeRegistry.remove(getRL("item_pipe"));
            recipeRegistry.remove(getRL("item_request"));
            recipeRegistry.remove(getRL("item_transfer"));
            recipeRegistry.remove(getRL("jet_augment"));
            recipeRegistry.remove(getRL("block_lantern"));
            recipeRegistry.remove(getRL("mech_accessor"));
            recipeRegistry.remove(getRL("mech_core"));
            recipeRegistry.remove(getRL("mechanical_pump"));
            recipeRegistry.remove(getRL("mini_boiler"));
            recipeRegistry.remove(getRL("mixer"));
            recipeRegistry.remove(getRL("reaction_chamber"));
            recipeRegistry.remove(getRL("reactor"));
            recipeRegistry.remove(getRL("resonating_bell"));
            recipeRegistry.remove(getRL("spark_plug"));
            recipeRegistry.remove(getRL("stirling"));
            recipeRegistry.remove(getRL("superheater"));
            recipeRegistry.remove(getRL("block_tank"));
            recipeRegistry.remove(getRL("tinker_hammer"));
            recipeRegistry.remove(getRL("tinker_lens"));
        }
    }

    public static ResourceLocation getRL(String name){
        return new ResourceLocation("embers",name);
    }

    //To be used on stubborn recipes that don't get removed by just calling .remove
    private static void manualRemover(Item item){
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;
        ArrayList<IRecipe> recipe = Lists.newArrayList(recipeRegistry.getValues());
        for (IRecipe r : recipe){
            ItemStack output = r.getRecipeOutput();
            if (output.getItem() == item){
                recipeRegistry.remove(r.getRegistryName());
            }
        }
    }

    //Here if I decide to use it later
    private static void mfrRemoveRecipes(final Item output) {
        mfrRemoveRecipes(recipe -> {
            final ItemStack recipeOutput = recipe.getRecipeOutput();
            return !recipeOutput.isEmpty() && recipeOutput.getItem() == output;
        });
    }

    private static int mfrRemoveRecipes(final Predicate<IRecipe> predicate) {
        final IForgeRegistry<IRecipe> registry = ForgeRegistries.RECIPES;
        final List<IRecipe> toRemove = new ArrayList<>();

        for (final IRecipe recipe : registry) {
            if (predicate.test(recipe)) {
                toRemove.add(recipe);
            }
        }

        toRemove.forEach(recipe -> {
            final ResourceLocation registryName = Objects.requireNonNull(recipe.getRegistryName());
            final IRecipe replacement = new DummyRecipe().setRegistryName(registryName);
            registry.register(replacement);
        });

        return 0;
    }
}
