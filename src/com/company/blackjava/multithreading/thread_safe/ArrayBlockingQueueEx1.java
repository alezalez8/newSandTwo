package com.company.blackjava.multithreading.thread_safe;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> integers = new ArrayBlockingQueue<>(4);
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.offer(5);
        System.out.println(integers);
    }

}
