package com.company.concurrency_lessons.vasko;

import static com.company.concurrency_lessons.vasko.ColorScheme.RED;

public class Launcher {
    private static final int POOL_SIZE = 2;

    public static void main(String[] args) throws InterruptedException {
        //boolean isDaemon = false;
        boolean isDaemon = true;
        System.out.println(RED + "Starting main thread");
        GCDRunnable r = new GCDRunnable(isDaemon);
        runInOneThread(r, isDaemon);
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

}
