package com.company.lesson02;

public class Task05 {
    public static void main(String[] args) {
        double a = 2.54;
        double c = a;
        for (int b = 1; b <= 20; b++) {
            System.out.print(b+" дюйм равен " +a);
            a+=c;

            System.out.println(a);

        }
    }
}
