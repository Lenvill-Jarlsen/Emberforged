package com.Lenvill.mfrAPI;

import minefantasy.mfr.material.CustomMaterial;
import minefantasy.mfr.material.MetalMaterial;

public class Material {
    String name;
    String oreDictList;

    MaterialProperties properties;
    MaterialArmorStats armour_stats;
    MaterialColor color;

    public Material(String name, String oreDictList) {
        this.name = name;
        this.oreDictList = oreDictList;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getOreDictList() {
        return oreDictList;
    }

    public MaterialProperties getProperties() {
        return properties;
    }

    public MaterialArmorStats getArmour_stats() {
        return armour_stats;
    }

    public MaterialColor getColor() {
        return color;
    }


    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setOreDictList(String oreDictList) {
        this.oreDictList = oreDictList;
    }

    public void setProperties(MaterialProperties properties) {
        this.properties = properties;
    }

    public void setArmour_stats(MaterialArmorStats armour_stats) {
        this.armour_stats = armour_stats;
    }

    public void setColor(MaterialColor color) {
        this.color = color;
    }

    public MetalMaterial toMetalMaterial() {
        float[] armour = new float[]{armour_stats.getCutting(), armour_stats.getBlunt(), armour_stats.getPiercing()};
        int[] colors = new int[]{color.getRed(), color.getGreen(), color.getBlue()};

        CustomMaterial metalMaterial = new MetalMaterial(
                name,
                properties.getTier(),
                properties.getHardness(),
                properties.getDurability(),
                properties.getFlexibility(),
                properties.getSharpness(),
                properties.getResistance(),
                properties.getDensity(),
                properties.getEnchantability(),
                armour,
                colors,
                oreDictList
        ).setMeltingPoint(properties.getMelting_point())
                .setRarity(properties.getRarity())
                .setCrafterTiers(properties.getCraft_tier())
                .setUnbreakable(properties.isUnbreakable());

        metalMaterial.craftTimeModifier = properties.getCraft_time_modifier();

        return (MetalMaterial) metalMaterial.register();
    }
}