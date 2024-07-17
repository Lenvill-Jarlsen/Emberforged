package com.Lenvill.mfrAPI;

public class MaterialProperties {
    int tier;
    double durability;
    double flexibility;
    double sharpness;
    double hardness;
    double resistance;
    double density;
    int melting_point;
    int rarity;
    int enchantability;
    int craft_tier;
    double craft_time_modifier;
    boolean unbreakable;

    //Getters
    public int getTier() {
        return tier;
    }

    public double getDurability() {
        return durability;
    }

    public double getFlexibility() {
        return flexibility;
    }

    public double getSharpness() {
        return sharpness;
    }

    public double getHardness() {
        return hardness;
    }

    public double getResistance() {
        return resistance;
    }

    public double getDensity() {
        return density;
    }

    public int getMelting_point() {
        return melting_point;
    }

    public int getRarity() {
        return rarity;
    }

    public int getEnchantability() {
        return enchantability;
    }

    public int getCraft_tier() {
        return craft_tier;
    }

    public double getCraft_time_modifier() {
        return craft_time_modifier;
    }

    public boolean isUnbreakable() {
        return unbreakable;
    }

    //Setters
    public void setTier(int tier) {
        this.tier = tier;
    }

    public void setDurability(double durability) {
        this.durability = durability;
    }

    public void setFlexibility(double flexibility) {
        this.flexibility = flexibility;
    }

    public void setSharpness(double sharpness) {
        this.sharpness = sharpness;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public void setMelting_point(int melting_point) {
        this.melting_point = melting_point;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public void setEnchantability(int enchantability) {
        this.enchantability = enchantability;
    }

    public void setCraft_tier(int craft_tier) {
        this.craft_tier = craft_tier;
    }

    public void setCraft_time_modifier(double craft_time_modifier) {
        this.craft_time_modifier = craft_time_modifier;
    }

    public void setUnbreakable(boolean unbreakable) {
        this.unbreakable = unbreakable;
    }
}
