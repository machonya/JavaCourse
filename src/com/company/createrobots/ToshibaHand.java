package com.company.createrobots;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price){
        this.price = price;
    }
    public ToshibaHand(){}



    @Override
    public void upHand() {
        System.out.println("Toshiba waving hand ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
