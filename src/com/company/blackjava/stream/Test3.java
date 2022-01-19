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

        System.out.println(list);
        System.out.println(list.stream().reduce((k, v) -> k * v).get());

    }
}

class Utils{
    public static void myMethod(int a) {
        a = a + 5;
        System.out.println("Element = " + a);

    }
}
