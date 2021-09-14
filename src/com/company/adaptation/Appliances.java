package com.company.adaptation;

import java.util.Objects;

public class Appliances implements Comparable {
    int power;
    String name;


    public Appliances(int power, String name) {
        this.power = power;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "name='" + name + '\'' +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void on() {
        System.out.println(name + "Прибор включен");
    }

    public void off() {
        System.out.println("Прибор выключен");
    }


    @Override
    public int compareTo(Object o) {

        Appliances appliances = (Appliances) o;
        if (this.power < appliances.power) {
            return -1;
        } else if (this.power > appliances.power) {
            return 1;
        }
        return 0;

    }
}

