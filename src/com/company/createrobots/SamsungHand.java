package com.company.createrobots;

public class SamsungHand implements IHand {
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }
    public SamsungHand(){}


    @Override
    public void upHand() {
        System.out.println("Samsung's hand goes down and up ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
