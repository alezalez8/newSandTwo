package com.company.concurrency_lessons.vasko;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static com.company.concurrency_lessons.vasko.ColorScheme.GREEN;
import static com.company.concurrency_lessons.vasko.ColorScheme.RED;

public class ProducerConsumer {

    private static BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();


    }

    public static class Producer implements Runnable {
        String[] messages = {
                "helloy1",
                "helloy2",
                "helloy3",
                "helloy4",
                "helloy5",
                "helloy6",
                "helloy7",
                "helloy8",
                "helloy9",
                "hi",
                "DONE"
        };

        @Override
        public void run() {
            try {
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void produce() throws InterruptedException {
            Random r = new Random();
            for (int i = 0; i < messages.length; i++) {
                queue.put(messages[i]);
                System.out.println(GREEN + "Producing " + messages[i] + ". Queue size is " + queue.size());
                Thread.sleep(r.nextInt(1000));

            }
        }

    }

    public static class Consumer implements Runnable {
        @Override
        public void run() {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        private void consume() throws InterruptedException {
            Random r = new Random();
            while (true) {
                String message = queue.take();
                System.out.println(RED + "Consuming " + message + " Queue size is " + queue.size());
                if (!"DONE".equals(message)) {
                    Thread.sleep(r.nextInt(3000));
                } else {
                    return;
                }
            }
        }
    }

}

