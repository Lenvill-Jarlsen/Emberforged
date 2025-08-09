package com.Lenvill.mfrAPI;

import minefantasy.mfr.registry.material.CustomMaterial;

import java.util.ArrayList;

import static com.Lenvill.EmberforgedMain.MODID;

public class Scribe {
    //I now (sort of) know what I am doing
    String mod = MODID;
    ArrayList<CustomMaterial> metals;

    public Scribe(){
        metals = new ArrayList<CustomMaterial>();
    }

    /**
     * @param material
     */
    public void addMaterial(CustomMaterial material) {
        metals.add(material);
    }

    public Object[] getMetals() {
        return metals.toArray();
    }
}
