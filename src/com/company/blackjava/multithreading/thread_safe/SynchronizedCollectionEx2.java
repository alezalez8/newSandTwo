package com.company.blackjava.multithreading.thread_safe;

import java.util.ArrayList;
import java.util.Iterator;

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }

        Runnable runnable = () -> {
            Iterator<Integer> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            };


        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
