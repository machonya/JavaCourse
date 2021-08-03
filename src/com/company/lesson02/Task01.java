package com.company.lesson02;

public class Task01 {
    public static void main(String[] args) {
        float total, today;
        total = today = 10.0f;
        for (int day = 2; day <=7; day++) {
            today *= 1.1;
            total += today;

            if (day == 7) {
                System.out.println(total);
            }
        }

    }
}
