package com.company.clothescreate;

public class Person implements IPerson {
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IShoes shoes;

    public Person(String name, IJacket jacket, ITrousers trousers, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void getDressed() {
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();

    }

    @Override
    public void undress() {
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();


    }
}
