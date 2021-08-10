package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task17_7 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number:");

        int n = scan.nextInt();


        int[] mass = new int[9];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
            if (n == mass[i]) {
                counter++;
            }

        }
        System.out.println("Number of coincidences: "+counter);


    }
}
