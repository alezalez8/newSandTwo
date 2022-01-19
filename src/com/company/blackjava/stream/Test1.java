package com.company.blackjava.stream;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela?");
        list.add("OK");
        list.add("poka");

        double pi = Math.PI;

        System.out.printf("Pi = %.1f", pi);
        //System.out.printf("Pi = %e", pi);
        System.out.println();

        DecimalFormat fff = new DecimalFormat("#.##");
        System.out.print(fff.format(pi));



        // list.stream().map(str -> String.valueOf(str.length())).forEach(str -> System.out.println(str));

        List<String> mmm = list.stream().map(str -> String.valueOf(str.length())).collect(Collectors.toList());

        // list.stream().map(s -> s.split("")).map(k -> Arrays.asList(k)).forEach(System.out::println);
        //System.out.println("===================================");
        List<List<String>> kkk = list.stream().map(s -> s.split("")).map(k -> Arrays.asList(k)).collect(Collectors.toList());
        // System.out.println(kkk);
        //System.out.println("===================================");
        //System.out.println(mmm);

        int[] array = {5, 9, 3, 8, 1};
        //Arrays.stream(array).forEach(num -> System.out.print(num + "  "));

        Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).forEach(System.out::println);

        System.out.println("-------------------------------------");
         array =  Arrays.stream(array).map(element -> {
             if (element % 3 == 0) {
                 element = element / 3;
             }
             return element;
         }).toArray();

        System.out.println(Arrays.toString(array));
        System.out.println("-------------------------------------");
        Set<String> set = new TreeSet<>();

        set.add("privet");
        set.add("kak dela?");
        set.add("OK");
        set.add("poka");

        System.out.println(set);

        Set<String>  sss = set.stream().map(e -> String.valueOf(e.length())).collect(Collectors.toSet());
        System.out.println(sss);



    }
}
