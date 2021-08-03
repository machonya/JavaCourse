package com.company.lesson02;

public class Task07 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a <= 99) {
            a++;
            if (a % 2 == 0)
                continue;
            b = b + a;
            if (a == 99)
                System.out.println(b);




        }
    }
}
