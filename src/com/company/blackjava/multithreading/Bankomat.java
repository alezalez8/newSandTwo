package com.company.blackjava.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Aleks", lock);
        new Employee("Oleg", lock);
        new Employee("Lena", lock);
        Thread.sleep(5000);
        new Employee("Sveta", lock);
        new Employee("Gena", lock);


    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                // System.out.println(name + " ждет");

                // lock.lock();
                System.out.println(name + " пользуется банкоматом");

                Thread.sleep(2000);
                System.out.println(name + " завершил работу с банкоматом");


            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + " не хочет ждать очереди");
        }
    }
}
