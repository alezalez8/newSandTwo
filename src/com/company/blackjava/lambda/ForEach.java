package com.company.blackjava.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("priver", "kak dela", "normalno", "poka");
        List<Integer> list1 = List.of(2, 4, 7, 1, 9, 2, 5);

        Integer[] arr = new Integer[]{2, 4, 7, 1, 9, 2, 5};
        List<Integer> arin = new ArrayList<>();
        arin = Arrays.asList(arr);
        //Collections.addAll(arin, arr);
        System.out.println(arin);
        arin.forEach(n -> System.out.println(n*2));

        //list1.forEach();

/*
        list.forEach(str -> System.out.println(str.toUpperCase()));
        list.forEach(str -> System.out.println("lenght is " + str.length() + ";  "));
        System.out.println(list);
*/


    }
}
