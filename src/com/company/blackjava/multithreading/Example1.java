package com.company.blackjava.multithreading;

public class Example1 {
    public static void main(String[] args) {

        Thread myThread1 = new MyThread1();
        Thread myThread2 = new MyThread1();
        Thread myThread21 = new MyThread1();
        Thread myThread3 = new MyThread2();
        Thread myThread4 = new MyThread2();

        new Thread(() -> {
            System.out.println(" ------------------------------- ");
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }

        }).start();

        Thread myThread31 = new Thread(new MyThread3());

        Thread lamThread = new Thread(() -> {

            System.out.println(" ------------------------------- ");
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        });

        Thread lamThread1 = new Thread(() -> {

            System.out.println(" ------------------------------- ");
            for (int i = 1000; i > 0; i--) {
                System.out.println(i);
            }
        });

        lamThread.start();
        lamThread1.start();





       /* myThread1.start();
        myThread2.start();
        myThread21.start();
        myThread31.start();*/
        // myThread3.start();
        //  myThread4.start();


    }
}

class MyThread1 extends Thread {

    public void run() {
        Thread g = currentThread();
        System.out.println(getName() + " ------------------------------- " + g.getState());
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread2 extends Thread {

    public void run() {
        Thread g = currentThread();
        g.setName("Potok 2  ------------");
        System.out.println(getName() + g.getState());
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
        try {
            sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        System.out.println("--------- Runn ------------------");
    }
    /*public void run() {
        System.out.println("--------- Runn ------------------");
    }*/
}

