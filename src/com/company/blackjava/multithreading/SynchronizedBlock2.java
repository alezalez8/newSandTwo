package com.company.blackjava.multithreading;

public class SynchronizedBlock2 {
    volatile static int counter = 0;

    public static void increment() {
        synchronized (SynchronizedBlock2.class) {
            counter++;
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new R2());
        Thread thread2 = new Thread(new R2());
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

class R2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            SynchronizedBlock2.increment();
        }
    }
}

