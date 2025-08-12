package com.Lenvill.fluids;

import minefantasy.mfr.registry.material.CustomMaterial;
import minefantasy.mfr.registry.material.CustomMaterialRegistry;
import minefantasy.mfr.util.Utils;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import teamroots.embers.register.FluidRegister;

import java.awt.*;

public class MoltenFluid extends Fluid {

    public MoltenFluid(String fluidName, Color color) {
        super(fluidName, FluidRegister.FLUID_MOLTEN_TIN.getStill(), FluidRegister.FLUID_MOLTEN_TIN.getFlowing(), color);
    }

    @Override
    public String toString(){
        return String.format("%s", this.fluidName);
    }

    @Override
    public String getLocalizedName(FluidStack stack) {
        CustomMaterial material = CustomMaterialRegistry.getMaterial(this.fluidName);
        String name = "any";
        String localized_material = null;
        if (material != null && material != CustomMaterialRegistry.NONE) {
            name = material.getName();
            localized_material = I18n.translateToLocal("material." + name + ".name");
        }
        if (localized_material != null && !localized_material.endsWith(".name")) {
            name = localized_material;
        }
        return I18n.translateToLocalFormatted(
                "fluid.molten_fluid_template",
                I18n.translateToLocal(Utils.convertSnakeCaseToSplitCapitalized(name)));
    }

}
