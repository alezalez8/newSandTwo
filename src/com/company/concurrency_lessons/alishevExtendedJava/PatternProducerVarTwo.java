package com.company.concurrency_lessons.alishevExtendedJava;

import com.company.concurrency_lessons.vasko.ColorScheme;

import java.util.LinkedList;
import java.util.Queue;

import static com.company.concurrency_lessons.vasko.ColorScheme.*;

public class PatternProducerVarTwo {

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.concume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

/*
        System.out.println(CYAN + " START SCANNER");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equals("q")) {
            System.out.println(CYAN + " ENTER TO SCANNER");
            thread1.interrupt();
            thread2.interrupt();
*/

    }


}


class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 10;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (lock) {
                while ((queue.size() == LIMIT)) {
                    lock.wait();
                }
                queue.offer(value++);
                lock.notify();
            }
        }

    }

    public void concume() throws InterruptedException {
        while (true) {
            synchronized (lock){
                while (queue.size() == 0 ){
                    lock.wait();
                }
                int value = queue.poll();
                System.out.println(GREEN + value);
                System.out.println("Queue size is " + queue.size() );
                lock.notify();
            }
            Thread.sleep(1000);
        }

    }
}

