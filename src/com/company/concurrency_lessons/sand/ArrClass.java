package com.company.concurrency_lessons.sand;

import java.util.ArrayList;
import java.util.List;

public class ArrClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.removeAll(list.subList(2, 5));
        list.subList(0, 2).clear();
        System.out.println(list); //[1, 2, 6, 7, 8]
        Integer[] sss = new Integer[4];
        System.out.println(list.toArray());
    }
}

