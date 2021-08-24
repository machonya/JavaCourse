package com.company.adaptation;

public class Kettle extends KitchenAppliances {
    private float vol;
    private float volWater;
    boolean on = false;
    boolean off = true;
    int cycles = 0;
    int maxCycles;
    float kwh;
    float h = 60;
    float time;
    String name;


    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getKwh() {
        return kwh;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

    public float getVol() {
        return vol;
    }

    public void setVol(float vol) {
        this.vol = vol;
    }

    public float getWater() {
        System.out.println(volWater);
        return volWater;
    }

    public void setVolWater(float volWater) {
        this.volWater = volWater;
    }

    public Kettle(int power, String name, float vol, float volWater, int maxCycles) {
        super(power, name);
        this.vol = vol;
        this.volWater = volWater;
        this.maxCycles = maxCycles;

    }


    @Override
    public void on() {
        if (off && cycles < maxCycles) {
            if (volWater == 0) {
                off();
            } else {
                System.out.println("Прибор включен ");
                time = volWater / (float) power;
                System.out.println("Чайник закипел за " + time + " минут");
                volWater *= 0.95;
                off = false;
                on = true;
                off();
            }

        } else
            System.out.println("Прибор сломан ");

    }

    @Override
    public void off() {
        if (on) {
            super.off();
            on = false;
            off = true;
            cycles++;

        }


    }

}