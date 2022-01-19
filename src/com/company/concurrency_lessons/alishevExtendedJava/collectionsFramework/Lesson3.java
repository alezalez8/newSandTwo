package com.company.concurrency_lessons.alishevExtendedJava.collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson3 {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList);
        measureTime(arrayList);
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Size of link is " + linkedList.size());
        System.out.println("Size of array is " + arrayList.size());
        System.out.println(Runtime.getRuntime().totalMemory());


    }

    private static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }

       /* for (int i = 0; i < 100000; i++) {
            list.get(i);
        }*/

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
