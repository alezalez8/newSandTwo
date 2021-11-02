package com.company.concurrency_lessons.alishevExtendedJava.multithreading;

import java.util.Random;

public class InterruptThreadTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1_000_000_000; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread was interrupted");
                    break;
                }
                Random random = new Random();
                Math.sin(random.nextDouble());

            }
        });

        System.out.println("Starting thread");

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        thread.join();
        System.out.println("Thread has finished");
    }
}
