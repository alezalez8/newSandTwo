package com.company.concurrency_lessons.alishevExtendedJava.multithreading;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static com.company.concurrency_lessons.vasko.ColorScheme.*;

public class PatternProducerVar1 {
    //    public static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    private static volatile boolean isWork = true;

    public static void main(String[] args) throws InterruptedException {
        WaitNotif wn = new WaitNotif();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread11 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.concumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread22 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.concumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        System.out.println(CYAN + " START SCANNER");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("q")) {
            System.out.println(CYAN + " ENTER TO SCANNER");
            thread1.interrupt();
            thread2.interrupt();
            stopWorking(wn);
        }

        thread1.join();
        thread2.join();

    }


    private static void stopWorking(WaitNotif wn) {
        System.out.println(CYAN + "STOP EXECUTE -----------------------------------------------------");
        wn.disable();
    }

}

class WaitNotif {
    private final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    private boolean isWork = true;

    public boolean isWork() {
        return isWork;
    }

    public void disable() {
        isWork = false;
    }

    public void producer() throws InterruptedException {
        Random random = new Random();
        int rand = 0;
        while (isWork()) {
            rand = random.nextInt(100);
            queue.put(rand);
            System.out.println(RED + "Random number is " + rand);
            /*if(!isWork()) {
                Thread.currentThread().interrupt();
            }*/
        }
    }

    public void concumer() throws InterruptedException {
        int x = 0;
        Random random = new Random();
        while (isWork()) {
            Thread.sleep(40);
            if (random.nextInt(10) == 5) {
                x = queue.take();
                System.out.println(YELLOW + x);
                System.out.println(BLUE + "Queue size is " + queue.size());
                /*if(!isWork()) {
                    Thread.currentThread().interrupt();
                }*/

            }
        }
    }
}

