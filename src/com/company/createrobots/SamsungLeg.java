package com.company.createrobots;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }
    public SamsungLeg(){}

    @Override
    public void step() {
        System.out.println("Samsung leg takes five steps");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
