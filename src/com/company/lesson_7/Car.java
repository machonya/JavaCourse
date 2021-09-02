package com.company.lesson_7;

import java.util.Random;

public class Car {
    String model;
    private int speed;
    private  int cost;

    public Car(String model, int speed, int cost) {
        this.model = model;
        this.speed = speed;
        this.cost = cost;
    }
    public Car(String cars) {}

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void start() throws CustomException {
        Random rand = new Random();
        int num = rand.nextInt(20);
        if (num %2 == 0){
            throw new CustomException("Wrong number");

        }else {
            System.out.println("The car " + model+ " started");
        }
    }
}
