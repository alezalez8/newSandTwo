package com.company.concurrency_lessons;

import javax.naming.InsufficientResourcesException;
import java.util.concurrent.TimeUnit;

public class OperationsOnve {
    private static final long WAIT_SEC = 1;

    public static void main(String[] args) throws InsufficientResourcesException, InterruptedException {
        final Account a = new Account(1000);
        final Account b = new Account(2000);

        for (int i = 0; i < 3; i++) {

            int finalI = i;
            new Thread(() -> {
                try {
                    // System.out.println("Запущен дополнительный поток");
                    Thread curThread = Thread.currentThread();
                    curThread.setName("дополнительный поток # " + finalI);
                    System.out.println("Запущен " + curThread.getName());
                    System.out.println("Его приоритет равен  " + curThread.getPriority());
                    transfer(a, b, 500);
                    System.out.println("Перевод денег с а на b, дополн поток");
                } catch (InsufficientResourcesException | InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();

            System.out.println("Перевод денег с b на a, основной поток, итерация №" + finalI  );
            transfer(b, a, 300);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Баланс счета А:   " + a.getBalance());
        System.out.println("Баланс счета B:   " + b.getBalance());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
/*
        System.out.println("Баланс счета А:   " + a.getBalance());
        System.out.println("Баланс счета B:   " + b.getBalance());
*/

    }

    private static void transfer(Account acc1, Account acc2, int amount) throws InsufficientResourcesException, InterruptedException {

        if (acc1.getBalance() < amount)
            throw new InsufficientResourcesException();
        System.out.println("Заходим в метод трансфер");

        if (acc1.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)) {
            try {
                if (acc2.getLock().tryLock(WAIT_SEC, TimeUnit.SECONDS)) {
                    try {
                        acc1.withdraw(amount);
                        acc2.deposit(amount);
                    } finally {
                    }
                } else {
                    System.out.println("Транзакция 2:  " + acc1.getFailCounter());
                }
            } finally {
                acc1.getLock().unlock();
            }
        } else {
            System.out.println("Транзакция 1:  " + acc1.getFailCounter());
            System.out.println("Ошибка времени доступа");
        }
    }

}

