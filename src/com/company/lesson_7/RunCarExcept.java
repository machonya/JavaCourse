package com.company.lesson_7;

import java.util.HashSet;

public class RunCarExcept {
    public static void main(String[] args) {
        Car merc = new Car("Mercedes", 240, 35000);
        Car bmw = new Car("BMW", 230, 30000);
        Car vw = new Car("Volkswagen", 240, 18000);
        HashSet<Car> hashSet = new HashSet<>();
        hashSet.add(bmw);
        hashSet.add(merc);
        hashSet.add(vw);

        for (Car cars : hashSet) {

            try {
                cars.start();
            } catch (CustomException customException) {
                customException.printStackTrace();
            }
        }

    }
}
