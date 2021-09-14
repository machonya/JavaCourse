package com.company.adaptation.personForAdaptation.tableware;

public class Cups extends TableWare {
    private float liquidVol;


    public Cups(String name, float vol, float liquidVol) {
        super(name, vol);
        this.liquidVol = liquidVol;

    }

    public float getLiquidVol() {
        System.out.println("В чашке "+ liquidVol + " мл");
        return liquidVol;
    }

    public void setLiquidVol(float liquidVol) {
        this.liquidVol = liquidVol;
    }

}
