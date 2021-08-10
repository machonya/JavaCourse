package com.company.lesson3;

import java.util.Random;

public class Task14_4 {
    public static void main(String[] args) {

        int elementNumber = 0;

        int[] arr = new int[]{3,8,12,2,1,13};
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%2 != 0 && arr[i]< smallest ) {
                smallest = arr[i];
                elementNumber = i;
            }

        }
        System.out.println(elementNumber + " - наименьший нечетный элемент");


    }
}
