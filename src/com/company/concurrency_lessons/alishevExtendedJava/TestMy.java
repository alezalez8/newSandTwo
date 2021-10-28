package com.company.concurrency_lessons.alishevExtendedJava;

public class TestMy {
    public static void main(String[] args) {

        MyThreadClass myThreadClass = new MyThreadClass();
        myThreadClass.start();

        Thread myThreadClassTwo = new Thread(new ExRun());
        myThreadClassTwo.start();

    }
}

class MyThreadClass extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread_one " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ExRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread_two " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

