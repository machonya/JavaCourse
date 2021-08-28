package com.company.adaptation.appliances;

import com.company.adaptation.personForAdaptation.Consistency;
import com.company.adaptation.personForAdaptation.Ingredients;
import com.company.adaptation.personForAdaptation.tableware.Cups;
import com.company.adaptation.personForAdaptation.tableware.TableWare;

import java.util.Scanner;

public class Kettle extends KitchenElectricalAppliances {

    private float time;
    private float volWater;
    boolean check;
    private float kwh;

    Scanner scanner = new Scanner(System.in);

    public Kettle(int power, String name, int cycles, int maxCycles, float volume, float volWater) {
        super(power, name, cycles, maxCycles, volume);
        this.volWater = volWater;
    }

    @Override
    public int getCycles() {
        return super.getCycles();
    }

    @Override
    public void setCycles(int cycles) {
        super.setCycles(cycles);
    }

    @Override
    public void setMaxCycles(int maxCycles) {
        super.setMaxCycles(maxCycles);
    }

    @Override
    public float getVolume() {
        return super.getVolume();
    }

    @Override
    public int getMaxCycles() {
        return super.getMaxCycles();
    }

    @Override
    public float getVolWater() {
        System.out.println(volWater);
        return volWater;
    }

    @Override
    public float getKwh() {
        return kwh;
    }

    @Override
    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

    public float getTime() {
        return time;
    }

    @Override
    public void on() {
        if (getVolWater() > 0 && check && cycles < maxCycles) {
            System.out.println("Чайник " + name + " включен");
            time = getVolWater() / (float) getPower() / 10;
            System.out.println("Чайник закипел за " + (time * 10) + " минут");
            volWater = (float) (volWater * 0.97);
            System.out.println("В чайнике осталось " + getVolWater());
        } else {
            System.out.println("проблема");
            super.on = false;

        }
    }

    @Override
    public void off() {
        super.off();
    }

    public void pourWaterIntoTheCups(Cups cups) {
        if (on && volWater != 0) {
            System.out.println("Какое количество воды вы хотите налить ?");
            float waterPerson = scanner.nextFloat();
            if (waterPerson <= volWater) {
                if (waterPerson < cups.getVol()) {
                    cups.setLiquidVol(waterPerson);
                    volWater -= waterPerson;
                    System.out.println("В чайнике осталось " + volWater);
                } else {
                    System.out.println("Слишком много жидкости");
                }
            } else
                System.out.println("Недостаточно жидкости");
        }
    }

    public void pourWaterIntoTheKettle(Ingredients ingredients) {
        if (ingredients.getConsist() == Consistency.LIQUID) {
            System.out.println("Сколько жидкости налить в чайник");
            float waterPersen = scanner.nextFloat();
            if (waterPersen < getVolume()) {
                volWater += waterPersen;
            } else {
                System.out.println("слишком много жидкости");
            }
            check = true;
        } else {
            System.out.println("Неподходящий ингредиент");
            check = false;
        }
    }

    public void energyConsumptionKettle(Kettle kettle) {
        kettle.setKwh(kettle.getPower() / 60.0f * getTime());
        System.out.println("Расходовал энергии " + getKwh() + "Watt");


    }
}



