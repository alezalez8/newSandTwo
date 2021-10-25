package com.company.concurrency_lessons;

import javax.naming.InsufficientResourcesException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Transfer implements Callable<Boolean> {
    private final Account accountFrom;
    private final Account accountTo;
    private final int amount;
    private Lock lock = new ReentrantLock();

    public Transfer(Account accountFrom, Account accountTo, int amount) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    public Boolean call() throws InterruptedException, InsufficientResourcesException {
        int rr = new Random().nextInt( 5);

        long randomDelay = 100 + (long) Math.random() * 1200;
        if (lock.tryLock(randomDelay, TimeUnit.MILLISECONDS)) {
            try {
                if (accountFrom.getBalance() < amount)
                    throw new InsufficientResourcesException();
            } finally {
            }

        } else {
            accountFrom.incFailedTransferCount();
            return false;
        }
        return true;
    }


}

