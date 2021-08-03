package com.company.Lesson01;

public class Task05 {
    public static void main(String[] args) {
        int a = 2;
        int b = -4;
        int c = -1;
        int e = 0;
        int j = 0;
        if (a > 0) {
            ++e;
        } else if (a < 0) {
            ++j;
        }

        if (b > 0) {
            ++e;
        } else if (b < 0) {
            ++j;
        }

        if (c > 0) {
            ++e;
        } else if (c < 0) {
            ++j;
        }

        System.out.println("Положительных чисел " + e + ", отрицательных чисел " + j);


    }
}
