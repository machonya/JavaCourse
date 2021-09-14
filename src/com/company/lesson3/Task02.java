package com.company.lesson3;

public class Task02 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0)
                a++;

        }
        int[] array = new int[a];
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }

        }
        System.out.println(" ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }


    }


}

