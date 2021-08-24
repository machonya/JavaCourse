package com.company.adaptation;

public class VacuumCleaner extends CleaningDevices {
    String name;
    private float containerVol;
    private float dustVol;
    boolean on = false;
    boolean off = true;

    public VacuumCleaner(int power, String name, float containerVol, float dustVol) {
        super(power, name);
        this.containerVol = containerVol;
        this.dustVol = dustVol;
    }


    public float getContainerVol() {
        return containerVol;
    }

    public void setContainerVol(float containerVol) {
        this.containerVol = containerVol;
    }

    public float getDustVol() {
        return dustVol;
    }

    public void setDustVol(float dustVol) {
        this.dustVol = dustVol;
    }

    @Override
    public void on() {
        if (off && dustVol < containerVol) {
            System.out.println(name + "Пылесос включен");
            dustVol += containerVol / power;
            off = false;
            on = true;
        } else
            System.out.println("Контейнер заполнен");
    }


    @Override
    public void off() {
        if (on)
            super.off();
        on = false;
        off = true;
    }
}
