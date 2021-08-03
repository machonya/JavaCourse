package com.company.Lesson01;

public class Task01 {
    public static void main(String[] args) {
        int a = 24;
        if (a >= 10 && a < 100) {
            System.out.print(a + " положительное двузначное");
        } else if (a <= -10 && a > -100) {
            System.out.println(a + " отрицательное двузначное");
        } else if (a > 0 && a < 10) {
            System.out.println(a + " однозначное положительное");
        } else if (a < 0 && a > -10) {
            System.out.println(a + " однозначное отрицательное");
        } else {
            System.out.println("Перебор");
        }

    }
}
