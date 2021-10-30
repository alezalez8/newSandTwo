package com.company.concurrency_lessons.alishevExtendedJava;

import com.company.concurrency_lessons.vasko.ColorScheme;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static com.company.concurrency_lessons.vasko.ColorScheme.*;

public class PatternProducerVar1 {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    private static volatile boolean isWork = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread11 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    concumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread22 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    concumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        //thread11.start();
       // thread22.start();

        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("q")) {
          stopWorking();
          //thread1.interrupt();
          //thread2.interrupt();
        }

        thread1.join();
        thread2.join();
        thread11.join();
        //thread22.join();
    }

    private static void producer() throws InterruptedException {
        Random random = new Random();
        int rand = 0;

        while (isWork) {
            rand = random.nextInt(100);
            queue.put(rand);
            System.out.println(RED + "Random number is " + rand);
        }
    }

    private static void concumer() throws InterruptedException {
        int x = 0;
        Random random = new Random();
        while (isWork) {
            Thread.sleep(100);
            if (random.nextInt(10) == 5) {
                x = queue.take();
                System.out.println(YELLOW + x);
                System.out.println(BLUE + "Queue size is " + queue.size());

            }
        }
    }

    private static void stopWorking() {
        PatternProducerVar1.isWork = false;
    }

}
