package com.company.lesson3;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        int[] arr2 = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(15);
            arr2[i] = random.nextInt(15);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }

        System.out.println(" ");
        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += arr[i];
            average2 += arr2[i];
        }
        average1 /= arr.length;
        average2 /= arr2.length;


        if (average1 > average2) {
            System.out.println("Среднее арифметическое  массива arr больше среднего арифметического массива arr2");

        }
        else if (average2 > average1) {
            System.out.println("Среднее арифметическое  массива arr2 больше среднего арифметического массива arr");
        }
        else {
            System.out.println("Средние арифметические обоих массивов равны");
        }


    }

}
