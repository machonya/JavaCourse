package com.company.createrobots;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }
    public SamsungHead(){}



    @Override
    public void speak() {
        System.out.println("Samsung head speak small ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
