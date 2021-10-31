package com.company.concurrency_lessons.alishevExtendedJava;

import com.company.concurrency_lessons.vasko.ColorScheme;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) {



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

    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }
    public void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(ColorScheme.GREEN+"ConnectionsCount is " + connectionsCount);
        }
        Thread.sleep(5000);
        synchronized (this) {
            connectionsCount--;
        }
    }
}
