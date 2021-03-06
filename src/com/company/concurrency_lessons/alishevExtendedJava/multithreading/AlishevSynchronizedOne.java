package com.company.concurrency_lessons.alishevExtendedJava.multithreading;

public class AlishevSynchronizedOne {
    private int counter;
    //private AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        AlishevSynchronizedOne test = new AlishevSynchronizedOne();
        test.doWork();
    }

    public void increment() {
        synchronized (this) {
            counter++;
        }
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                // counter += 1;
                increment();
                //count.incrementAndGet();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    //  counter += 1;
                    increment();
                    // count.incrementAndGet();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
       // System.out.println(count);
    }
}
