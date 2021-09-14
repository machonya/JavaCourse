package com.company.createrobots;

public class SonyHead implements IHead {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }
    public SonyHead(){}


    @Override
    public void speak() {
        System.out.println("Sony head says hello ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
