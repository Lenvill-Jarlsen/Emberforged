package com.Lenvill.recipe.factories;

import com.Lenvill.Config;
import com.google.gson.JsonObject;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;

import java.util.function.BooleanSupplier;

public class AltSparkPlugToggle implements IConditionFactory {
    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        return () -> Config.altSparkPlugToggle;
    }
}
