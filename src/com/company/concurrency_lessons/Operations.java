package com.company.concurrency_lessons;

import javax.naming.InsufficientResourcesException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Operations {
    public static void main(String[] args) throws InsufficientResourcesException, InterruptedException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);
        Thread curThread = Thread.currentThread();
        curThread.setName("Основной поток");

        new Thread(() -> {
            try {
                System.out.println("Запущен дополнительный поток");
                Thread dopThread = Thread.currentThread();
                curThread.setName("Дополнительный поток");
                transfer(a, b, 500);
                System.out.println("Перевод денег с а на b  " + curThread.getName());
            } catch (InsufficientResourcesException | InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        System.out.println("Перевод денег с b на a, основной поток");
        transfer(b, a, 300);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Баланс счета А:   " + a.getBalance());
        System.out.println("Баланс счета B:   " + b.getBalance());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Баланс счета А:   " + a.getBalance());
        System.out.println("Баланс счета B:   " + b.getBalance());

    }

    private static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException, InterruptedException {

        if (acc1.getBalance() < amount)
            throw new InsufficientResourcesException();
        System.out.println("Заходим в метод трансфер");
                synchronized (acc1) {
            System.out.println("выполнена синхронизация на первом параметре");
           // Thread.sleep(1000);
            System.out.println("задержка в 1 сек");
            synchronized (acc2) {
                System.out.println("выполнена синхронизация на втором параметре");
                acc1.withdraw(amount);
                acc2.deposit(amount);
            }
        }
    }


}
