package com.Lenvill;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class Config {
    public static Configuration config;
    public static boolean enableChanges;
    public static boolean hcAlchemyPedestal;
    public static boolean hcAlchemyTablet;
    public static boolean hcAshenCloak;
    public static boolean hcBeamCannon;
    public static boolean hcBeamSplitter;
    public static boolean hcBin;
    public static boolean hcCasterOrb;
    public static boolean hcCatalyzer;
    public static boolean hcCharger;
    public static boolean hcCinderPlinth;
    public static boolean hcClockworkAttenuator;
    public static boolean hcClockworkAxe;
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
    public static boolean hcEmberPulser;
    public static boolean hcEmberRelay;
    public static boolean hcEmberSiphon;
    public static boolean hcEmberStaff;
    public static boolean hcFluidGauge;
    public static boolean hcFluidPipe;
    public static boolean hcFluidTransfer;
    public static boolean hcGlimmerLamp;
    public static boolean hcHearthCoil;
    public static boolean hcIgnitionCannon;
    public static boolean hcInfernoForge;
    public static boolean hcItemTransfer;
    public static boolean hcJetAugment;
    public static boolean hcLantern;
    public static boolean hcMechAccessor;
    public static boolean hcMechanicalCore;
    public static boolean hcMechanicalPump;
    public static boolean hcMiniBoiler;
    public static boolean hcMixer;
    public static boolean hcReactor;
    public static boolean hcResonatingBell;
    public static boolean hcSparkPlug;
    public static boolean hcStirling;
    public static boolean hcSuperheater;
    public static boolean hcTank;
    public static boolean hcTinkerHammer;
    public static boolean hcTinkerLens;

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            load();
        }
    }

    public static void load() {
        config.addCustomCategoryComment("Recipe Toggle", "Enable or disable features.");
        config.addCustomCategoryComment("Main", "General config options for Emberforged.");

        enableChanges = config.getBoolean("enableChanges","Main",true,"Master toggle switch for Emberforge's recipe changes");
        hcAlchemyPedestal = config.getBoolean("hcAlchemyPedestal","Recipe Toggle",true,"Whether Emberforged will replace the Alchemy Pedestal recipe.");
        hcAlchemyTablet = config.getBoolean("hcAlchemyTablet","Recipe Toggle",true,"Whether Emberforged will replace the Alchemy Tablet recipe.");
        hcAshenCloak = config.getBoolean("hcAshenCloak","Recipe Toggle",true,"Whether Emberforged will replace the Ashen Cloak recipe.");
        hcBeamCannon = config.getBoolean("hcBeamCannon","Recipe Toggle",true,"Whether Emberforged will replace the Beam Cannon recipe.");
        hcBeamSplitter = config.getBoolean("hcBeamSplitter","Recipe Toggle",true,"Whether Emberforged will replace the Beam Splitter recipe.");
        hcBin = config.getBoolean("hcBin","Recipe Toggle",true,"Whether Emberforged will replace the Bin recipe.");
        hcCasterOrb = config.getBoolean("hcCasterOrb","Recipe Toggle",true,"Whether Emberforged will replace the Caster Orb recipe.");
        hcCatalyzer = config.getBoolean("hcCatalyzer","Recipe Toggle",true,"Whether Emberforged will replace the Catalyzer recipe.");
        hcCharger = config.getBoolean("hcCharger","Recipe Toggle",true,"Whether Emberforged will replace the Charger recipe.");
        hcCinderPlinth = config.getBoolean("hcCinderPlinth","Recipe Toggle",true,"Whether Emberforged will replace the Cinder Plinth recipe.");
        hcClockworkAttenuator = config.getBoolean("hcClockworkAttenuator","Recipe Toggle",true,"Whether Emberforged will replace the Clockwork Attenuator recipe.");
        hcClockworkAxe = config.getBoolean("hcClockworkAxe","Recipe Toggle",true,"Whether Emberforged will replace the Clockwork Axe recipe.");
        hcCombustor = config.getBoolean("hcCombustor","Recipe Toggle",true,"Whether Emberforged will replace the Combustor recipe.");
        hcCrystalCell = config.getBoolean("hcCrystalCell","Recipe Toggle",true,"Whether Emberforged will replace the Crystal Cell recipe.");
        hcDawnstoneMail = config.getBoolean("hcDawnstoneMail","Recipe Toggle",true,"Whether Emberforged will replace the Dawnstone Mail recipe.");
        hcDiffractionBarrel = config.getBoolean("hcDiffractionBarrel","Recipe Toggle",true,"Whether Emberforged will replace the Diffraction Barrel recipe.");
        hcEmberActivator = config.getBoolean("hcEmberActivator","Recipe Toggle",true,"Whether Emberforged will replace the Ember Activator recipe.");
        hcEmberBelt = config.getBoolean("hcEmberBelt","Recipe Toggle",true,"Whether Emberforged will replace the Ember Belt recipe.");
        hcEmberCartridge = config.getBoolean("hcEmberCartridge","Recipe Toggle",true,"Whether Emberforged will replace the Ember Cartridge recipe.");
        hcEmberBore = config.getBoolean("hcEmberBore","Recipe Toggle",true,"Whether Emberforged will replace the Ember Bore recipe.");
        hcEmberBulb = config.getBoolean("hcEmberBulb","Recipe Toggle",true,"Whether Emberforged will replace the Ember Bulb recipe.");
        hcEmberFunnel = config.getBoolean("hcEmberFunnel","Recipe Toggle",true,"Whether Emberforged will replace the Ember Funnel recipe.");
        hcEmberGauge = config.getBoolean("hcEmberGauge","Recipe Toggle",true,"Whether Emberforged will replace the Ember Guage recipe.");
        hcEmberInjector = config.getBoolean("hcEmberInjector","Recipe Toggle",true,"Whether Emberforged will replace the Ember Injector recipe.");
        hcEmberPulser = config.getBoolean("hcEmberPulser","Recipe Toggle",true,"Whether Emberforged will replace the Ember Pulser recipe.");
        hcEmberRelay = config.getBoolean("hcEmberRelay","Recipe Toggle",true,"Whether Emberforged will replace the Ember Relay recipe.");
        hcEmberSiphon = config.getBoolean("hcEmberSiphon","Recipe Toggle",true,"Whether Emberforged will replace the Ember Siphon recipe.");
        hcEmberStaff = config.getBoolean("hcEmberStaff","Recipe Toggle",true,"Whether Emberforged will replace the Ember Staff recipe.");
        hcFluidGauge = config.getBoolean("hcFluidGauge","Recipe Toggle",true,"Whether Emberforged will replace the Fluid Guage recipe.");
        hcFluidPipe = config.getBoolean("hcFluidPipe","Recipe Toggle",true,"Whether Emberforged will replace the Fluid Pipe recipe.");
        hcFluidTransfer = config.getBoolean("hcFluidTransfer","Recipe Toggle",true,"Whether Emberforged will replace the Fluid Transfer recipe.");
        hcGlimmerLamp = config.getBoolean("hcGlimmerLamp","Recipe Toggle",true,"Whether Emberforged will replace the Glimmer Lamp recipe.");
        hcHearthCoil = config.getBoolean("hcHearthCoil","Recipe Toggle",true,"Whether Emberforged will replace the Hearth Coil recipe.");
        hcIgnitionCannon = config.getBoolean("hcIgnitionCannon","Recipe Toggle",true,"Whether Emberforged will replace the Ignition Cannon recipe.");
        hcInfernoForge = config.getBoolean("hcInfernoForge","Recipe Toggle",true,"Whether Emberforged will replace the Inferno Forge recipe.");
        hcItemTransfer = config.getBoolean("hcItemTransfer","Recipe Toggle",true,"Whether Emberforged will replace the Item Transferer recipe.");
        hcJetAugment = config.getBoolean("hcJetAugment","Recipe Toggle",true,"Whether Emberforged will replace the Jet Augment recipe.");
        hcLantern = config.getBoolean("hcLantern","Recipe Toggle",true,"Whether Emberforged will replace the Lantern recipe.");
        hcMechAccessor = config.getBoolean("hcMechAccessor","Recipe Toggle",true,"Whether Emberforged will replace the Mech Accessor recipe.");
        hcMechanicalCore = config.getBoolean("hcMechanicalCore","Recipe Toggle",true,"Whether Emberforged will replace the Mechanical Core recipe.");
        hcMechanicalPump = config.getBoolean("hcMechanicalPump","Recipe Toggle",true,"Whether Emberforged will replace the Mechanical Pump recipe.");
        hcMiniBoiler = config.getBoolean("hcMiniBoiler","Recipe Toggle",true,"Whether Emberforged will replace the Mini Boiler recipe.");
        hcMixer = config.getBoolean("hcMixer","Recipe Toggle",true,"Whether Emberforged will replace the Mixer recipe.");
        hcReactor = config.getBoolean("hcReactor","Recipe Toggle",true,"Whether Emberforged will replace the Reactor recipe.");
        hcResonatingBell = config.getBoolean("hcResonatingBell","Recipe Toggle",true,"Whether Emberforged will replace the Reasonating Bell recipe.");
        hcSparkPlug = config.getBoolean("hcSparkPlug","Recipe Toggle",true,"Whether Emberforged will replace the Spark Plug recipe.");
        hcStirling = config.getBoolean("hcStirling","Recipe Toggle",true,"Whether Emberforged will replace the Stirling recipe.");
        hcSuperheater = config.getBoolean("hcSuperheater","Recipe Toggle",true,"Whether Emberforged will replace the Superheater recipe.");
        hcTank = config.getBoolean("hcTank","Recipe Toggle",true,"Whether Emberforged will replace the Tank recipe.");
        hcTinkerHammer = config.getBoolean("hcTinkerHammer","Recipe Toggle",true,"Whether Emberforged will replace the Tinker Hammer recipe.");
        hcTinkerLens = config.getBoolean("hcTinkerLens","Recipe Toggle",true,"Whether Emberforged will replace the Tinker Lens recipe.");

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
}
