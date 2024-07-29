package com.Lenvill;

import minefantasy.mfr.recipe.DummyRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import teamroots.embers.ConfigManager;
import teamroots.embers.RegistryManager;
import teamroots.embers.compat.BaublesIntegration;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class CraftingInit {
    public static ResourceLocation getRL(String name){
        return new ResourceLocation("embers",name);
    }

    public static void removeRecipes() {
        if (Config.enableChanges) {
            ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;

            //Remove Ember's Plates
            if(Config.disableEmbersPlates) {
                if (ConfigManager.enableAluminum) {
                    recipeRegistry.remove(getRL("ingotaluminium_plate"));
                }
                if (ConfigManager.enableBronze) {
                    recipeRegistry.remove(getRL("ingotbronze_plate"));
                }
                recipeRegistry.remove(getRL("ingotcopper_plate"));
                recipeRegistry.remove(getRL("ingotdawnstone_plate"));
                if (ConfigManager.enableElectrum) {
                    recipeRegistry.remove(getRL("ingotelectrum_plate"));
                }
                recipeRegistry.remove(RegistryManager.plate_gold.getRegistryName());
                recipeRegistry.remove(RegistryManager.plate_iron.getRegistryName());
                recipeRegistry.remove(getRL("ingotlead_plate"));
                if (ConfigManager.enableNickel) {
                    recipeRegistry.remove(getRL("ingotnickel_plate"));
                }
                recipeRegistry.remove(getRL("ingotsilver_plate"));
                if (ConfigManager.enableTin) {
                    recipeRegistry.remove(getRL("ingottin_plate"));
                }
            }

            recipeRegistry.remove(RegistryManager.item_pipe.getRegistryName());
            recipeRegistry.remove(RegistryManager.breaker.getRegistryName());
            recipeRegistry.remove(RegistryManager.item_request.getRegistryName());

            //The rest of the recipe removals
            if (Config.hcAlchemyPedestal) {
                recipeRegistry.remove(RegistryManager.alchemy_pedestal.getRegistryName());
            }
            if (Config.hcAlchemyTablet) {
                recipeRegistry.remove(RegistryManager.alchemy_tablet.getRegistryName());
            }
            if (Config.hcAshenCloak) {
                recipeRegistry.remove(RegistryManager.ashen_cloak_chest.getRegistryName());
            }
            if (Config.hcBeamCannon) {
                recipeRegistry.remove(RegistryManager.beam_cannon.getRegistryName());
            }
            if (Config.hcBeamSplitter) {
                recipeRegistry.remove(RegistryManager.beam_splitter.getRegistryName());
            }
            if (Config.hcBin) {
                recipeRegistry.remove(RegistryManager.bin.getRegistryName());
            }
            if(Config.hcCaminiteBlend) {
                recipeRegistry.remove(RegistryManager.blend_caminite.getRegistryName());
            }
            if(Config.hcCaminiteFiring){
                recipeRegistry.remove(RegistryManager.plate_caminite_raw.getRegistryName());
                recipeRegistry.remove(RegistryManager.stamp_bar_raw.getRegistryName());
                recipeRegistry.remove(RegistryManager.stamp_flat_raw.getRegistryName());
                recipeRegistry.remove(RegistryManager.stamp_plate_raw.getRegistryName());
                recipeRegistry.remove(RegistryManager.stamp_gear_raw.getRegistryName());
            }
            if (Config.hcCasterOrb) {
                recipeRegistry.remove(RegistryManager.caster_orb.getRegistryName());
            }
            if (Config.hcCatalyzer) {
                recipeRegistry.remove(RegistryManager.catalyzer.getRegistryName());
            }
            if (Config.hcCharger) {
                recipeRegistry.remove(RegistryManager.charger.getRegistryName());
            }
            if (Config.hcCinderPlinth) {
                recipeRegistry.remove(RegistryManager.cinder_plinth.getRegistryName());
            }
            if (Config.hcClockworkAttenuator && !ConfigManager.enableElectrum) {
                recipeRegistry.remove(RegistryManager.clockwork_attenuator.getRegistryName());
            }
            if (Config.hcClockworkAxe) {
                recipeRegistry.remove(RegistryManager.axe_clockwork.getRegistryName());
            }
            if(Config.hcClockworkPickaxe) {
                recipeRegistry.remove(RegistryManager.pickaxe_clockwork.getRegistryName());
            }
            if (Config.hcCombustor) {
                recipeRegistry.remove(RegistryManager.combustor.getRegistryName());
            }
            if (Config.hcCrystalCell) {
                recipeRegistry.remove(RegistryManager.crystal_cell.getRegistryName());
            }
            if (Config.hcDawnstoneMail) {
                recipeRegistry.remove(BaublesIntegration.dawnstone_mail.getRegistryName());
            }
            if (Config.hcDiffractionBarrel) {
                recipeRegistry.remove(RegistryManager.diffraction_barrel.getRegistryName());
            }
            if (Config.hcEmberActivator) {
                recipeRegistry.remove(RegistryManager.ember_activator.getRegistryName());
            }
            if (Config.hcEmberBelt) {
                recipeRegistry.remove(BaublesIntegration.ember_belt.getRegistryName());
            }
            if (Config.hcEmberBore) {
                recipeRegistry.remove(RegistryManager.ember_bore.getRegistryName());
            }
            if (Config.hcEmberBulb) {
                recipeRegistry.remove(BaublesIntegration.mantle_bulb.getRegistryName());
            }
            if (Config.hcEmberCartridge) {
                recipeRegistry.remove(RegistryManager.ember_cartridge.getRegistryName());
            }
            if (Config.hcEmberFunnel) {
                recipeRegistry.remove(RegistryManager.ember_funnel.getRegistryName());
            }
            if (Config.hcEmberGauge) {
                recipeRegistry.remove(RegistryManager.ember_gauge.getRegistryName());
            }
            if (Config.hcEmberInjector) {
                recipeRegistry.remove(RegistryManager.ember_injector.getRegistryName());
            }
            if(Config.hcEmberJar) {
                recipeRegistry.remove(RegistryManager.ember_jar.getRegistryName());
            }
            if (Config.hcEmberPulser) {
                recipeRegistry.remove(RegistryManager.ember_pulser.getRegistryName());
            }
            if (Config.hcEmberRelay) {
                recipeRegistry.remove(RegistryManager.ember_relay.getRegistryName());
            }
            if (Config.hcEmberSiphon) {
                recipeRegistry.remove(RegistryManager.ember_siphon.getRegistryName());
            }
            if (Config.hcEmberStaff) {
                recipeRegistry.remove(RegistryManager.staff_ember.getRegistryName());
            }
            if (Config.hcFluidGauge) {
                recipeRegistry.remove(RegistryManager.fluid_gauge.getRegistryName());
            }
            if (Config.hcFluidPipe) {
                recipeRegistry.remove(RegistryManager.pipe.getRegistryName());
            }
            if (Config.hcFluidTransfer) {
                recipeRegistry.remove(RegistryManager.fluid_transfer.getRegistryName());
            }
            if (Config.hcGlimmerLamp) {
                recipeRegistry.remove(RegistryManager.glimmer_lamp.getRegistryName());
            }
            if(Config.hcGrandhammer) {
                recipeRegistry.remove(RegistryManager.grandhammer.getRegistryName());
            }
            if (Config.hcHearthCoil) {
                recipeRegistry.remove(RegistryManager.heat_coil.getRegistryName());
            }
            if (Config.hcIgnitionCannon) {
                recipeRegistry.remove(RegistryManager.ignition_cannon.getRegistryName());
            }
            if (Config.hcInfernoForge) {
                recipeRegistry.remove(RegistryManager.inferno_forge.getRegistryName());
            }
            if (Config.hcItemTransfer) {
                recipeRegistry.remove(RegistryManager.item_transfer.getRegistryName());
            }
            if (Config.hcJetAugment) {
                recipeRegistry.remove(RegistryManager.jet_augment.getRegistryName());
            }
            if (Config.hcLantern) {
                recipeRegistry.remove(RegistryManager.block_lantern.getRegistryName());
            }
            if (Config.hcMechAccessor) {
                recipeRegistry.remove(RegistryManager.mech_accessor.getRegistryName());
            }
            if (Config.hcMechanicalCore) {
                recipeRegistry.remove(RegistryManager.mech_core.getRegistryName());
            }
            if (Config.hcMechanicalPump) {
                recipeRegistry.remove(RegistryManager.mechanical_pump.getRegistryName());
            }
            if (Config.hcMiniBoiler) {
                recipeRegistry.remove(RegistryManager.mini_boiler.getRegistryName());
            }
            if (Config.hcMixer) {
                recipeRegistry.remove(RegistryManager.mixer.getRegistryName());
            }
            if (Config.hcReactor) {
                recipeRegistry.remove(RegistryManager.reactor.getRegistryName());
            }
            if (Config.hcResonatingBell) {
                recipeRegistry.remove(RegistryManager.resonating_bell.getRegistryName());
            }
            if (Config.hcSparkPlug) {
                recipeRegistry.remove(RegistryManager.spark_plug.getRegistryName());
            }
            if (Config.hcStirling) {
                recipeRegistry.remove(RegistryManager.stirling.getRegistryName());
            }
            if (Config.hcSuperheater) {
                recipeRegistry.remove(RegistryManager.superheater.getRegistryName());
            }
            if (Config.hcTank) {
                recipeRegistry.remove(RegistryManager.block_tank.getRegistryName());
            }
            if (Config.hcTinkerHammer) {
                recipeRegistry.remove(RegistryManager.tinker_hammer.getRegistryName());
            }
            if (Config.hcTinkerLens) {
                recipeRegistry.remove(RegistryManager.tinker_lens.getRegistryName());
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
