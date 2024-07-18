package com.Lenvill.recipe.factories;

import com.google.gson.JsonObject;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import teamroots.embers.ConfigManager;

import java.util.function.BooleanSupplier;

public class AluminumToggle implements IConditionFactory {
    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        return () -> ConfigManager.enableAluminum;
    }
}
