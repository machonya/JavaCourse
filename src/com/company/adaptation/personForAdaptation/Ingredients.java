package com.company.adaptation.personForAdaptation;

public class Ingredients {
    Consistency consist;
    String name;
    float cookingTemp;

    public Ingredients(Consistency consist, String name, float cookingTemp) {
        this.consist = consist;
        this.name = name;
        this.cookingTemp = cookingTemp;

    }

    public Consistency getConsist() {
        System.out.println(consist);
        return consist;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
