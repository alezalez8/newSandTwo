package com.company.blackjava.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new TreeSet<>();
        hashSet1.add(2);
        hashSet1.add(7);
        hashSet1.add(8);
        hashSet1.add(1);
        hashSet1.add(12);

        System.out.println(hashSet1);
        HashSet<Integer> hashSet2= new HashSet<>();
        hashSet2.add(14);
        hashSet2.add(7);
        hashSet2.add(8);
        hashSet2.add(1);
        hashSet2.add(6);

        HashSet<Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);
       // HashSet<Integer> union= new HashSet<>();
        HashSet<Integer> interset = new HashSet<>(hashSet1);
        interset.retainAll(hashSet2);

        HashSet<Integer> substrukt = new HashSet<>(hashSet2);
        substrukt.removeAll(hashSet1);

        System.out.println(union);
        System.out.println(interset);
        System.out.println(substrukt);


    }
}
