package com.company.concurrency_lessons.alishevExtendedJava;

import com.company.concurrency_lessons.vasko.ColorScheme;
import sun.misc.Timer;

import java.sql.Time;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.company.concurrency_lessons.vasko.ColorScheme.*;

public class ReentrantLockTest {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondThread();
            }
        });


        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long end = System.currentTimeMillis();
        System.out.println(CYAN + "Time running is " + (end - start));

        task.showCounter();


    }
}

class Task {
    private int counter;
    private Lock lock = new ReentrantLock();
    private int cont = 1;

    private void increment() {
        for (int i = 0; i < 1000000; i++) {
            counter++;
            if ((counter % 100000) == 0) {
                System.out.println(GREEN + "Amount of count is " + cont);
                cont++;

            }

        }
    }

    public void firstThread() {
        lock.lock();
        increment();
        // if ((counter % 1000) == 0) System.out.println(GREEN + "1 thread");
        lock.unlock();
    }

    public void secondThread() {
        lock.lock();
        increment();
        //   if ((counter % 1000) == 0) System.out.println(BLUE + "2 thread");
        lock.unlock();
    }

    public void showCounter() {
        System.out.println("Counter = " + counter);
    }
}