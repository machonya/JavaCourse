package com.company.lesson02;

public class Task02 {
    public static void main(String[] args) {
        int a = 1;
        for (int time = 0; time <=24; time += 3) {
            a *=2;
            if (time == 3)
                System.out.println("Через "+time+" часa будет "+ a +" амебы");
            if (time >=6 && time <=9)
                System.out.println("Через "+time+" часов будет "+a+" амеб");
            if (time >= 12 && time <=15)
                System.out.println("Через "+time+" часов будет "+a+" амебы");
            if (time >=18 && time<=21)
                System.out.println("Через "+time+" часов будет "+a+" амеб");
            if (time == 24)
                System.out.println("Через "+time+" часа будет "+a+" амеб");
            System.out.println();

        }
    }
}
