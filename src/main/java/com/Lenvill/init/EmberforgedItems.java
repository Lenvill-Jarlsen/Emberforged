package com.Lenvill.init;

import com.Lenvill.EmberforgedMain;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(EmberforgedMain.MODID)
@Mod.EventBusSubscriber(modid = EmberforgedMain.MODID)
public class EmberforgedItems {

    public static final Item FIRST_ITEM = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
    }
}
