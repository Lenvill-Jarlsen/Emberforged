package com.Lenvill;

import com.Lenvill.mfrAPI.*;
import com.google.gson.Gson;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teamroots.embers.ConfigManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class IOInit {

    public static void initTypes(FMLPreInitializationEvent event) {

        //Actually writes the metal_types file
        try {
            String tempPath = "MineFantasyReforged/custom/registry/emberforged/";
            new File(event.getModConfigurationDirectory(), tempPath).mkdirs();
            File tempFile = new File(event.getModConfigurationDirectory(), tempPath + "metal_types" + ".json");
            PrintWriter tempWriter = new PrintWriter(tempFile);

            //This is the object that gets printed as a json file, once it has been filled out
            Scribe ledger = new Scribe();

            //Define Dawnstone
            Material dawnstone = new Material("dawnstone", "ingotDawnstone");

            MaterialProperties dawnstone_properties = new MaterialProperties();
                dawnstone_properties.setTier(5);
                dawnstone_properties.setDurability(6.5);
                dawnstone_properties.setFlexibility(1.0);
                dawnstone_properties.setSharpness(3.7);
                dawnstone_properties.setHardness(3.4);
                dawnstone_properties.setResistance(60);
                dawnstone_properties.setDensity(3.3);
                dawnstone_properties.setMelting_point(2500);
                dawnstone_properties.setRarity(0);
                dawnstone_properties.setEnchantability(25);
                dawnstone_properties.setCraft_tier(4);
                dawnstone_properties.setCraft_time_modifier(10.0);
                dawnstone_properties.setUnbreakable(false);
            dawnstone.setProperties(dawnstone_properties);

            MaterialArmorStats dawnstone_armor_stats = new MaterialArmorStats();
                dawnstone_armor_stats.setCutting(1.1);
                dawnstone_armor_stats.setBlunt(1.1);
                dawnstone_armor_stats.setPiercing(1.1);
            dawnstone.setArmour_stats(dawnstone_armor_stats);

            MaterialColor dawnstonecolor = new MaterialColor();
                dawnstonecolor.setRed(255);
                dawnstonecolor.setGreen(182);
                dawnstonecolor.setBlue(72);
            dawnstone.setColor(dawnstonecolor);

            ledger.addMaterial(dawnstone);

            //Define Lead
            Material lead = new Material("lead", "ingotLead");

            MaterialProperties lead_properties = new MaterialProperties();
                lead_properties.setTier(1);
                lead_properties.setDurability(1.6);
                lead_properties.setFlexibility(0.9);
                lead_properties.setSharpness(1.3);
                lead_properties.setHardness(2.5);
                lead_properties.setResistance(20);
                lead_properties.setDensity(3.5);
                lead_properties.setMelting_point(1400);
                lead_properties.setRarity(0);
                lead_properties.setEnchantability(1);
                lead_properties.setCraft_tier(1);
                lead_properties.setCraft_time_modifier(5.0);
                lead_properties.setUnbreakable(false);
            lead.setProperties(lead_properties);

            MaterialArmorStats lead_armor_stats = new MaterialArmorStats();
                lead_armor_stats.setCutting(1.0);
                lead_armor_stats.setBlunt(1.0);
                lead_armor_stats.setPiercing(1.0);
            lead.setArmour_stats(lead_armor_stats);

            MaterialColor lead_color = new MaterialColor();
                lead_color.setRed(140);
                lead_color.setGreen(127);
                lead_color.setBlue(157);
            lead.setColor(lead_color);

            ledger.addMaterial(lead);

            //Define Aluminum
            if(ConfigManager.enableAluminum) {
                Material aluminum = new Material("aluminum", "ingotAluminum");

                MaterialProperties aluminum_properties = new MaterialProperties();
                    aluminum_properties.setTier(0);
                    aluminum_properties.setDurability(1.2);
                    aluminum_properties.setFlexibility(0.7);
                    aluminum_properties.setSharpness(1.0);
                    aluminum_properties.setHardness(2.0);
                    aluminum_properties.setResistance(20);
                    aluminum_properties.setDensity(1.0);
                    aluminum_properties.setMelting_point(800);
                    aluminum_properties.setRarity(0);
                    aluminum_properties.setEnchantability(2);
                    aluminum_properties.setCraft_tier(-1);
                    aluminum_properties.setCraft_time_modifier(2.0);
                    aluminum_properties.setUnbreakable(false);
                aluminum.setProperties(aluminum_properties);

                MaterialArmorStats aluminum_armor_stats = new MaterialArmorStats();
                    aluminum_armor_stats.setCutting(1.0);
                    aluminum_armor_stats.setBlunt(1.0);
                    aluminum_armor_stats.setPiercing(1.0);
                aluminum.setArmour_stats(aluminum_armor_stats);

                MaterialColor aluminum_color = new MaterialColor();
                    aluminum_color.setRed(234);
                    aluminum_color.setGreen(157);
                    aluminum_color.setBlue(134);
                aluminum.setColor(aluminum_color);

                ledger.addMaterial(aluminum);
            }

            //Define Electrum
            if(ConfigManager.enableElectrum) {
                Material electrum = new Material("electrum", "ingotElectrum");

                MaterialProperties electrum_properties = new MaterialProperties();
                    electrum_properties.setTier(0);
                    electrum_properties.setDurability(2.5);
                    electrum_properties.setFlexibility(1.0);
                    electrum_properties.setSharpness(0.0);
                    electrum_properties.setHardness(1.5);
                    electrum_properties.setResistance(40);
                    electrum_properties.setDensity(3.5);
                    electrum_properties.setMelting_point(1200);
                    electrum_properties.setRarity(0);
                    electrum_properties.setEnchantability(30);
                    electrum_properties.setCraft_tier(0);
                    electrum_properties.setCraft_time_modifier(2.0);
                    electrum_properties.setUnbreakable(false);
                electrum.setProperties(electrum_properties);

                MaterialArmorStats electrum_armor_stats = new MaterialArmorStats();
                    electrum_armor_stats.setCutting(1.0);
                    electrum_armor_stats.setBlunt(1.0);
                    electrum_armor_stats.setPiercing(1.0);
                electrum.setArmour_stats(electrum_armor_stats);

                MaterialColor electrum_color = new MaterialColor();
                    electrum_color.setRed(240);
                    electrum_color.setGreen(216);
                    electrum_color.setBlue(113);
                electrum.setColor(electrum_color);

                ledger.addMaterial(electrum);
            }

            //Define Nickel
            if(ConfigManager.enableNickel) {
                Material nickel = new Material("nickel", "ingotNickel");

                MaterialProperties nickel_properties = new MaterialProperties();
                    nickel_properties.setTier(1);
                    nickel_properties.setDurability(1.5);
                    nickel_properties.setFlexibility(0.8);
                    nickel_properties.setSharpness(1.5);
                    nickel_properties.setHardness(2.0);
                    nickel_properties.setResistance(50);
                    nickel_properties.setDensity(3.0);
                    nickel_properties.setMelting_point(1400);
                    nickel_properties.setRarity(0);
                    nickel_properties.setEnchantability(9);
                    nickel_properties.setCraft_tier(1);
                    nickel_properties.setCraft_time_modifier(3.0);
                    nickel_properties.setUnbreakable(false);
                nickel.setProperties(nickel_properties);

                MaterialArmorStats nickel_armor_stats = new MaterialArmorStats();
                    nickel_armor_stats.setCutting(1.0);
                    nickel_armor_stats.setBlunt(1.0);
                    nickel_armor_stats.setPiercing(1.0);
                nickel.setArmour_stats(nickel_armor_stats);

                MaterialColor nickel_color = new MaterialColor();
                    nickel_color.setRed(171);
                    nickel_color.setGreen(181);
                    nickel_color.setBlue(152);
                nickel.setColor(nickel_color);

                ledger.addMaterial(nickel);
            }

            Gson gson = new Gson();
            String metal_types = gson.toJson(ledger);
            tempWriter.println(metal_types);
            tempWriter.flush();
            tempWriter.close();
            EmberforgedMain.LOG.info("Emberforged Registry Generated");
        }
        catch(IOException e) {
        }
    }

    /*
    Saving this snipped to remind myself how to use the RecipeWriter in case I ever need to use it for something else
    public static void initRecipes(FMLPreInitializationEvent event) {
        if (Config.hcAlchemyPedestal) {
            RecipeWriter(event, "embers_AlchemyPedestal", ALCHEMYPEDESTAL);
        }
    }
     */

    //Function to standardize recipe writing
    public static void RecipeWriter(FMLPreInitializationEvent event, String recipeName, String recipe, String recipeType) {
        if (Config.enableChanges) {
            try {
                String path = "MineFantasyReforged/custom/recipes/emberforged/" + recipeType;
                File file = new File(event.getModConfigurationDirectory(), path + recipeName + ".json");
                file.deleteOnExit();
                PrintWriter writer = new PrintWriter(file);
                writer.println(recipe);
                writer.flush();

                writer.close();
            }
            catch (IOException e) {}
        }
    }
}
