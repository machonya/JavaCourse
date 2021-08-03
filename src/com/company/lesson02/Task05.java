package com.company.lesson02;

import java.text.DecimalFormat;

public class Task05 {
    public static void main(String[] args) {
        double a = 2.54;
        double res = a;
        DecimalFormat df = new DecimalFormat("#0.00");
        for (int b = 1; b <= 20; b++) {
            System.out.println(b+" inch = "+df.format(res));
            res += a;

        }


    }
}
