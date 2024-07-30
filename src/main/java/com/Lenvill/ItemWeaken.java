package com.Lenvill;

import minefantasy.mfr.util.Utils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import teamroots.embers.config.ConfigMaterial;
import teamroots.embers.config.ConfigTool;
import teamroots.embers.register.ItemRegister;

public class ItemWeaken {

    //Remember to include the new version of the item in the .lang file
    public static void weakenList() {
        EmberforgedMain.LOG.info("Weakening Tools");
        if(ConfigTool.METAL_TOOL.COPPER.register && ConfigMaterial.COPPER.isNotOff()){
            weakenItem("pickaxe_copper", 5);
            weakenItem("axe_copper", 5);
            weakenItem("shovel_copper", 5);
            weakenItem("sword_copper", 5);
            weakenItem("hoe_copper", 5);
        }
        if(ConfigTool.METAL_TOOL.SILVER.register && ConfigMaterial.SILVER.isNotOff()) {
            weakenItem("pickaxe_silver", 5);
            weakenItem("axe_silver", 5);
            weakenItem("shovel_silver", 5);
            weakenItem("sword_silver", 5);
            weakenItem("hoe_silver", 5);
        }
        if(ConfigTool.METAL_TOOL.LEAD.register && ConfigMaterial.LEAD.isNotOff()) {
            weakenItem("pickaxe_lead", 10);
            weakenItem("axe_lead", 10);
            weakenItem("shovel_lead", 10);
            weakenItem("sword_lead", 10);
            weakenItem("hoe_lead", 10);
        }
        if(ConfigTool.METAL_TOOL.DAWNSTONE.register && ConfigMaterial.DAWNSTONE.isNotOff()) {
            weakenItem("pickaxe_dawnstone", 100);
            weakenItem("axe_dawnstone", 100);
            weakenItem("shovel_dawnstone", 100);
            weakenItem("sword_dawnstone", 100);
            weakenItem("hoe_dawnstone", 100);
        }

        if(ConfigTool.METAL_TOOL.ALUMINUM.register && ConfigMaterial.ALUMINUM.mustLoad()) {
            weakenItem("pickaxe_aluminum", 10);
            weakenItem("axe_aluminum", 10);
            weakenItem("shovel_aluminum", 10);
            weakenItem("sword_aluminum", 10);
            weakenItem("hoe_aluminum", 10);
        }
        if(ConfigTool.METAL_TOOL.BRONZE.register && ConfigMaterial.BRONZE.mustLoad()) {
            weakenItem("pickaxe_bronze", 30);
            weakenItem("axe_bronze", 30);
            weakenItem("shovel_bronze", 30);
            weakenItem("sword_bronze", 30);
            weakenItem("hoe_bronze", 30);
        }
        if(ConfigTool.METAL_TOOL.ELECTRUM.register && ConfigMaterial.ELECTRUM.mustLoad()) {
            weakenItem("pickaxe_electrum", 5);
            weakenItem("axe_electrum", 5);
            weakenItem("shovel_electrum", 5);
            weakenItem("sword_electrum", 5);
            weakenItem("hoe_electrum", 5);
        }
        if(ConfigTool.METAL_TOOL.NICKEL.register && ConfigMaterial.NICKEL.mustLoad()) {
            weakenItem("pickaxe_nickel", 20);
            weakenItem("axe_nickel", 20);
            weakenItem("shovel_nickel", 20);
            weakenItem("sword_nickel", 20);
            weakenItem("hoe_nickel", 20);
        }
        if(ConfigTool.METAL_TOOL.TIN.register && ConfigMaterial.TIN.mustLoad()) {
            weakenItem("pickaxe_tin", 5);
            weakenItem("axe_tin", 5);
            weakenItem("shovel_tin", 5);
            weakenItem("sword_tin", 5);
            weakenItem("hoe_tin", 5);
        }
    }

    private static void weakenItem(String RegName) {
        Item item = Item.REGISTRY.getObject(new ResourceLocation("embers",RegName));
        weakenItem(RegName, (item.getMaxDamage() / 10) + 1);
    }

    private static void weakenItem(String RegName, int hp) {
        Item item = Item.REGISTRY.getObject(new ResourceLocation("embers",RegName));
        if (item.isDamageable()) {
            item.setMaxDamage(hp);
            //EmberforgedMain.LOG.info("Weakening "+item);
        }
        item.setTranslationKey("crude_" + Utils.convertSplitCapitalizedToSnakeCase(new ItemStack(item).getDisplayName()));
    }
}
