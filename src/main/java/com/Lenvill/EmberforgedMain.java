package com.Lenvill;

import com.Lenvill.fluids.FluidInit;
import com.Lenvill.item.EmberforgedItems;
import com.Lenvill.item.ItemWeaken;
import com.Lenvill.proxy.CommonProxy;
import minefantasy.mfr.config.ConfigHardcore;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = EmberforgedMain.MODID, name = EmberforgedMain.NAME, dependencies = EmberforgedMain.DEPENDENCIES, version = EmberforgedMain.VERSION)
public class EmberforgedMain {
    public static final String MODID = "emberforged";
    public static final String NAME = "Emberforged";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:baubles;" + "required-after:embers@[1.23.6,);" + "required-after:minefantasyreforged;";

    @SidedProxy(clientSide = "com.Lenvill.proxy.ClientProxy", serverSide = "com.Lenvill.proxy.CommonProxy")
    public static CommonProxy PROXY;

    public static final Logger LOG = LogManager.getLogger(MODID);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //MinecraftForge.EVENT_BUS.register(new Config());
        //Config.init(event.getSuggestedConfigurationFile());
        //IOInit.initRecipes(event);
        FluidInit.preInitFluids(event);
        EmberforgedItems.initItems();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println();
        AlchemyInit.preInit(event);
        FluidInit.addFluidRecipes();
        if (ConfigHardcore.HCCWeakItems) {
            ItemWeaken.weakenList();
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        CraftingInit.removeRecipes();
        SmeltingInit.allsmelt();
        ResearchInit.init();
        PROXY.postInit();
        StampInit.initStamps();
    }
}

/*
TO-DO list:
    2.x Updates:
        Rewrite Embers Recipes to feel more thematic to MFR
        Further expand research integration
        Make baubles optional
        Support Mystical Mechanics
    3.0 Plans:
        Read from MFR's material registry and auto-generate liquids for every metal on there
            Auto-generate basic melting and stamping recipes for every metal
        Add the ability to add custom Embers recipes via JSON files
 */