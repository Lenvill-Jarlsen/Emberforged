package com.Lenvill.mfrAPI;

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
}


