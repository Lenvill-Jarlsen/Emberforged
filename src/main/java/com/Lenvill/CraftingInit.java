package com.Lenvill;

import com.google.common.collect.Lists;
import minefantasy.mfr.recipe.DummyRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreIngredient;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryManager;
import teamroots.embers.compat.BaublesIntegration;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.config.ConfigTool;
import teamroots.embers.register.BlockRegister;
import teamroots.embers.register.ItemRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class CraftingInit {
    public static void removeRecipes() {
        if (Config.enableChanges) {
            ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;

            //Remove Ember's Plates
            if(Config.disableEmbersPlates) {
                if (ConfigMaterial.ALUMINUM.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_aluminum"));
                    manualRemover(ItemRegister.PLATE_ALUMINUM);
                }
                if (ConfigMaterial.BRONZE.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_bronze"));
                    manualRemover(ItemRegister.PLATE_BRONZE);
                }
                if (ConfigMaterial.COPPER.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_copper"));
                    manualRemover(ItemRegister.PLATE_COPPER);
                }
                if (ConfigMaterial.DAWNSTONE.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_dawnstone"));
                    manualRemover(ItemRegister.PLATE_DAWNSTONE);
                }
                if (ConfigMaterial.ELECTRUM.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_electrum"));
                    manualRemover(ItemRegister.PLATE_ELECTRUM);
                }
                if (ConfigMaterial.GOLD.isNotOff()) {
                    //recipeRegistry.remove(getRL("plate_gold"));
                    manualRemover(ItemRegister.PLATE_GOLD);
                }
                if (ConfigMaterial.IRON.isNotOff()) {
                    //recipeRegistry.remove(getRL("plate_iron"));
                    manualRemover(ItemRegister.PLATE_IRON);
                }
                if (ConfigMaterial.LEAD.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_lead"));
                    manualRemover(ItemRegister.PLATE_LEAD);
                }
                if (ConfigMaterial.NICKEL.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_nickel"));
                    manualRemover(ItemRegister.PLATE_NICKEL);
                }
                if (ConfigMaterial.SILVER.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_silver"));
                    manualRemover(ItemRegister.PLATE_SILVER);
                }
                if (ConfigMaterial.TIN.mustLoad()) {
                    //recipeRegistry.remove(getRL("plate_tin"));
                    manualRemover(ItemRegister.PLATE_TIN);
                }
            }

            recipeRegistry.remove(getRL("item_pipe"));
            recipeRegistry.remove(getRL("breaker"));
            recipeRegistry.remove(getRL("item_request"));

            //The rest of the recipe removals
            if (Config.hcAlchemyPedestal) {
                recipeRegistry.remove(getRL("alchemy_pedestal"));
            }
            if (Config.hcAlchemyTablet) {
                recipeRegistry.remove(getRL("alchemy_tablet"));
            }
            if (Config.hcAshenCloak) {
                recipeRegistry.remove(getRL("ashen_cloak_chest"));
            }
            if (Config.hcBeamCannon) {
                recipeRegistry.remove(getRL("beam_cannon"));
            }
            if (Config.hcBeamSplitter) {
                recipeRegistry.remove(getRL("beam_splitter"));
            }
            if (Config.hcBin) {
                recipeRegistry.remove(getRL("bin"));
            }
            if(Config.hcCaminiteBlend) {
                recipeRegistry.remove(getRL("blend_caminite"));
            }
            if(Config.hcCaminiteFiring){
                recipeRegistry.remove(getRL("plate_caminite_raw"));
                recipeRegistry.remove(getRL("stamp_bar_raw"));
                recipeRegistry.remove(getRL("stamp_flat_raw"));
                recipeRegistry.remove(getRL("stamp_plate_raw"));
                recipeRegistry.remove(getRL("stamp_gear_raw"));
            }
            if (Config.hcCasterOrb) {
                recipeRegistry.remove(getRL("caster_orb"));
            }
            if (Config.hcCatalyzer) {
                recipeRegistry.remove(getRL("catalyzer"));
            }
            if (Config.hcCharger) {
                recipeRegistry.remove(getRL("charger"));
            }
            if (Config.hcCinderPlinth) {
                recipeRegistry.remove(getRL("cinder_plinth"));
            }
            if (Config.hcClockworkAttenuator) {
                recipeRegistry.remove(getRL("clockwork_attenuator"));
            }
            if (Config.hcClockworkAxe) {
                recipeRegistry.remove(getRL("axe_clockwork"));
            }
            if(Config.hcClockworkPickaxe) {
                recipeRegistry.remove(getRL("pickaxe_clockwork"));
            }
            if (Config.hcCombustor) {
                recipeRegistry.remove(getRL("combustor"));
            }
            if (Config.hcCrystalCell) {
                recipeRegistry.remove(getRL("crystal_cell"));
            }
            if (Config.hcDawnstoneMail) {
                recipeRegistry.remove(getRL("dawnstone_mail"));
            }
            if (Config.hcDiffractionBarrel) {
                recipeRegistry.remove(getRL("diffraction_barrel"));
            }
            if (Config.hcEmberActivator) {
                recipeRegistry.remove(getRL("ember_activator"));
            }
            if (Config.hcEmberBelt) {
                recipeRegistry.remove(getRL("ember_belt"));
            }
            if (Config.hcEmberBore) {
                //recipeRegistry.remove(getRL("ember_bore"));
            }
            if (Config.hcEmberBulb) {
                recipeRegistry.remove(getRL("ember_bulb"));
            }
            if (Config.hcEmberCartridge) {
                recipeRegistry.remove(getRL("ember_cartridge"));
            }
            if (Config.hcEmberFunnel) {
                recipeRegistry.remove(getRL("ember_funnel"));
            }
            if (Config.hcEmberGauge) {
                recipeRegistry.remove(getRL("ember_gauge"));
            }
            if (Config.hcEmberInjector) {
                recipeRegistry.remove(getRL("ember_injector"));
            }
            if(Config.hcEmberJar) {
                recipeRegistry.remove(getRL("ember_jar"));
            }
            if (Config.hcEmberPulser) {
                recipeRegistry.remove(getRL("ember_pulser"));
            }
            if (Config.hcEmberRelay) {
                recipeRegistry.remove(getRL("ember_relay"));
            }
            if (Config.hcEmberSiphon) {
                recipeRegistry.remove(getRL("ember_siphon"));
            }
            if (Config.hcEmberStaff) {
                recipeRegistry.remove(getRL("staff_ember"));
            }
            if (Config.hcFluidGauge) {
                recipeRegistry.remove(getRL("fluid_gauge"));
            }
            if (Config.hcFluidPipe) {
                recipeRegistry.remove(getRL("pipe"));
            }
            if (Config.hcFluidTransfer) {
                recipeRegistry.remove(getRL("fluid_transfer"));
            }
            if (Config.hcGlimmerLamp) {
                recipeRegistry.remove(getRL("glimmer_lamp"));
            }
            if(Config.hcGrandhammer) {
                recipeRegistry.remove(getRL("grandhammer"));
            }
            if (Config.hcHearthCoil) {
                recipeRegistry.remove(getRL("heat_coil"));
            }
            if (Config.hcIgnitionCannon) {
                recipeRegistry.remove(getRL("ignition_cannon"));
            }
            if (Config.hcInfernoForge) {
                recipeRegistry.remove(getRL("inferno_forge"));
            }
            if (Config.hcItemTransfer) {
                recipeRegistry.remove(getRL("item_transfer"));
            }
            if (Config.hcJetAugment) {
                recipeRegistry.remove(getRL("jet_augment"));
            }
            if (Config.hcLantern) {
                recipeRegistry.remove(getRL("block_lantern"));
            }
            if (Config.hcMechAccessor) {
                recipeRegistry.remove(getRL("mech_accessor"));
            }
            if (Config.hcMechanicalCore) {
                recipeRegistry.remove(getRL("mech_core"));
            }
            if (Config.hcMechanicalPump) {
                recipeRegistry.remove(getRL("mechanical_pump"));
            }
            if (Config.hcMiniBoiler) {
                recipeRegistry.remove(getRL("mini_boiler"));
            }
            if (Config.hcMixer) {
                recipeRegistry.remove(getRL("mixer"));
            }
            if (Config.hcReactor) {
                recipeRegistry.remove(getRL("reactor"));
            }
            if (Config.hcResonatingBell) {
                recipeRegistry.remove(getRL("resonating_bell"));
            }
            if (Config.hcSparkPlug) {
                recipeRegistry.remove(getRL("spark_plug"));
            }
            if (Config.hcStirling) {
                recipeRegistry.remove(getRL("stirling"));
            }
            if (Config.hcSuperheater) {
                recipeRegistry.remove(getRL("superheater"));
            }
            if (Config.hcTank) {
                recipeRegistry.remove(getRL("block_tank"));
            }
            if (Config.hcTinkerHammer) {
                recipeRegistry.remove(getRL("tinker_hammer"));
            }
            if (Config.hcTinkerLens) {
                recipeRegistry.remove(getRL("tinker_lens"));
            }
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
