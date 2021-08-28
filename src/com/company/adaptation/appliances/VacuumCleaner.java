package com.company.adaptation.appliances;

import com.company.adaptation.appliances.CleaningDevices;

public class VacuumCleaner extends CleaningDevices {
    private float containerVol;
    private float dustVol;
    private float time;

    public VacuumCleaner(int power, String name, int cycles, int maxCycles,
                         float containerVol) {
        super(power, name, cycles, maxCycles);
        this.containerVol = containerVol;

    }

    public float getContainerVol() {
        return containerVol;
    }

    @Override
    public float getTime() {
        return time;
    }


    public float getDustVol() {
        System.out.println(dustVol);
        return dustVol;
    }

    public void setDustVol(float dustVol) {
        this.dustVol = dustVol;
    }




    @Override
    public void on() {
        if (on && dustVol < containerVol) {
            System.out.println("Пылесос " + name + " включен");
            on = true;
        } else {
            System.out.println("Контейнер заполнен");
        }
    }



    @Override
    public void off() {
        if (on)
            System.out.println("Пылесос " + name + " выключен");
        on = false;

    }
    public void collectDust(){
        System.out.println("Пыль собрана");
        dustVol += containerVol * 0.1f;
        System.out.println("В контейнере " + dustVol);
        toCleanse();
    }
    public void energyConsumptionVacuumCleaner(VacuumCleaner cleaner) {
        cleaner.setKwh(cleaner.getPower() / getContainerVol() * getDustVol());
        System.out.println("Расходовал энергии " + getKwh() + "Watt");
    }

}
