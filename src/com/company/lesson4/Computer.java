package com.company.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String cpu;
    Integer ram;
    Integer ssd;
    Integer resource;
    int cyclec = 0;
    boolean isTrue = true;
    private boolean on = false;
    private boolean off = true;


    public Computer(String cpu, Integer ram, Integer ssd, Integer resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "Computer" + "\n" + '{' +
                "cpu: " + cpu + '\n' +
                " ram: " + ram + "\n" +
                " ssd: " + ssd + "\n" +
                " resource: " + resource +
                '}';
    }


    public void isComputerOn() {
        if (isTrue && off) {
            int rand;
            int num;
            Random random = new Random();
            rand = random.nextInt(2);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number 0 or 1:");
            num = scanner.nextInt();


            if (num == rand) {
                System.out.println("Is computer on");
                on = true;
                off = false;

            } else {
                System.out.println("This computer burned out");
                isTrue = false;
            }


        }

    }

    public void isComputerOff() {
        if (isTrue && on) {
            int rand;
            int num;
            Random random = new Random();
            rand = random.nextInt(2);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number 0 or 1:");
            num = scanner.nextInt();


            if (num == rand) {
                System.out.println(" Is computer off");
                off = true;
                on = false;
                this.cyclec += 1;
            } else {
                System.out.println("This computer burned out");
                isTrue = false;
            }

        }

    }


    public void isComputerFire() {
        if (resource <= cyclec) {
            System.out.println("This computer burned out");
            this.isTrue = false;


        }


    }

}



