package com.Lenvill;

import com.Lenvill.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EmberforgedMain.MODID, name = EmberforgedMain.NAME, dependencies = EmberforgedMain.DEPENDENCIES, version = EmberforgedMain.VERSION)
public class EmberforgedMain {
    public static final String MODID = "emberforged";
    public static final String NAME = "Emberforged";
    public static final String VERSION = "0.2.0";
    public static final String DEPENDENCIES = "required-after:baubles";

    @SidedProxy(clientSide = "com.Lenvill.proxy.ClientProxy", serverSide = "com.Lenvill.proxy.CommonProxy")
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        IOInit.initTypes(event);
        IOInit.initRecipes(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println();
        //AlchemyInit.preInit(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        CraftingInit.removeRecipes();
        SmeltingInit.allsmelt();
        ResearchInit.init();
        PROXY.postInit();
    }
}