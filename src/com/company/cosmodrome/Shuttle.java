package com.company.cosmodrome;


import java.lang.Math;
import java.util.Random;

public class Shuttle extends Cosmodrom implements IStart{
    String name;
    private float maxLifting;
    private float cargo;

    public Shuttle(String name, float maxLifting, float cargo) {
        this.name = name;
        this.maxLifting = maxLifting;
        this.cargo = cargo;
    }

    public float getMaxLifting() {
        return maxLifting;
    }

    public float getCargo() {
        return cargo;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean systemCheck() {
        int randNum;
        Random rand = new Random();
        randNum = rand.nextInt(10);
        System.out.println(randNum);
        if (randNum > 3){
            return true;
        }else {
            System.out.println("Проверка шаттла "+getName()+" не пройдена");
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели шаттла "+getName()+" запущены. Все системы в норме");

    }

    @Override
    public void start() {
        System.out.println("Шаттл "+getName()+" взлетел");

    }

}
