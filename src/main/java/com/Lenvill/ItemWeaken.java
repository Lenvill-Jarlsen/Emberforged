package com.Lenvill;

import teamroots.embers.ConfigManager;
import teamroots.embers.RegistryManager;
import minefantasy.mfr.util.Utils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemWeaken {

    //Remember to include the new version of the item in the .lang file
    public static void weakenList() {

        weakenItem(RegistryManager.pickaxe_copper, 5);
        weakenItem(RegistryManager.axe_copper, 5);
        weakenItem(RegistryManager.shovel_copper, 5);
        weakenItem(RegistryManager.sword_copper, 5);
        weakenItem(RegistryManager.hoe_copper, 5);

        weakenItem(RegistryManager.pickaxe_silver, 5);
        weakenItem(RegistryManager.axe_silver, 5);
        weakenItem(RegistryManager.shovel_silver, 5);
        weakenItem(RegistryManager.sword_silver, 5);
        weakenItem(RegistryManager.hoe_silver, 5);

        weakenItem(RegistryManager.pickaxe_lead, 5);
        weakenItem(RegistryManager.axe_lead, 5);
        weakenItem(RegistryManager.shovel_lead, 5);
        weakenItem(RegistryManager.sword_lead, 5);
        weakenItem(RegistryManager.hoe_lead, 5);

        weakenItem(RegistryManager.pickaxe_dawnstone, 100);
        weakenItem(RegistryManager.axe_dawnstone, 100);
        weakenItem(RegistryManager.shovel_dawnstone, 100);
        weakenItem(RegistryManager.sword_dawnstone, 100);
        weakenItem(RegistryManager.hoe_dawnstone, 100);


        if(ConfigManager.enableAluminum) {
            weakenItem(RegistryManager.pickaxe_aluminum, 10);
            weakenItem(RegistryManager.axe_aluminum, 10);
            weakenItem(RegistryManager.shovel_aluminum, 10);
            weakenItem(RegistryManager.sword_aluminum, 10);
            weakenItem(RegistryManager.hoe_aluminum, 10);
        }
        if(ConfigManager.enableBronze) {
            weakenItem(RegistryManager.pickaxe_bronze, 30);
            weakenItem(RegistryManager.axe_bronze, 30);
            weakenItem(RegistryManager.shovel_bronze, 30);
            weakenItem(RegistryManager.sword_bronze, 30);
            weakenItem(RegistryManager.hoe_bronze, 30);
        }
        if(ConfigManager.enableElectrum) {
            weakenItem(RegistryManager.pickaxe_electrum, 5);
            weakenItem(RegistryManager.axe_electrum, 5);
            weakenItem(RegistryManager.shovel_electrum, 5);
            weakenItem(RegistryManager.sword_electrum, 5);
            weakenItem(RegistryManager.hoe_electrum, 5);
        }
        if(ConfigManager.enableNickel) {
            weakenItem(RegistryManager.pickaxe_nickel, 20);
            weakenItem(RegistryManager.axe_nickel, 20);
            weakenItem(RegistryManager.shovel_nickel, 20);
            weakenItem(RegistryManager.sword_nickel, 20);
            weakenItem(RegistryManager.hoe_nickel, 20);
        }
        if(ConfigManager.enableTin) {
            weakenItem(RegistryManager.pickaxe_tin, 5);
            weakenItem(RegistryManager.axe_tin, 5);
            weakenItem(RegistryManager.shovel_tin, 5);
            weakenItem(RegistryManager.sword_tin, 5);
            weakenItem(RegistryManager.hoe_tin, 5);
        }
    }

    private static void weakenItem(Item item) {
        weakenItem(item, (item.getMaxDamage() / 10) + 1);
    }

    private static void weakenItem(Item item, int hp) {
        if (item.isDamageable()) {
            item.setMaxDamage(hp);
        }
        item.setTranslationKey("crude_" + Utils.convertSplitCapitalizedToSnakeCase(new ItemStack(item).getDisplayName()));
    }
}
