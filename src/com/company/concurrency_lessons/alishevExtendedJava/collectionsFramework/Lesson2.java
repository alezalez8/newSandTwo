package com.company.concurrency_lessons.alishevExtendedJava.collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        arrayList.remove(10);
        System.out.println(arrayList);
        System.out.println(arrayList.get(10));

        arrayList = new LinkedList<>();
        System.out.println(arrayList);


    }
}
