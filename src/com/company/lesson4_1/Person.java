package com.company.lesson4_1;

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

    public void drink() {
        System.out.println(name + " drinks");
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
}
