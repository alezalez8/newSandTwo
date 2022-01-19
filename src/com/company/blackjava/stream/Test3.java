package com.company.blackjava.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};

        Arrays.stream(array).forEach(Utils::myMethod);

        System.out.println("---------------------------------");
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(8);
        list.add(5);
        list.add(12);
        list.add(18);

        //System.out.println(list);
       // System.out.println(list.stream().reduce((k, v) -> k * v).get());

        int result = list.stream().reduce(1, (accum, element) ->
                accum * element);
        System.out.println("Result is " + result);

        List<String> list2 = new ArrayList<>();
        list2.add("priver");
        list2.add("kak dela");
        list2.add("normalno");
        list2.add("poka");


        String result3 = list2.stream().reduce((a,e) ->
                a + " " +e ).get();
        System.out.println(result3);

    }
}

class Utils{
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);

    }
}
