package com.company.Lesson01;

public class Task08 {
    public static void main(String[] args) {
        int a = 13;
        int b = 15;
        a = b - a;
        b = b - a;
        a = a + b;

        System.out.println("a = "+a+", b = "+b+" - поменялись местами");
    }
}
