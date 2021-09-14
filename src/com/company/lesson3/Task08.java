package com.company.lesson3;

import java.text.DecimalFormat;
import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
       int a = 0;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        float[] arr3 = new float[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = random.nextInt(9);
            arr2[i] = random.nextInt(9);
            arr3[i] = (float) arr1[i] / arr2[i];

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" |" + " ");

        }
        System.out.println(" ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(+arr2[i]+" |" + " ");

        }
        System.out.println(" ");

        for (float i : arr3) {
            System.out.print(df.format(i)+"|" + " ");
        }
        System.out.println(" ");
        for (float i : arr3) {
            if (i %2 ==0) {
                a++;
                System.out.println(a+" целых элементов в массиве arr3");
            }
        }

    }



}
