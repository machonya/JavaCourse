package com.company.adaptation.appliances;

import com.company.adaptation.personForAdaptation.Consistency;
import com.company.adaptation.personForAdaptation.Ingredients;
import com.company.adaptation.personForAdaptation.Person;
import com.company.adaptation.personForAdaptation.tableware.Cups;

import java.util.HashSet;


public class RunAp {
    public static void main(String[] args) {


        Person viktor = new Person("Viktor", 24, 186, 76, 100);

        Washer washer = new Washer(1200, "Samsung", 0, 4, 1000, 6);

        VacuumCleaner vacuumCleaner = new VacuumCleaner(1000, "samsug", 5, 105,
                300);


        Kettle kettle = new Kettle(400, "Kitti", 0, 2, 900, 0);

        Cups cups = new Cups("Teacup", 200, 0);


        Multicooker redmi = new Multicooker(1200, "Redmi", 0, 4, 1000, 300);

        Ingredients kartofel = new Ingredients(Consistency.SOLID, "Картофель", 250);
        Ingredients water = new Ingredients(Consistency.LIQUID, "Water", 100);

        viktor.toWashPerson(washer);
        System.out.println();

        viktor.cook(redmi, kartofel);
        System.out.println();

        viktor.brewTea(kettle, cups, water);
        System.out.println();

        viktor.vacuum(vacuumCleaner);


        HashSet<HomeElectricalAppliances> hashSet = new HashSet<>();
        hashSet.add(kettle);
        hashSet.add(redmi);
        hashSet.add(vacuumCleaner);

        for (HomeElectricalAppliances appliances1 : hashSet) {
            if (appliances1.getPower() == 400) {
                System.out.println(appliances1);
            }
            if (appliances1.getPower() == 1200) {
                System.out.println(appliances1);
            }

        }

    }
}
