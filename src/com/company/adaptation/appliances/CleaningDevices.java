package com.company.adaptation.appliances;

public class CleaningDevices extends HomeElectricalAppliances {


    public CleaningDevices(int power, String name, int cycles, int maxCycles) {
        super(power, name, cycles, maxCycles);
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    public void toCleanse() {
        System.out.println("В помещении стало чище");
    }
}




