package com.company.concurrency_lessons.alishevExtendedJava.multithreading;

import com.company.concurrency_lessons.vasko.ColorScheme;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
        System.out.println(connection.getCon());

        // Semaphore semaphore = new Semaphore(3);
        /*try {
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println("All permits have been acquired");
            semaphore.release();
            semaphore.acquire();
            System.out.println("Can't reach here...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //semaphore.release();
        System.out.println(semaphore.availablePermits());*/
    }
}

class Connection {
    private static Connection connection = new Connection();
    private int connectionsCount = 0;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }

    public int getCon() {
        return connectionsCount;
    }

    public void work() throws InterruptedException {
        semaphore.acquire();
        try {
            doWork();
        } finally {
            semaphore.release();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(ColorScheme.GREEN + "ConnectionsCount is " + connectionsCount);
        }
        Thread.sleep(5000);
        synchronized (this) {
            connectionsCount--;
        }
    }
}
