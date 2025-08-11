package com.Lenvill.fluids;

import net.minecraftforge.fluids.Fluid;
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

}
