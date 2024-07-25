package com.Lenvill.item;


import com.Lenvill.EmberforgedMain;
import com.Lenvill.proxy.IClientRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IClientRegister {

    public ItemBase(String name) {
        super();
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(CreativeTabs.MISC);

        //EmberforgedItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        //EmberforgedMain.PROXY.registerItemRenderer(this, 0, "inventory");
    }
}
