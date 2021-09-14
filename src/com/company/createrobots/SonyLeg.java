package com.company.createrobots;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }
    public SonyLeg(){}


    @Override
    public void step() {
        System.out.println("Sony leg steps forward");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
