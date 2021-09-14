package com.company.cosmodrome;

public class Timer implements java.lang.Runnable {

        @Override
        public void run () {
            this.runTimer();

        }
        public void runTimer () {
            int i = 5;
            System.out.println(i + " секунд до старта");
            while (i > -1) {
                System.out.println(i);
                try {
                    i--;
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {

                }
            }
        }
    }
