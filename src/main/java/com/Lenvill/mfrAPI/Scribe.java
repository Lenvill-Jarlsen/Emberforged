package com.Lenvill.mfrAPI;

import java.util.ArrayList;

import static com.Lenvill.EmberforgedMain.MODID;

public class Scribe {
    //I now (sort of) know what I am doing
    String mod = MODID;
    ArrayList<Material> metals;

    public Scribe(){
        metals = new ArrayList<>();
    }

    /**
     * @param material
     */
    public void addMaterial(Material material) {
        metals.add(material);
    }

}
