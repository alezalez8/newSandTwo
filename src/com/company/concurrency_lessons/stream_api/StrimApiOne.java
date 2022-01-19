package com.company.concurrency_lessons.stream_api;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StrimApiOne {
    // @SuppressWarnings("all")
    public static void main(String[] args) {

        int[] m1 = {0, 5, 2, 4, 7, 1, 3, 19};
        List<Integer> list = new ArrayList<>();
        myModifyList();


        // myTaskOne();
        // int[] array = {1, 4, 6, 3, 8};
        // System.out.println(arrToStr(array));
        // System.out.println(arrToStr1(array));
        // arrToStr1(array);
        // odd(m1);
        //  System.out.println();

        // int num1 = 3;
        // double num2 = 4.5;
        // String text = "wwww";
        // System.out.println(concat(num1, num2, text));

    }

    public static void myModifyList() {
        // List<Integer> list = new ArrayList<>();
        Random r = new Random();
        int[] array = new int[10];
        System.out.println("Amount of elements is:  " + Arrays.stream(array).map(s -> (int) (Math.random() * 100))
                .skip(2)
                .limit(7)
                .peek(s -> System.out.print(s + ";  "))
                .count());


        // list.stream().map(s -> (int)(Math.random()* 100)).limit(10).forEach(System.out::println);
        // list.stream().map(s -> r.nextInt(100)).limit(10).forEach(System.out::println);
        // System.out.println(list.size());
    }


    public static String concat(int num1, double num2, String text) {
        return text + num1 + num2;
    }

    private static void odd(int[] m1) {
        System.out.println(Arrays.stream(m1).filter(s -> (s % 2) != 0).reduce((a, b) -> a + b).orElse(0));
        System.out.printf("Number of odd is %s", Arrays.stream(m1).filter(s -> (s % 2) != 0).count());
        // System.out.println(Arrays.stream(m1).filter(s -> (s % 2) != 0).count());

    }

    public static void myTaskOne() {
        List<Integer> list = new ArrayList<>();
        int[] array = new int[10];
        Random r = new Random();

        // IntStream.generate().forEach(System.out::println);

        list.stream().map(s -> s = r.nextInt()).limit(10).collect(Collectors.toList());
        //  System.out.println(list.stream().map(s -> s = r.nextInt()).limit(10).reduce((a, b) -> a + b).orElse(0));

        System.out.println(Arrays.stream(array).map(s -> r.nextInt()).limit(10).reduce(Integer::sum).orElse(555));

        // Arrays.stream(array).map(s -> s = r.nextInt()).limit(15).collect(Collectors.toList());

        //List<Integer> list2 = Stream.of(99, 2, 3).collect(Collectors.toList());
        List<Integer> list2 = list.stream().map(s -> s = r.nextInt(100)).peek(s -> ++s).limit(10).collect(Collectors.toList());
        Arrays.stream(array).map(s -> s = r.nextInt(100)).peek(s -> ++s).limit(10).forEach(System.out::println);

    }

    public static String arrToStr(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length - 1; i++) {
            String element = Integer.toString(array[i]);
            System.out.print(element + ", ");
        }
        for (int i = array.length - 1; i < array.length; i++) {
            String element = Integer.toString(array[i]);
            System.out.print(element);
        }
        System.out.print("]");
        return "";
    }

    public static void arrToStr1(int[] array) {

        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }


}
