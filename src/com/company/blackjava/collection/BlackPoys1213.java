package com.company.blackjava.collection;

import java.util.ArrayList;
import java.util.List;

public class BlackPoys1213 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("fff");
        list.add("hhh");
        System.out.println(list);
       // String rem = list.remove(1);
        //boolean bbb = list.remove("fff");
       String rem = list.set(4, "sfsfsfsf");
        System.out.println(rem);
        System.out.println(list);


        List<String> list2 = new ArrayList<>(list);

        List<Number> listNumber = new ArrayList<>();
         //List<Number> listNumber1 =  ArrayList<? super Number>();

        ArrayList<? super Number> numbers;
        numbers = new ArrayList <Object>();
        //numbers = new ArrayList<Double>();

        List sss = new ArrayList<Number>();

       // ArrayList<Number> sss1 = new ArrayList<? extends Number>();

        sss = new ArrayList<Number>();




       /* Set<Character> set = new HashSet<>();
        for (char ch = 'а'; ch <= 'я'; ch++) {
            set.add(ch);
            set.remove(ch - 1);
        }
        System.out.println(set.size());*/
    }

    public void add(List<? super Number> list) {
        //list.add(1D); // можно
       // list.add(new Object()); // нельзя

        Object j = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };
    }
}
