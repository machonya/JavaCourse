package com.company.createrobots;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }
    public ToshibaLeg(){}


    @Override
    public void step() {
        System.out.println("Toshiba leg steps forward and backward ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
