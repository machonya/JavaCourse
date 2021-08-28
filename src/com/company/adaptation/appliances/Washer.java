package com.company.adaptation.appliances;

import java.util.Scanner;

public class Washer extends CleaningDevices {
    private int rpm;
    private float maxCapacity;
    private float capacityWasher;

    Scanner scanner = new Scanner(System.in);

    public Washer(int power, String name, int cycles, int maxCycles, int rpm, float maxCapacity) {
        super(power, name, cycles, maxCycles);
        this.rpm = rpm;
        this.maxCapacity = maxCapacity;

    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public float getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(float maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public float getCapacityWasher() {
        return capacityWasher;
    }

    public void setCapacityWasher(float capacityWasher) {
        if (capacityWasher < 0) {
            capacityWasher *= -1;
        }
        this.capacityWasher = capacityWasher;
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    public void takingClothes() {
        System.out.println("Сколько кг одежды вы хотите загрузить?");
        capacityWasher = scanner.nextFloat();
        if (capacityWasher <= maxCapacity && capacityWasher != 0) {
            System.out.println("Одежда загружена");
        } else {
            System.out.println("Перегруз");
            off();
        }
    }

    public void toWash() {
        if (!on) {
            System.out.println("Одежда постиралась");
        } else
            System.out.println("Error");
    }

}
