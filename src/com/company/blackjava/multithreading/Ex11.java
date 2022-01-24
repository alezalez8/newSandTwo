package com.company.blackjava.multithreading;

public class Ex11 {
    volatile static int counter = 0;

    public static synchronized void icrement() {
        counter++;
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter);

    }
}

class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex11.icrement();
        }
    }
}