package com.company.blackjava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolEx1 {
    public static volatile int k = 0;
    public static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100(lock));


        }
        System.out.println("Main ends");
        //Thread.sleep(3000);
        executorService.shutdown();
        executorService.awaitTermination(6, TimeUnit.SECONDS);

        System.out.println(k);

    }
}

class RunnableImp100 implements Runnable {

    private final Lock lock;

    public RunnableImp100(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
          synchronized (lock) {
        try {

            ThreadPoolEx1.k++;
            ThreadPoolEx1.k++;
            Thread.sleep(500);
            ThreadPoolEx1.k--;
            System.out.println("k = " +ThreadPoolEx1.k);

        } catch (InterruptedException e) {
            e.printStackTrace();
             }
        }
    }
}

