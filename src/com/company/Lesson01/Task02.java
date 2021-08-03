package com.company.Lesson01;

public class Task02 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 7;
        if (c < a + b && a < b + c && b < a + c) {
            System.out.println("треугольник 1 существует");
        } else {
            System.out.println(" Треугольника не существует");
        }

    }
}
