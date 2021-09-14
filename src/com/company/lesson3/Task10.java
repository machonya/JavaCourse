package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n;

        int c = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = scanner.nextInt();


        if (n <= 3) {
            System.out.println("Enter a number greater than 3");

        }
        if (n > 3) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(n);
                System.out.print(arr[i] + " ");
                if (arr[i]%2 == 0) {
                    c++;
                }

            }
            System.out.println(" ");
            int[] arr2 = new int[c];
            for (int i = 0; i < arr.length; i++) {
                int a = 0;
                if (arr[i]%2 == 0) {
                    arr2[a] = arr[i];

                    System.out.print(arr2[a]+" ");
                    a++;

                }
            }


        }


    }
}
