package com.company.lesson3;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        boolean isTrue = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isTrue = false;
                break;
            }

        }
        if (isTrue) {
            System.out.println("Строго возрастающая последовательность");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
