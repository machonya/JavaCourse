package com.company.adaptation;

public class CleaningDevices extends Appliances{

    public CleaningDevices(int power, String name) {
        super(power, name);
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }
}
