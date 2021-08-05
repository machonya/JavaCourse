package com.company.lesson3;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {

        int maxNum = -1;
        int maxIndex = 0;
        Random rand = new Random();
        int[] mas = new int[12];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(15) -15;
            if (maxNum <= mas[i]) {
                maxNum = mas[i];
                maxIndex = i;


            }

        }
        System.out.println(maxIndex+ " - индекс максимального значения в массиве");



    }
}
