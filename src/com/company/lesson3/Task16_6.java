package com.company.lesson3;

import java.util.Random;

public class Task16_6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);

        }
        boolean isTrue = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]) {
                isTrue = false;
                break;

            }

        }
        if (isTrue) {
            System.out.println("All elements in array are different!");
        }else{
            System.out.println("Duplicates found in array!");
        }

    }
}
