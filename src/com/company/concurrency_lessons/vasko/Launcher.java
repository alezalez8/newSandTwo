package com.company.concurrency_lessons.vasko;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import static com.company.concurrency_lessons.vasko.ColorScheme.RED;

public class Launcher {
    private static final int POOL_SIZE = 2;

    public static void main(String[] args) throws InterruptedException {
        //boolean isDaemon = false;
        boolean isDaemon = true;
        System.out.println(RED + "Starting main thread");
        GCDRunnable r = new GCDRunnable(isDaemon);
//        runInOneThread(r, isDaemon);
        runWithExecutors(r, isDaemon);
        Thread.sleep(100);


        System.out.println(RED + "Leaving the main thread");

    }

    private static void runInOneThread(GCDRunnable r, boolean isDaemon) {
        Thread th = new Thread(r);
        if (isDaemon) {
            th.setDaemon(true);
        }
        //th.setDaemon(isDaemon);
        th.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th.interrupt();

    }

    private static void runWithExecutors(GCDRunnable r, boolean isDaemon) throws InterruptedException {

        ThreadFactory factory = r1 -> {
            Thread thread = new Thread(r);
            if (isDaemon) {
                thread.setDaemon(true);
            }
            return thread;

        };


        ExecutorService executorService = Executors.newFixedThreadPool(POOL_SIZE, factory);
        for (int i = 0; i < 5; i++) {
            executorService.execute(r);
        }
        executorService.shutdown();

        //executorService.awaitTermination(30, TimeUnit.SECONDS);

    }


}
