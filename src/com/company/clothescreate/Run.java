package com.company.clothescreate;

public class Run {
    public static void main(String[] args) {
        AdidasJacket adidasJacket = new AdidasJacket();
        AdidasTrousers adidasTrousers = new AdidasTrousers();
        AdidasShoes adidasShoes = new AdidasShoes();

        ReebookJacket reebookJacket = new ReebookJacket();
        ReebokTrousers reebokTrousers = new ReebokTrousers();
        ReebokShoes reebokShoes = new ReebokShoes();

        Person[] persons = new Person[2];
        persons[0] = new Person("Vitya", adidasJacket, reebokTrousers, adidasShoes);
        persons[1] = new Person("Stas", reebookJacket, adidasTrousers, reebokShoes);

        System.out.print(persons[0].getName());
        persons[0].undress();
        System.out.println();

        System.out.print(persons[0].getName());
        persons[0].getDressed();
        System.out.println();

        System.out.print(persons[1].getName());
        persons[1].undress();
        System.out.println();

        System.out.print(persons[1].getName());
        persons[1].getDressed();
    }
}
