package com.Lenvill;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EmberforgedMain.MODID, name = EmberforgedMain.NAME, version = EmberforgedMain.VERSION)
public class EmberforgedMain {
    public static final String MODID = "emberforged";
    public static final String NAME = "Emberforged";
    public static final String VERSION = "0.0.1";

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //IOInit.initTypes(event);
        //IOInit.initRecipes(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //AlchemyInit.preInit(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ResearchInit.init();
        //CraftingInit.removeRecipes();
        //SmeltingInit.smeltingInit();
    }
}