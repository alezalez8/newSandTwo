package com.company.concurrency_lessons.alishevExtendedJava.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {

        new Worker().main();
    }
}

class Worker {
    Object o1 = new Object();
    Object o2 = new Object();
    Random random = new Random();
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();


    public void addToList1() {
        synchronized (o1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addToList2() {
        synchronized (o2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));

        }
    }

    public void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main() throws InterruptedException {
        long before = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");
        System.out.println("List 1: " + list1.size());
        System.out.println("List 2: " + list1.size());


    }
}