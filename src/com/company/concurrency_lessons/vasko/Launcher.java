package com.company.concurrency_lessons.vasko;

import static com.company.concurrency_lessons.vasko.ColorScheme.RED;

public class Launcher {
    private static final  int POOL_SIZE = 2;

    public static void main(String[] args) {
        System.out.println(RED + "Starting main thread");
        GCDRunnable r = new GCDRunnable();

        System.out.println(RED + "Leaving the main thread");

    }
}
