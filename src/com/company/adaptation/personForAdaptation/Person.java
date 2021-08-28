package com.company.adaptation.personForAdaptation;

import com.company.adaptation.appliances.*;
import com.company.adaptation.personForAdaptation.tableware.Cups;

public class Person {
    public String name;
    private int age;
    private int height;
    private double weight;
    private int hp;

    public Person(String name, int age, int height, double weight, int hp) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hp = hp;

    }

    @Override
    public String toString() {
        return "Person " + name +
                ", age " + age +
                ", height " + height +
                ", weight " + weight +
                ", hp " + hp;
    }

    public int getAge() {
        return age;
    }

    public String setAge(int age) {
        this.age = age;
        if (age < 0 || age > 125)
            return "Человека с таким возрастом не существует";
        return null;
    }

    public int getHeight() {
        return height;
    }

    public String setHeight(int height) {
        this.height = height;
        if (height < 0 || height > 290)
            return "Человека с таким ростом не существует";
        return null;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        if (weight < 0)
            this.weight = weight * -1;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    public void vacuum(VacuumCleaner cleaner) {
        cleaner.on();
        cleaner.collectDust();
        cleaner.off();
        cleaner.energyConsumptionVacuumCleaner(cleaner);



    }

    public void brewTea(Kettle kettle, Cups cups, Ingredients ingredients) {
        kettle.pourWaterIntoTheKettle(ingredients);
        kettle.on();
        kettle.pourWaterIntoTheCups(cups);
        kettle.energyConsumptionKettle(kettle);
        kettle.off();

    }

    public void cook(Multicooker multicooker, Ingredients ingredients) {
        System.out.println(name + " начал готовить");
        multicooker.takeIngredients();
        multicooker.on();
        multicooker.cookingFood(multicooker);
        multicooker.off();

    }

    public void toWashPerson(Washer washer) {
        System.out.println(name + " решил постирать одежду");
        washer.on();
        washer.takingClothes();
        washer.toWash();
        washer.off();

    }


}
