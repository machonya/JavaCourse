package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task13_3 {
    public static void main(String[] args) {
        int c, e = 0, d = 0;
        double average;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        c = scanner.nextInt();

        int[] mas = new int[12];
        for (int i : mas) {
            mas[i] = random.nextInt(18);
            if (mas[i] > c) {
                e += mas[i];
                d++;
            }
        }
        average = e /= d;
        System.out.println("Среднеее арифметическое элементов, превосходящих " +c+": "+average);


    }
}
