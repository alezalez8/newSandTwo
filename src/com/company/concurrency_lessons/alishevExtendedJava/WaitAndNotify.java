package com.company.concurrency_lessons.alishevExtendedJava;

import java.util.Scanner;

public class WaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        WandN wandN = new WandN();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wandN.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wandN.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}

class WandN {
    public void producer() throws InterruptedException {
        synchronized (this) {
            System.out.println("Begin of work of producer");
            //this.wait();
            System.out.println("End of work of producer");
        }

    }

    public void consumer() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("Begin of work consumer");
            System.out.println("Press enter key");
            scanner.nextLine();
           // notify();
            //Thread.sleep(2000);
            System.out.println("Exit of method of consumer");
        }

    }
}