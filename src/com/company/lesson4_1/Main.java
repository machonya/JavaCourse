package com.company.lesson4_1;

public class Main {

    public static void main(String[] args) {
        Student viktor = new Student("Viktor", 19, 184, 70, 1);
        System.out.println(viktor);
        viktor.setCourse(2);
        System.out.println(viktor.name + "'s intellect "+ viktor.intelligence());
        Eat cutlet = new Eat("cutlet", 120);

        Workers stas = new Workers("Stas", 27, 182, 67);
        stas.work();
        System.out.println(stas);
        stas.eat(cutlet);
        System.out.println("Stas eats "+cutlet+", hp Stas= "+ stas.getHp());


        Person misha = new Person("Misha", 30, 182, 72);
        misha.sleep();
        misha.eat(cutlet);



    }
}
