package com.company.taskclasses;

public class ConstructionEppliances extends ElectricalAppliances {


    public ConstructionEppliances(String name, int power, int numCycles) {
        super(name, power, numCycles);
    }

    @Override
    public void enable() {
        super.enable();
    }

    @Override
    public void disable() {
        super.disable();
    }
}
