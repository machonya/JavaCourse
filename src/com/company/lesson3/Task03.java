package com.company.lesson3;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {

        int a = 0;
        Random rand = new Random();
        int[] arr = new int[15];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = rand.nextInt(99);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                a++;

            }

        }
        System.out.println(a + " четных элементов в массиве");


    }
}
