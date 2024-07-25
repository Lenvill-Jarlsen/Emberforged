package com.Lenvill.item;

import com.Lenvill.proxy.IClientRegister;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){

    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        /*
        for(Item item : EmberforgedItems.ITEMS) {
            if(item instanceof IClientRegister) {
                ((IClientRegister)item).registerModels();
            }
        }


        for(Block block : EmberforgedBlocks.BLOCKS) {
            if(block instanceof IClientRegister) {
                ((IClientRegister)block).registerModels();
            }
        }
         */
    }
}
