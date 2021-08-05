package com.company.lesson3;

public class Task01 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        for (int i = 2; i <=20; i++) {
            if (a%2 == 0) {
                a++;
            }
            int[] arr = new int[a];
            for (i = 2; i <= 20; i++) {
                if (i%2 == 0){
                    arr[b] = i;
                    System.out.print(arr[b]+ " ");
                }
            }
        }


    }
}
