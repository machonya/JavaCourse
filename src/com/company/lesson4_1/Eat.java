package com.company.lesson4_1;

public class Eat {
    private String name;
    private int calories;

    public Eat(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", calories=" + calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
