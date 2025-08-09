package com.Lenvill.factories.materials;

import com.Lenvill.Config;
import com.google.gson.JsonObject;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import teamroots.embers.config.ConfigMaterial;

import java.util.function.BooleanSupplier;

public class AluminumMaterialToggle implements IConditionFactory  {
    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        if (ConfigMaterial.ALUMINUM.mustLoad()) {
            return () -> true;
        } else {
            return () -> false;
        }
    }
}
