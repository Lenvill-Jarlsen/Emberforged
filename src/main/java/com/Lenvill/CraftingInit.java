package com.Lenvill;

import minefantasy.mfr.recipe.DummyRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import teamroots.embers.RegistryManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class CraftingInit {

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
    public static void removeRecipes() {
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;

        recipeRegistry.remove(RegistryManager.alchemy_pedestal.getRegistryName());
        recipeRegistry.remove(RegistryManager.alchemy_tablet.getRegistryName());
        recipeRegistry.remove(RegistryManager.ashen_cloak_chest.getRegistryName());
        recipeRegistry.remove(RegistryManager.beam_cannon.getRegistryName());
        recipeRegistry.remove(RegistryManager.beam_splitter.getRegistryName());
        recipeRegistry.remove(RegistryManager.bin.getRegistryName());
        recipeRegistry.remove(RegistryManager.caster_orb.getRegistryName());
        recipeRegistry.remove(RegistryManager.catalyzer.getRegistryName());
        recipeRegistry.remove(RegistryManager.charger.getRegistryName());
        recipeRegistry.remove(RegistryManager.cinder_plinth.getRegistryName());
        recipeRegistry.remove(RegistryManager.clockwork_attenuator.getRegistryName());
        recipeRegistry.remove(RegistryManager.axe_clockwork.getRegistryName());
        recipeRegistry.remove(RegistryManager.combustor.getRegistryName());
        recipeRegistry.remove(RegistryManager.crystal_cell.getRegistryName());
        recipeRegistry.remove(RegistryManager.diffraction_barrel.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_activator.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_bore.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_cartridge.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_funnel.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_gauge.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_injector.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_pulser.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_relay.getRegistryName());
        recipeRegistry.remove(RegistryManager.ember_siphon.getRegistryName());
        recipeRegistry.remove(RegistryManager.staff_ember.getRegistryName());
        recipeRegistry.remove(RegistryManager.fluid_gauge.getRegistryName());
        recipeRegistry.remove(RegistryManager.pipe.getRegistryName());
        recipeRegistry.remove(RegistryManager.fluid_transfer.getRegistryName());
        recipeRegistry.remove(RegistryManager.glimmer_lamp.getRegistryName());
        recipeRegistry.remove(RegistryManager.heat_coil.getRegistryName());
        recipeRegistry.remove(RegistryManager.ignition_cannon.getRegistryName());
        recipeRegistry.remove(RegistryManager.inferno_forge.getRegistryName());
        recipeRegistry.remove(RegistryManager.item_transfer.getRegistryName());
        recipeRegistry.remove(RegistryManager.jet_augment.getRegistryName());
        recipeRegistry.remove(RegistryManager.block_lantern.getRegistryName());
        recipeRegistry.remove(RegistryManager.mech_accessor.getRegistryName());
        recipeRegistry.remove(RegistryManager.mech_core.getRegistryName());
        recipeRegistry.remove(RegistryManager.pump.getRegistryName());
        recipeRegistry.remove(RegistryManager.mini_boiler.getRegistryName());
        recipeRegistry.remove(RegistryManager.mixer.getRegistryName());
        recipeRegistry.remove(RegistryManager.reactor.getRegistryName());
        recipeRegistry.remove(RegistryManager.resonating_bell.getRegistryName());
        recipeRegistry.remove(RegistryManager.spark_plug.getRegistryName());
        recipeRegistry.remove(RegistryManager.stirling.getRegistryName());
        recipeRegistry.remove(RegistryManager.superheater.getRegistryName());
        recipeRegistry.remove(RegistryManager.block_tank.getRegistryName());
        recipeRegistry.remove(RegistryManager.tinker_hammer.getRegistryName());
        recipeRegistry.remove(RegistryManager.tinker_lens.getRegistryName());

        //mfrRemoveRecipes(RegistryManager.plate_copper);
    }
}
