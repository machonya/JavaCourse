package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Array2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива n*m:");
        Random rand = new Random();
        int n = 0, m = 0;

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] mass = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = rand.nextInt(50);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int result = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i][i] %2 ==0){
                result += mass[i][i];
            }
        }
        System.out.println("Сумма четных элементов главной диагонали "+result);

    }

}
