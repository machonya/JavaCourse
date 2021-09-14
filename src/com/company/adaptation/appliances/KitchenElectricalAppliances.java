package com.company.adaptation.appliances;

import com.company.adaptation.personForAdaptation.Ingredients;

public class KitchenElectricalAppliances extends HomeElectricalAppliances {
    private float volume;
    private float volWater;

    public KitchenElectricalAppliances(int power, String name, int cycles, int maxCycles, float volume) {
        super(power, name, cycles, maxCycles);
        this.volume = volume;

    }

    public float getVolume() {
        return volume;
    }

    public float getVolWater() {
        return volWater;
    }

    public void setVolWater(float volWater) {
        this.volWater = volWater;
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    public void takeIngredients() {
        System.out.println("Ингридиент загружен");
    }
}