package com.company.createrobots;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }
    public ToshibaHead(){}


    @Override
    public void speak() {
        System.out.println("Toshiba head say How are you ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
