package com.company.concurrency_lessons.alishevExtendedJava.multithreading;

import com.company.concurrency_lessons.vasko.ColorScheme;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.company.concurrency_lessons.vasko.ColorScheme.*;

class TestJoinMethod1 extends Thread {
    //private static int count = 1;
    volatile int lastNumber;
    Lock lock = new ReentrantLock();


    public void run() {
        lock.lock();

            String nameThread = Thread.currentThread().getName();
            char last = nameThread.charAt(nameThread.length() - 1);
            lastNumber = Character.getNumericValue(last);
            System.out.println("==== Last number is " + last);

            switch (lastNumber) {
                case 0:
                    System.out.println(CYAN);
                    break;
                case 1:
                    System.out.println(BLUE);
                    break;
                case 2:
                    System.out.println(RED);
                    break;

            }

            // count++;
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(200);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println(i);
            }
         lock.unlock();
    }


    public static void main(String[] args) {

        TestJoinMethod1 t1 = new TestJoinMethod1();
        // System.out.println("init 1  " + t1.getCount());
        TestJoinMethod1 t2 = new TestJoinMethod1();
        // System.out.println("init 2  " + t1.getCount());
        TestJoinMethod1 t3 = new TestJoinMethod1();
        // System.out.println("init 3  " + t1.getCount());

        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }


}