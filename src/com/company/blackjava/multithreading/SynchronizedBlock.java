package com.company.blackjava.multithreading;

public class SynchronizedBlock {

    public static void main(String[] args) {


        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter2 {
    volatile static int count = 0;
}

class MyRunnableImpl2 implements Runnable {
    public void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
/*
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
*/
            System.out.println(Counter2.count);
        }
    }

    private void doWork2() {
        System.out.println("Yra!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}