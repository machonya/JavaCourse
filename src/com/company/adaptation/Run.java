package com.company.adaptation;

import com.company.adaptation.tableware.Cups;
import com.company.lesson4_1.Person;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Kettle kettle = new Kettle(200, "Bosh", 700, 700, 3);
        kettle.on();
        Kettle kitti = new Kettle(400, "Hot", 800, 350, 4);


        Person person = new Person("Vitya", 25, 180, 70);
        Cups cups = new Cups("Teecup", 200, 150);
        person.pour(kettle, cups);
        System.out.println();
        person.drink(cups);
        kettle.on();
        person.pour(kettle, cups);

        System.out.println();


        VacuumCleaner philips = new VacuumCleaner(700, "Philips", 800, 0);
        philips.on();
        person.vacuum(philips);
        philips.off();
        System.out.println("В контейнере " + philips.getDustVol());

        System.out.println();

        HashSet<Appliances> hashSet = new HashSet<>();
        hashSet.add(kettle);
        hashSet.add(kitti);
        hashSet.add(philips);

        for (Appliances appliances1 : hashSet) {
            if (appliances1.getPower() == 400) {
                System.out.println(appliances1);
            }
        }


    }
}
