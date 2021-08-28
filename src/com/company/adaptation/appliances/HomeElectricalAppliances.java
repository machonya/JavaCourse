package com.company.adaptation.appliances;

public class HomeElectricalAppliances implements ElectricalAppliances {
    private int power;
    String name;
    boolean on = false;

    int cycles = 0;
    int maxCycles;
    float kwh;
    float time;

    public HomeElectricalAppliances(int power, String name, int cycles, int maxCycles) {
        this.power = power;
        this.name = name;
        this.cycles = cycles;
        this.maxCycles = maxCycles;

    }


    @Override
    public String toString() {
        return "power " + power +
                ", name " + name + '\'';
    }

    public int getCycles() {
        return cycles;
    }

    public void setCycles(int cycles) {
        this.cycles = cycles;
    }

    public void setMaxCycles(int maxCycles) {
        this.maxCycles = maxCycles;
    }

    public int getMaxCycles() {
        return maxCycles;
    }

    public int getPower() {
        return power;
    }

    public float getKwh() {
        return kwh;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }


    @Override
    public void on() {
        if (!on && cycles <= maxCycles) {
            on = false;
        } else {
            System.out.println("Проблема!");


        }


    }

    @Override
    public void off() {
        if (!on) {
            System.out.println("Прибор " + name + " выключен");
            on = false;
            cycles++;
        }
    }

    public void energyСonsumption() {
        setKwh(getPower() / 60.0f * time);
        System.out.println("Расходовал энергии " + getKwh() + " Watt");


    }

    public float getTime() {
        return time;
    }
}
