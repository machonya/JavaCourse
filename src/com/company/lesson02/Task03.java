package com.company.lesson02;

public class Task03 {
    public static void main(String[] args) {
        int a = 1;
        int  b = 0;
        while (a <= 256) {
            a *= 2;
            b = b + a;
        }
        System.out.println(b);

    }
}
