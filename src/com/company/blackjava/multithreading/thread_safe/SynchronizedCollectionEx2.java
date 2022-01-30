package com.company.blackjava.multithreading.thread_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList =  new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(arrayList);
        //Thread.sleep(1000);

        Runnable runnable = () -> {
            synchronized (synchList){
            Iterator<Integer> iterator = synchList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }}
            };

        Runnable runnable1 = () -> {
            synchList.remove(10);
        };


        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(synchList);
        System.out.println("size = " + synchList.size());
        System.out.println(arrayList.equals(synchList));
    }
}
