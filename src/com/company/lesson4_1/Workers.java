package com.company.lesson4_1;


public class Workers extends Person {

    public Workers(String name, int age, int height, int weight) {
        super(name, age, height, weight);
    }
    public void work() {
        setHp(getHp()-10);
        System.out.println(name+ " works" );


    }

    @Override
    public void eat(Eat eat) {

        System.out.println(name + " eats");
        setHp(getHp()+ eat.getCalories() / 10);

    }
}
