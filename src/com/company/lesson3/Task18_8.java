package com.company.lesson3;

import java.util.Random;

public class Task18_8 {
    public static void main(String[] args) {
        int max = 0;
        int secondMax = 0;
        int secondMaxIndex = 0;

        Random random = new Random();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            }
            if (secondMax < arr[i] && max != arr[i]) {
                secondMax = arr[i];
                secondMaxIndex = i;
            }

        }
        System.out.println(secondMaxIndex+" - second largest array element");

    }
}
