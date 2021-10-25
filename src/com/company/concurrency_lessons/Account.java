package com.company.concurrency_lessons;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    //private static int id = 0;
    final private int initialValue = 0;
    private Lock lock;
    private AtomicInteger failCounter = new AtomicInteger(initialValue);


    public void incFailedTransferCount() {
        failCounter.incrementAndGet();
    }



    public Lock getLock() {
        return lock;
    }

    public Account(int balance) {
        this.balance = balance;
        lock = new ReentrantLock();
        // id++;
    }

    public void withdraw(int amount) {
        System.out.println("____________________________________________");
        System.out.println("Снятие денег.");
        System.out.println("Баланс до операции:    " + balance);
        balance -= amount;
        System.out.println("Баланс после операции:    " + balance);
        System.out.println("____________________________________________");


    }

    public void deposit(int amount) {
        System.out.println("____________________________________________");
        System.out.println("Пополнение счета");
        System.out.println("Баланс до операции:    " + balance);
        balance += amount;
        System.out.println("Баланс после операции:    " + balance);
        System.out.println("____________________________________________");

    }


    public int getBalance() {
        return balance;
    }

    public AtomicInteger getFailCounter() {
        return failCounter;
    }
}
