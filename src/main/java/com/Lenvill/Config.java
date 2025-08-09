package com.Lenvill;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import teamroots.embers.config.ConfigCompat;
import teamroots.embers.config.ConfigMaterial;

import java.io.File;

@net.minecraftforge.common.config.Config(modid = EmberforgedMain.MODID)
public class Config {

    @net.minecraftforge.common.config.Config.Comment("Makes Ember's plates uncraftable. You should be using MFRs plates anyway.")
    public static boolean disableEmbersPlates = true;

    @net.minecraftforge.common.config.Config.Comment("Alternate Clockwork Attenuator Recipe that doesn't use electrum. This will automatically turn on if no electrum is detected")
    public static boolean altClockworkAttenuatorRecipe = false;

    @net.minecraftforge.common.config.Config.Comment("Alternate Sparkplug Recipe that doesn't use aluminum. This will automatically turn on if no aluminum is detected")
    public static boolean altSparkplugRecipe = false;

    @net.minecraftforge.common.config.Config.Comment({"Enable or disable the presence of default/vanilla style recipes.","Note: MFR metal registration can be disabled in MFR's config file"})
    public static boolean recipeChanges = true;

    ///  OLD CONFIG BELOW ///
    /*
    public static Configuration config;

    //These Booleans only exist in the code to control more complex toggles
    public static boolean altSparkPlugToggle = false;
    public static boolean altClockworkAttenuatorToggle = false;
    public static boolean aluminumToggle = false;
    public static boolean electrumToggle = false;
    public static boolean nickelToggle = false;
    public static boolean baublesToggle = false;

    //Main Config Options
    public static boolean enableChanges;

    public static boolean registerMetals;

    public static boolean registerAluminum;
    public static boolean registerElectrum;
    public static boolean registerNickel;

    //Recipe Toggles Options
    public static boolean hcAlchemyPedestal;
    public static boolean hcAlchemyTablet;
    public static boolean hcAshenCloak;
    public static boolean hcBeamCannon;
    public static boolean hcBeamSplitter;
    public static boolean hcBin;
    public static boolean hcBreaker;
    public static boolean hcCaminiteBlend;
    public static boolean hcCaminiteFiring;
    public static boolean hcCasterOrb;
    public static boolean hcCatalyzer;
    public static boolean hcCharger;
    public static boolean hcCinderPlinth;
    public static boolean hcClockworkAttenuator;
    public static boolean hcClockworkAxe;
    public static boolean hcClockworkPickaxe;
    public static boolean hcCombustor;
    public static boolean hcCrystalCell;
    public static boolean hcDawnstoneMail;
    public static boolean hcDiffractionBarrel;
    public static boolean hcEmberActivator;
    public static boolean hcEmberBelt;
    public static boolean hcEmberBore;
    public static boolean hcEmberBulb;
    public static boolean hcEmberCartridge;
    public static boolean hcEmberFunnel;
    public static boolean hcEmberGauge;
    public static boolean hcEmberInjector;
    public static boolean hcEmberJar;
    public static boolean hcEmberPulser;
    public static boolean hcEmberRelay;
    public static boolean hcEmberSiphon;
    public static boolean hcEmberStaff;
    public static boolean hcFluidGauge;
    public static boolean hcFluidPipe;
    public static boolean hcFluidTransfer;
    public static boolean hcGlimmerLamp;
    public static boolean hcGrandhammer;
    public static boolean hcHearthCoil;
    public static boolean hcIgnitionCannon;
    public static boolean hcInfernoForge;
    public static boolean hcItemPipe;
    public static boolean hcItemRequest;
    public static boolean hcItemTransfer;
    public static boolean hcJetAugment;
    public static boolean hcLantern;
    public static boolean hcMechAccessor;
    public static boolean hcMechanicalCore;
    public static boolean hcMechanicalPump;
    public static boolean hcMiniBoiler;
    public static boolean hcMixer;
    public static boolean hcReactionChamber;
    public static boolean hcReactor;
    public static boolean hcResonatingBell;
    public static boolean hcSparkPlug;
    public static boolean hcStirling;
    public static boolean hcSuperheater;
    public static boolean hcTank;
    public static boolean hcTinkerHammer;
    public static boolean hcTinkerLens;

    public static boolean isBaublesIntegrationEnabled() {
        return ConfigCompat.enableBaublesIntegration && Loader.isModLoaded("baubles");
    }

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            load();
        }

        if(enableChanges) {
            if (ConfigMaterial.ALUMINUM.mustLoad() && registerAluminum) {
                aluminumToggle = true;
            }
            if (ConfigMaterial.ELECTRUM.mustLoad() && registerElectrum) {
                electrumToggle = true;
            }
            if (ConfigMaterial.NICKEL.mustLoad() && registerNickel) {
                nickelToggle = true;
            }
            if (!ConfigMaterial.ALUMINUM.mustLoad() || !registerAluminum) {
                altSparkPlugToggle = true;
            }
            if (!ConfigMaterial.ELECTRUM.mustLoad() || !registerElectrum) {
                altClockworkAttenuatorToggle = true;
            }
            if (isBaublesIntegrationEnabled()) {
                baublesToggle = true;
            }
        }
    }

    public static void load() {
        //Here are the category declarations
        config.addCustomCategoryComment("Recipe Toggle", "Enable or disable the presence of default/vanilla style recipes.");
        config.addCustomCategoryComment("Main", "General config options for Emberforged.");

        //Main Config Options
        enableChanges = config.getBoolean("enableChanges","Main",true,"Master toggle switch for Emberforge's recipe changes. Look in Minefantasy Reforged's 'Crafting' config file to disable individual anvil recipes");
        disableEmbersPlates = config.getBoolean("disableEmbersPlates","Main",true,"Makes Ember's plates uncraftable. You should be using MFRs plates anyway.");
        //registerMetals = config.getBoolean("registerMetals","Main",true,"Whether or not Emberforged will register its metals at all. You will need to supply your own metal_types file via the config, or else disabling this WILL cause a crash on startup");
        //registerAluminum = config.getBoolean("registerAluminum","Main",true,"Enable/Disable just Aluminum from being added to the registry (Disabling Aluminum in Ember's config also disables this). Emberforged will load alternate recipes to support this option.");
        //registerElectrum = config.getBoolean("registerElectrum","Main",true,"Enable/Disable just Electrum from being added to the registry (Disabling Electrum in Ember's config also disables this). Emberforged will load alternate recipes to support this option.");
        //registerNickel = config.getBoolean("registerNickel","Main",true,"Enable/Disable just Nickel from being added to the registry (Disabling Nickel in Ember's config also disables this). Emberforged will load alternate recipes to support this option.");

        //Recipe Toggle Options
        hcAlchemyPedestal = config.getBoolean("hcAlchemyPedestal","Recipe Toggle",true,"Whether Emberforged will disable the default Alchemy Pedestal recipe.");
        hcAlchemyTablet = config.getBoolean("hcAlchemyTablet","Recipe Toggle",true,"Whether Emberforged will disable the default Alchemy Tablet recipe.");
        hcAshenCloak = config.getBoolean("hcAshenCloak","Recipe Toggle",true,"Whether Emberforged will disable the default Ashen Cloak recipe.");
        hcBeamCannon = config.getBoolean("hcBeamCannon","Recipe Toggle",true,"Whether Emberforged will disable the default Beam Cannon recipe.");
        hcBeamSplitter = config.getBoolean("hcBeamSplitter","Recipe Toggle",true,"Whether Emberforged will disable the default Beam Splitter recipe.");
        hcBin = config.getBoolean("hcBin","Recipe Toggle",true,"Whether Emberforged will disable the default Bin recipe.");
        hcBreaker = config.getBoolean("hcBreaker","Recipe Toggle",true,"Whether Emberforged will disable the default Breaker recipe.");
        hcCaminiteBlend = config.getBoolean("hcCaminiteBlend","Recipe Toggle",true,"Whether Emberforged will disable the default Caminite Blend recipe.");
        hcCaminiteFiring = config.getBoolean("hcStampFiring","Recipe Toggle",true,"Whether Emberforged will disable cooking the Bar Stamps in a furnace and require using an oven atop a forge.");
        hcCasterOrb = config.getBoolean("hcCasterOrb","Recipe Toggle",true,"Whether Emberforged will disable the default Caster Orb recipe.");
        hcCatalyzer = config.getBoolean("hcCatalyzer","Recipe Toggle",true,"Whether Emberforged will disable the default Catalyzer recipe.");
        hcCharger = config.getBoolean("hcCharger","Recipe Toggle",true,"Whether Emberforged will disable the default Charger recipe.");
        hcCinderPlinth = config.getBoolean("hcCinderPlinth","Recipe Toggle",true,"Whether Emberforged will disable the default Cinder Plinth recipe.");
        hcClockworkAttenuator = config.getBoolean("hcClockworkAttenuator","Recipe Toggle",true,"Whether Emberforged will disable the default Clockwork Attenuator recipe.");
        hcClockworkAxe = config.getBoolean("hcClockworkAxe","Recipe Toggle",true,"Whether Emberforged will disable the default Clockwork Axe recipe.");
        hcClockworkPickaxe = config.getBoolean("hcClockworkPickaxe","Recipe Toggle",true,"Whether Emberforged will disable the default Clockwork Pickaxe recipe.");
        hcCombustor = config.getBoolean("hcCombustor","Recipe Toggle",true,"Whether Emberforged will disable the default Combustor recipe.");
        hcCrystalCell = config.getBoolean("hcCrystalCell","Recipe Toggle",true,"Whether Emberforged will disable the default Crystal Cell recipe.");
        hcDawnstoneMail = config.getBoolean("hcDawnstoneMail","Recipe Toggle",true,"Whether Emberforged will disable the default Dawnstone Mail recipe.");
        hcDiffractionBarrel = config.getBoolean("hcDiffractionBarrel","Recipe Toggle",true,"Whether Emberforged will disable the default Diffraction Barrel recipe.");
        hcEmberActivator = config.getBoolean("hcEmberActivator","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Activator recipe.");
        hcEmberBelt = config.getBoolean("hcEmberBelt","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Belt recipe.");
        hcEmberCartridge = config.getBoolean("hcEmberCartridge","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Cartridge recipe.");
        hcEmberBore = config.getBoolean("hcEmberBore","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Bore recipe.");
        hcEmberBulb = config.getBoolean("hcEmberBulb","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Bulb recipe.");
        hcEmberFunnel = config.getBoolean("hcEmberFunnel","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Funnel recipe.");
        hcEmberGauge = config.getBoolean("hcEmberGauge","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Guage recipe.");
        hcEmberInjector = config.getBoolean("hcEmberInjector","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Injector recipe.");
        hcEmberJar = config.getBoolean("hcEmberJar","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Jar recipe.");
        hcEmberPulser = config.getBoolean("hcEmberPulser","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Pulser recipe.");
        hcEmberRelay = config.getBoolean("hcEmberRelay","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Relay recipe.");
        hcEmberSiphon = config.getBoolean("hcEmberSiphon","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Siphon recipe.");
        hcEmberStaff = config.getBoolean("hcEmberStaff","Recipe Toggle",true,"Whether Emberforged will disable the default Ember Staff recipe.");
        hcFluidGauge = config.getBoolean("hcFluidGauge","Recipe Toggle",true,"Whether Emberforged will disable the default Fluid Guage recipe.");
        hcFluidPipe = config.getBoolean("hcFluidPipe","Recipe Toggle",true,"Whether Emberforged will disable the default Fluid Pipe recipe.");
        hcFluidTransfer = config.getBoolean("hcFluidTransfer","Recipe Toggle",true,"Whether Emberforged will disable the default Fluid Transfer recipe.");
        hcGlimmerLamp = config.getBoolean("hcGlimmerLamp","Recipe Toggle",true,"Whether Emberforged will disable the default Glimmer Lamp recipe.");
        hcGrandhammer = config.getBoolean("hcGrandhammer","Recipe Toggle",true,"Whether Emberforged will disable the default Grandhammer recipe.");
        hcHearthCoil = config.getBoolean("hcHearthCoil","Recipe Toggle",true,"Whether Emberforged will disable the default Hearth Coil recipe.");
        hcIgnitionCannon = config.getBoolean("hcIgnitionCannon","Recipe Toggle",true,"Whether Emberforged will disable the default Ignition Cannon recipe.");
        hcInfernoForge = config.getBoolean("hcInfernoForge","Recipe Toggle",true,"Whether Emberforged will disable the default Inferno Forge recipe.");
        hcItemPipe = config.getBoolean("hcItemPipe","Recipe Toggle",true,"Whether Emberforged will disable the default Item Pipe recipe.");
        hcItemRequest = config.getBoolean("hcItemRequest","Recipe Toggle",true,"Whether Emberforged will disable the default Item Request recipe.");
        hcItemTransfer = config.getBoolean("hcItemTransfer","Recipe Toggle",true,"Whether Emberforged will disable the default Item Transferer recipe.");
        hcJetAugment = config.getBoolean("hcJetAugment","Recipe Toggle",true,"Whether Emberforged will disable the default Jet Augment recipe.");
        hcLantern = config.getBoolean("hcLantern","Recipe Toggle",true,"Whether Emberforged will disable the default Lantern recipe.");
        hcMechAccessor = config.getBoolean("hcMechAccessor","Recipe Toggle",true,"Whether Emberforged will disable the default Mech Accessor recipe.");
        hcMechanicalCore = config.getBoolean("hcMechanicalCore","Recipe Toggle",true,"Whether Emberforged will disable the default Mechanical Core recipe.");
        hcMechanicalPump = config.getBoolean("hcMechanicalPump","Recipe Toggle",true,"Whether Emberforged will disable the default Mechanical Pump recipe.");
        hcMiniBoiler = config.getBoolean("hcMiniBoiler","Recipe Toggle",true,"Whether Emberforged will disable the default Mini Boiler recipe.");
        hcMixer = config.getBoolean("hcMixer","Recipe Toggle",true,"Whether Emberforged will disable the default Mixer recipe.");
        hcReactionChamber = config.getBoolean("hcReactionChamber","Recipe Toggle",true,"Whether Emberforged will disable the default Reaction Chamber recipe.");
        hcReactor = config.getBoolean("hcReactor","Recipe Toggle",true,"Whether Emberforged will disable the default Reactor recipe.");
        hcResonatingBell = config.getBoolean("hcResonatingBell","Recipe Toggle",true,"Whether Emberforged will disable the default Reasonating Bell recipe.");
        hcSparkPlug = config.getBoolean("hcSparkPlug","Recipe Toggle",true,"Whether Emberforged will disable the default Spark Plug recipe.");
        hcStirling = config.getBoolean("hcStirling","Recipe Toggle",true,"Whether Emberforged will disable the default Stirling recipe.");
        hcSuperheater = config.getBoolean("hcSuperheater","Recipe Toggle",true,"Whether Emberforged will disable the default Superheater recipe.");
        hcTank = config.getBoolean("hcTank","Recipe Toggle",true,"Whether Emberforged will disable the default Tank recipe.");
        hcTinkerHammer = config.getBoolean("hcTinkerHammer","Recipe Toggle",true,"Whether Emberforged will disable the default Tinker Hammer recipe.");
        hcTinkerLens = config.getBoolean("hcTinkerLens","Recipe Toggle",true,"Whether Emberforged will disable the default Tinker Lens recipe.");

        if (config.hasChanged())
        {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.getModID().equalsIgnoreCase(EmberforgedMain.MODID))
        {
            load();
        }
    }

     */
}
