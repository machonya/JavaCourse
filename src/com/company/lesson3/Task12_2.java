package com.company.lesson3;

import java.util.Random;

public class Task12_2 {
    public static void main(String[] args) {
        int num = 0;
        int c = 0;
        double a;
        Random rand = new Random(10);
        int [] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array [i] = rand.nextInt(15);
            if (array[i]%2 != 0) {
                c += array[i];
                num++;
            }

        }
        a = c/=num;
        System.out.println(a+" - среднее арифметическое нечетных элементов.");
    }
}
