package com.company.blackjava.multithreading;

public class VolatEx2 {
   // volatile static int vol = 0;

    public static void main(String[] args) {

        Thread tr1 = new Thread(new Runnable() {
            public synchronized void increment() {
                //VolatEx2.vol++;
                Counter1.vol++;
            }

            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    increment();
                }
            }

        });

        Thread tr2 = new Thread(new Runnable() {
            public synchronized void decrement() {
                //VolatEx2.vol--;
                Counter1.vol--;
            }

            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    decrement();

                }
            }

        });

        tr1.start();
        tr2.start();
        try {
            tr1.join();
            tr2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Volume is " + Counter1.vol);


    }

}

class Counter1 {
    volatile static int vol = 0;
}




