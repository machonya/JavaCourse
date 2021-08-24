package com.company.adaptation.tableware;

public abstract  class TableWare {
    String name;
    float vol;

    public TableWare(String name, float vol) {
        this.name = name;
        this.vol = vol;
    }

    public float getVol() {
        return vol;
    }

    public void setVol(float vol) {
        this.vol = vol;
    }
}
