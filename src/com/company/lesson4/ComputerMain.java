package com.company.lesson4;

public class ComputerMain {
    public static void main(String[] args) {
        Computer comp = new Computer("ryzen", 16, 500, 3);
        System.out.println(comp);
        for (int i = 0; i <= comp.resource; i++) {

            comp.isComputerOn();
            comp.isComputerOff();
            comp.isComputerFire();
            for (int j = 0; j <= comp.resource; j++) {
                if (comp.isTrue){

                }else
                    break;
            }

        }

    }
}
