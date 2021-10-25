package com.company.concurrency_lessons.vasko;

import static com.company.concurrency_lessons.vasko.ColorScheme.*;

public class ConcurrentMain {
    public static void main(String[] args) {

        SimpleThread th1 = new SimpleThread();
        th1.start();
        System.out.println("Hello from main");
        SimpleThread th2 = new SimpleThread();
        th2.start();

        Thread th3 = new Thread((new SimpleRunner()));
        th3.start();
        System.out.println("break");

    }
}

class SimpleThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(RED + "WARN - " + currentThread().getName() + " was interrupted ");
            }
            System.out.println(GREEN + "INFO - Runnable  " + currentThread().getName() + " - " + i);
        }
    }
}

class SimpleRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(RED + "WARN - " + Thread.currentThread().getName() + " was interrupted ");
            }
            System.out.println(CYAN  + "INFO - " + Thread.currentThread().getName() + " - " + i);
        }

    }
}