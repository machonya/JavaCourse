package com.company.lesson6;

import com.company.adaptation.personForAdaptation.Person;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;




public class Tasks123 {
    public static void main(String[] args) {
        String s = "Я крутой програмист, ";

        //Task1
        String str1 = new String("Hello javaHot superBase");
        System.out.println(str1.substring(str1.indexOf("a"), str1.lastIndexOf("r")));

        //Task2
        System.out.println(s.replace(s.charAt(3), s.charAt(0)));

        //concat()
        s = s.concat("но не очень крутой");
        System.out.println(s);

        //charAt()
        Person person = new Person("Misha", 150, 130, 37.0, 20);
        System.out.println(person.name.charAt(1));

        //revers
        StringBuilder st = new StringBuilder("hello world");
        System.out.println(st.reverse());

        //valueOf()
        float f = 34.34f;
        boolean b = true;
        String s2 = new String("Hello Java");
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(s2));

        //compare()
        System.out.println(s.compareTo(str1));

        //рекурсия
        System.out.println(reverseString(s2));

    }
    //рекурсия
    public static String reverseString(String str){
        if (str.length() == 0)
            return "";
        return str.substring(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}

