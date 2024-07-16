package com.Lenvill;

import minefantasy.mfr.config.ConfigHardcore;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import teamroots.embers.ConfigManager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class IOInit {

    public static void initTypes(FMLPreInitializationEvent event) {
        String material_aluminum = "\n";
        String material_electrum = "\n";
        String material_nickel = "\n";

        //Ensures the following metals are only added to the registry if enabled
        if(ConfigManager.enableAluminum) {
            material_aluminum =
                "        },\n" +
                "        {\n" +
                "            \"name\": \"aluminum\",\n" +
                "            \"oreDictList\": \"ingotAluminum\",\n" +
                "            \"properties\": {\n" +
                "                \"tier\": 0,\n" +
                "                \"durability\": 1.2,\n" +
                "                \"flexibility\": 0.7,\n" +
                "                \"sharpness\": 0.0,\n" +
                "                \"hardness\": 1.2,\n" +
                "                \"resistance\": 10,\n" +
                "                \"density\": 2.0,\n" +
                "                \"melting_point\": 800,\n" +
                "                \"rarity\": -1,\n" +
                "                \"enchantability\": 1,\n" +
                "                \"craft_tier\": -1,\n" +
                "                \"craft_time_modifier\": 2.0,\n" +
                "                \"unbreakable\": false\n" +
                "            },\n" +
                "            \"armour_stats\": {\n" +
                "                \"cutting\": 1.0,\n" +
                "                \"blunt\": 1.0,\n" +
                "                \"piercing\": 1.0\n" +
                "            },\n" +
                "            \"color\": {\n" +
                "                \"red\": 234,\n" +
                "                \"green\": 152,\n" +
                "                \"blue\": 134\n" +
                "            }\n";
        }
        if(ConfigManager.enableElectrum) {
            material_electrum =
                "        },\n" +
                "        {\n" +
                "            \"name\": \"electrum\",\n" +
                "            \"oreDictList\": \"ingotElectrum\",\n" +
                "            \"properties\": {\n" +
                "                \"tier\": 4,\n" +
                "                \"durability\": 7.0,\n" +
                "                \"flexibility\": 1.5,\n" +
                "                \"sharpness\": 2.0,\n" +
                "                \"hardness\": 3.0,\n" +
                "                \"resistance\": 55,\n" +
                "                \"density\": 3.0,\n" +
                "                \"melting_point\": 2000,\n" +
                "                \"rarity\": 0,\n" +
                "                \"enchantability\": 15,\n" +
                "                \"craft_tier\": 3,\n" +
                "                \"craft_time_modifier\": 8.0,\n" +
                "                \"unbreakable\": false\n" +
                "            },\n" +
                "            \"armour_stats\": {\n" +
                "                \"cutting\": 1.0,\n" +
                "                \"blunt\": 1.0,\n" +
                "                \"piercing\": 1.0\n" +
                "            },\n" +
                "            \"color\": {\n" +
                "                \"red\": 240,\n" +
                "                \"green\": 216,\n" +
                "                \"blue\": 113\n" +
                "            }\n";
        }
        if(ConfigManager.enableNickel) {
            material_nickel =
                "        },\n" +
                "        {\n" +
                "            \"name\": \"nickel\",\n" +
                "            \"oreDictList\": \"ingotNickel\",\n" +
                "            \"properties\": {\n" +
                "                \"tier\": 0,\n" +
                "                \"durability\": 1.2,\n" +
                "                \"flexibility\": 0.8,\n" +
                "                \"sharpness\": 0.5,\n" +
                "                \"hardness\": 1.0,\n" +
                "                \"resistance\": 50,\n" +
                "                \"density\": 3.0,\n" +
                "                \"melting_point\": 1200,\n" +
                "                \"rarity\": 0,\n" +
                "                \"enchantability\": 9,\n" +
                "                \"craft_tier\": 0,\n" +
                "                \"craft_time_modifier\": 2.0,\n" +
                "                \"unbreakable\": false\n" +
                "            },\n" +
                "            \"armour_stats\": {\n" +
                "                \"cutting\": 1.0,\n" +
                "                \"blunt\": 1.0,\n" +
                "                \"piercing\": 1.0\n" +
                "            },\n" +
                "            \"color\": {\n" +
                "                \"red\": 171,\n" +
                "                \"green\": 181,\n" +
                "                \"blue\": 152\n" +
                "            }\n";
        }

        //Actually writes the metal_types file
        try {
            String tempPath = "MineFantasyReforged/custom/registry/emberforged/";
            new File(event.getModConfigurationDirectory(), tempPath).mkdirs();
            File tempFile = new File(event.getModConfigurationDirectory(), tempPath + "metal_types" + ".json");
            PrintWriter tempWriter = new PrintWriter(tempFile);

            tempWriter.println(
                "{\n" +
                "    \"mod\": \"emberforged\",\n" +
                "    \"metals\": [\n" +
                "        {\n" +
                "            \"name\": \"lead\",\n" +
                "            \"oreDictList\": \"ingotLead\",\n" +
                "            \"properties\": {\n" +
                "                \"tier\": 1,\n" +
                "                \"durability\": 1.6,\n" +
                "                \"flexibility\": 0.9,\n" +
                "                \"sharpness\": 1.3,\n" +
                "                \"hardness\": 2.5,\n" +
                "                \"resistance\": 20,\n" +
                "                \"density\": 3.5,\n" +
                "                \"melting_point\": 1400,\n" +
                "                \"rarity\": 0,\n" +
                "                \"enchantability\": 1,\n" +
                "                \"craft_tier\": 1,\n" +
                "                \"craft_time_modifier\": 5.0,\n" +
                "                \"unbreakable\": false\n" +
                "            },\n" +
                "            \"armour_stats\": {\n" +
                "                \"cutting\": 1.0,\n" +
                "                \"blunt\": 1.0,\n" +
                "                \"piercing\": 1.0\n" +
                "            },\n" +
                "            \"color\": {\n" +
                "                \"red\": 140,\n" +
                "                \"green\": 127,\n" +
                "                \"blue\": 157\n" +
                "            }\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"dawnstone\",\n" +
                "            \"oreDictList\": \"ingotDawnstone\",\n" +
                "            \"properties\": {\n" +
                "                \"tier\": 5,\n" +
                "                \"durability\": 6.0,\n" +
                "                \"flexibility\": 1.5,\n" +
                "                \"sharpness\": 3.8,\n" +
                "                \"hardness\": 3.3,\n" +
                "                \"resistance\": 60,\n" +
                "                \"density\": 3.2,\n" +
                "                \"melting_point\": 2500,\n" +
                "                \"rarity\": 0,\n" +
                "                \"enchantability\": 15,\n" +
                "                \"craft_tier\": 4,\n" +
                "                \"craft_time_modifier\": 10.0,\n" +
                "                \"unbreakable\": false\n" +
                "            },\n" +
                "            \"armour_stats\": {\n" +
                "                \"cutting\": 1.0,\n" +
                "                \"blunt\": 1.0,\n" +
                "                \"piercing\": 1.0\n" +
                "            },\n" +
                "            \"color\": {\n" +
                "                \"red\": 255,\n" +
                "                \"green\": 182,\n" +
                "                \"blue\": 72\n" +
                "            }\n" +
                material_aluminum +
                material_electrum +
                material_nickel +
                "        }\n" +
                "    ]\n" +
                "}");
            tempWriter.flush();
            tempWriter.close();
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
    public static void RecipeWriter(FMLPreInitializationEvent event, String recipeName, String recipe) {
        if (Config.enableChanges) {
            try {
                String path = "MineFantasyReforged/custom/recipes/anvil_recipes/";
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
