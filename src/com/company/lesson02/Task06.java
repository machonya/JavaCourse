package com.company.lesson02;

public class Task06 {
    public static void main(String[] args) {
        int a = 0;
        while (a <= 100) {
            a++;
            if (a % 2 == 1)
                continue;
            System.out.println(a);

        }
    }
}
