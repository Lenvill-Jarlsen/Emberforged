package com.Lenvill.fluids;

import net.minecraftforge.fluids.Fluid;
import teamroots.embers.RegistryManager;

import java.awt.*;

public class MoltenFluid extends Fluid {

    public MoltenFluid(String fluidName, Color color) {
        super(fluidName, RegistryManager.fluid_molten_tin.getStill(), RegistryManager.fluid_molten_tin.getFlowing(), color);
    }

}
