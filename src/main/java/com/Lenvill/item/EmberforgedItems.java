package com.Lenvill.item;

import com.Lenvill.EmberforgedMain;
import minefantasy.mfr.init.MineFantasyTabs;
import minefantasy.mfr.item.ItemBaseMFR;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@GameRegistry.ObjectHolder(EmberforgedMain.MODID)
@Mod.EventBusSubscriber(modid = EmberforgedMain.MODID)
public class EmberforgedItems {

    public static Item runed_dawnstone_plate = null;
    public static Item runed_copper_plate = null;
    public static Item runed_iron_plate = null;
    public static Item runed_silver_plate = null;
    public static Item runed_lead_scales = null;
    public static Item runed_bronze_gear = null;

    public static void initItems() {
        runed_dawnstone_plate = new ItemBaseMFR("runed_dawnstone_plate").setCreativeTab(MineFantasyTabs.tabMaterials);
        runed_copper_plate = new ItemBaseMFR("runed_copper_plate").setCreativeTab(MineFantasyTabs.tabMaterials);
        runed_iron_plate = new ItemBaseMFR("runed_iron_plate").setCreativeTab(MineFantasyTabs.tabMaterials);
        runed_silver_plate = new ItemBaseMFR("runed_silver_plate").setCreativeTab(MineFantasyTabs.tabMaterials);
        runed_lead_scales = new ItemBaseMFR("runed_lead_scales").setCreativeTab(MineFantasyTabs.tabMaterials);
        runed_bronze_gear = new ItemBaseMFR("runed_bronze_gear").setCreativeTab(MineFantasyTabs.tabMaterials);
    }

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(runed_dawnstone_plate);
        registry.register(runed_copper_plate);
        registry.register(runed_iron_plate);
        registry.register(runed_silver_plate);
        registry.register(runed_lead_scales);
        registry.register(runed_bronze_gear);
        //event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }
}
