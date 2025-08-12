package com.Lenvill;

@net.minecraftforge.common.config.Config(modid = EmberforgedMain.MODID)
public class Config {

    @net.minecraftforge.common.config.Config.RequiresMcRestart
    @net.minecraftforge.common.config.Config.Comment("Makes Ember's plates uncraftable. You should be using MFRs plates anyway.")
    public static boolean disableEmbersPlates = true;

    @net.minecraftforge.common.config.Config.RequiresMcRestart
    @net.minecraftforge.common.config.Config.Comment("Alternate Clockwork Attenuator Recipe that doesn't use electrum. This will automatically turn on if no electrum is detected")
    public static boolean altClockworkAttenuatorRecipe = false;

    @net.minecraftforge.common.config.Config.RequiresMcRestart
    @net.minecraftforge.common.config.Config.Comment("Alternate Sparkplug Recipe that doesn't use aluminum. This will automatically turn on if no aluminum is detected")
    public static boolean altSparkplugRecipe = false;

    @net.minecraftforge.common.config.Config.RequiresMcRestart
    @net.minecraftforge.common.config.Config.Comment({"Enable or disable the presence of default/vanilla style recipes.","Note: MFR metal registration can be disabled in MFR's config file"})
    public static boolean recipeChanges = true;

    @net.minecraftforge.common.config.Config.RequiresMcRestart
    @net.minecraftforge.common.config.Config.Comment("Disable these materials from having melting recipes. For materials like Encrusted or Composite alloy")
    public static String[] disableMetalMelting = new String[] {"encrusted","composite_alloy","ironwood","steeleaf"};

    @net.minecraftforge.common.config.Config.Comment("Tool for debugging")
    public static boolean advancedLogs = false;
}
