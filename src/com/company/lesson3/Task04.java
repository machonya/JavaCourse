package com.company.lesson3;

import java.util.IllegalFormatCodePointException;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

        int num = 0;
        Random random = new Random();

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;

            }
            System.out.print(array[i] + " ");
        }


//    }
//    public Task04 find(int key) {
//        int hashValue = hashFunc(key)
//                while (hashArrey[hashValue] != null) {
//                    if (hashArrey[hashValue].getKey == key)
//                        return hashArrey[hashValue];
//                    hashValue++;
//                    hashValue %= arreySize;
//                    }
//                    return null;
                }

    }






