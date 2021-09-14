package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        int left = 0;
        int right = 0;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the element number of the array:");


        int num = scanner.nextInt();
        if (num <= 0) {
            System.out.println(" incorrect value");
            return;
        }


        int[] arr = new int[num];


        for (int i = 0; i<arr.length ; i++) {
            arr[i] = rand.nextInt(15);
            System.out.print(arr[i]+" ");
        }

        System.out.println(" ");
        for (int i = 0; i < num/2 ; i++) {
            left += arr[i];


        }
        System.out.print(left+" - сумма левой половины массива");

        for (int i = num -1; i > num/2 -1; i--) {
            right += arr[i];

        }
        System.out.print("\n"+right+" - сумма правой половины массива");
        System.out.println(" ");

        if (left > right) {
            System.out.println("Сумма левой половины массива больше суммы правой");
        }else if (right > left) {
            System.out.println("Сумма правой половины массива больше суммы левой");
        }else {
            System.out.println("Суммы половин двух массивов равны");
        }



    }


}
