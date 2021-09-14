package com.company.lesson3;

public class Task11_1 {
    public static void main(String[] args) {
        double b, c = 1;
        int[] arr = new int[]{2,3,4,5,8,12,65,32,33,30,12,89,3,2,18};
        for (int i = 0; i < arr.length; i++) {
            b = arr[i]%3;
            if (b == 0) {
                c *= arr[i];

        }

        }
        System.out.println(c+" - произведение элементов кратных 3.");

    }
}
