package com.company.adaptation.tableware;

public class Cups extends TableWare {
    private float vollWater;

    public Cups(String name, float vol, float vollWater) {
        super(name, vol);
        this.vollWater = vollWater;
    }

    public float getVollWater() {
        return vollWater;
    }

    public void setVollWater(float vollWater) {
        this.vollWater = vollWater;
    }
}
