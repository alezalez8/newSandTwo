package com.company.blackjava.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Aleks");
        set.add("Gena");
        set.add("Yura");
        set.add("Artem");
        set.add("Oleg");
       // set.add(null);
        set.remove("Oleg");
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Gena"));




        System.out.println(set);

        for (String s: set
             ) {
            System.out.println(s);
        }
        }
    }
