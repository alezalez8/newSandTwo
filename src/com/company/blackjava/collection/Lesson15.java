package com.company.blackjava.collection;

import java.util.*;

public class Lesson15 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("b");
        StringBuilder sb3 = new StringBuilder("c");
        StringBuilder sb4 = new StringBuilder("d");
        StringBuilder sb5 = new StringBuilder("f");
        StringBuilder sb6 = new StringBuilder("h");


        StringBuilder[] array = {sb1, sb2, sb3, sb4, sb5, sb6};
        List<StringBuilder> listBuilder = Arrays.asList(array);
        listBuilder.set(1, new StringBuilder("helloy"));

        String[] intArray = {"a","b","c", "d", "e"};
        String str = Arrays.toString(intArray).replaceAll(", |\\[|\\]", "");
        System.out.println("========" + str);

        List<String>  ls = new LinkedList<>();
       /* ls.add("aa");
        ls.add("bb");
        ls.add("cc");
        ls.add("dd");
        ls.add("ee");
        ls.add("ff");*/

        String mm = " madam ";

        for (Character ch: mm.toCharArray()
             ) {
            ls.add(String.valueOf(ch));

        }
        System.out.println(ls);

        ListIterator<String> iterator = ls.listIterator();
        ListIterator<String> reverseiterator = ls.listIterator(ls.size());
        boolean isPolindrom = true;

        while (iterator.hasNext() && reverseiterator.hasPrevious()) {
            if(iterator.next().equals(reverseiterator.previous())){
                isPolindrom = true;
            } else {
                isPolindrom = false;
            }
        }
        System.out.printf("Polindrom is %s ", isPolindrom);


        /*String sfaf = ls.get(3);
        System.out.println("-----------" + sfaf );
        ls.set(3, "helloy");
        StringSelection stringSelection = new StringSelection("sfsfsf");*/



     /*   Iterator<String> iterator = ls.iterator();
        System.out.println(ls);



        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
            iterator.remove();
        }
        System.out.println(ls);*/


      /*  List<Integer> list2 = List.of(3, 4, 8, 2, 1);
        List<Integer> list3 = Arrays.asList(3, 4, 8, 2, 1);

        List<StringBuilder> list4 = List.copyOf(Arrays.asList(array));
       // List<StringBuilder> list5 = List.copyOf(List.of(array));
        System.out.println("List 4 is:  " + list4);

        System.out.println(list2);
        System.out.println(list3);

        //list2.set(1, 12);
        System.out.println(list2);
        System.out.println(list3);

        // List<StringBuilder> list = Arrays.asList(array);
        // System.out.println(list);
        //array[0].append("!!!");
        // array[0] = sb5;
        // System.out.println(list);
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        intArray.add(6);


        Integer[] inar = intArray.toArray(new Integer[8]);
        for (Integer i : inar
        ) {
            System.out.printf("   %d", i);

        }*/


    }
}
