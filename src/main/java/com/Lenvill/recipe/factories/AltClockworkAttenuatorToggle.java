package com.Lenvill.recipe.factories;

import com.Lenvill.Config;
import com.Lenvill.EmberforgedMain;
import com.google.gson.JsonObject;
import minefantasy.mfr.registry.material.CustomMaterialRegistry;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import teamroots.embers.config.ConfigMaterial;

import java.util.function.BooleanSupplier;

public class AltClockworkAttenuatorToggle implements IConditionFactory {
    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        boolean altClockworkAttenuatorToggle;
        /// registryCheck should be True if the material is present ///
        boolean registryCheck = CustomMaterialRegistry.getMaterial("electrum") != CustomMaterialRegistry.NONE;
        altClockworkAttenuatorToggle = (!ConfigMaterial.ELECTRUM.mustLoad() || Config.altClockworkAttenuatorRecipe || !registryCheck) && Config.recipeChanges;
        EmberforgedMain.LOG.info("AltClockworkAttenuatorCheck");
        EmberforgedMain.LOG.info("Is Embers loading Electrum? " + ConfigMaterial.ELECTRUM.mustLoad());
        EmberforgedMain.LOG.info("Manual Config Override? " + Config.altClockworkAttenuatorRecipe);
        EmberforgedMain.LOG.info("Is Electrum in the registry? " + registryCheck);
        EmberforgedMain.LOG.info("Should any changes be loaded? " + Config.recipeChanges);
        return () -> altClockworkAttenuatorToggle;
    }
}
