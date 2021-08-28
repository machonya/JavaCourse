package com.company.adaptation.appliances;

import java.util.Scanner;

public class Multicooker extends KitchenElectricalAppliances {
    private float maxTemp;
    Scanner scanner = new Scanner(System.in);

    public Multicooker(int power, String name, int cycles, int maxCycles,float volume, float maxTemp) {
        super(power, name, cycles, maxCycles, volume);
        this.maxTemp = maxTemp;
    }

    @Override
    public void on() {
        System.out.println("Мультиварка включена");
        System.out.println("Выставьте температуру ");
        float temp = scanner.nextFloat();
        if (temp > 0 && temp <= maxTemp) {
            System.out.println("Приготовление началось");
            super.on = true;
        }else
            System.out.println("Неподходящая температура");

    }

    @Override
    public void off() {
        super.off();
    }

    @Override
    public void takeIngredients() {
        super.takeIngredients();
    }

    public void cookingFood(Multicooker multicooker) {
        System.out.println("Всё готово!" );
        super.on = false;


    }
}
