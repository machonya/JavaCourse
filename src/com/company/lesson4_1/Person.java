package com.company.lesson4_1;

import com.company.adaptation.Kettle;
import com.company.adaptation.VacuumCleaner;
import com.company.adaptation.tableware.Cups;

public class Person {
    public String name;
    private int age;
    private int height;
    private int weight;
    private int hp = 100;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        setAge(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight + ", hp="+hp+
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0) {
            this.age = age * -1;
        }

    }

    public void eat(Eat eat) {
        System.out.println(name + " eats");
    }

    public void drink(Cups cups) {
        cups.setVollWater(cups.getVol() - cups.getVollWater());
        System.out.println(name+ " налил воды в чашку " + cups.getVol() + " ml");
        cups.setVollWater(cups.getVol() - cups.getVollWater());
        System.out.print(name + " попил воды, в чашке осталось ");
        System.out.println(cups.getVol() - cups.getVollWater() + " ml");





    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp > 0 && hp <= 100){
        this.hp = hp;}
    }

    public void lookHp() {
        System.out.println("hp " + name + " " + getHp());
    }

    public void pour(Kettle kettle, Cups cup) {
        System.out.print("В чайнике осталось ");
        kettle.setVolWater(kettle.getWater()- cup.getVol());
        kettle.setKwh(kettle.getPower() / kettle.getTime());
        System.out.println("Расходовал энергии "+ kettle.getKwh()+" watt");


    }
    public void vacuum(VacuumCleaner cleaner) {
        cleaner.setDustVol(cleaner.getContainerVol() / cleaner.getPower());
        System.out.println(name + " пропылесосил комнату");
    }

}
