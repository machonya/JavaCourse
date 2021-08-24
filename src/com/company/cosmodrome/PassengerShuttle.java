package com.company.cosmodrome;

public class PassengerShuttle extends Shuttle{
    private int seatsNum;
    private int numPersons;

    public PassengerShuttle(String name, float maxLifting, float cargo, int seatsNum, int numPersons) {
        super(name, maxLifting, cargo);
        this.seatsNum = seatsNum;
        this.numPersons = numPersons;
    }

    public int getNumPersons() {
        return numPersons;
    }

    public void setNumPersons(int numPersons) {
        this.numPersons = numPersons;
    }

    @Override
    public float getMaxLifting() {
        return super.getMaxLifting();
    }

    @Override
    public float getCargo() {
        return super.getCargo();
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    @Override
    public boolean systemCheck() {
        if (getNumPersons() <= getSeatsNum()) {
        return super.systemCheck();
    }else {
            System.out.println("Слишком много пассажиров");
        }
        return false;


}

    @Override
    public void engineStart() {
        super.engineStart();
    }

    @Override
    public void start() {
        super.start();
    }
}
