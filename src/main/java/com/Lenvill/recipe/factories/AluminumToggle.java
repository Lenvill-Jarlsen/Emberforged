package com.Lenvill.recipe.factories;

import com.Lenvill.Config;
import com.Lenvill.EmberforgedMain;
import com.google.gson.JsonObject;
import minefantasy.mfr.registry.material.CustomMaterialRegistry;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import teamroots.embers.config.ConfigMaterial;

import java.util.function.BooleanSupplier;

public class AluminumToggle implements IConditionFactory {
    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        /// registryCheck should be True if the material is present ///
        boolean registryCheck = CustomMaterialRegistry.getMaterial("aluminum") != CustomMaterialRegistry.NONE;
        EmberforgedMain.LOG.info("AluminumToggleCheck");
        return () -> ConfigMaterial.ALUMINUM.mustLoad() || registryCheck;
    }
}
