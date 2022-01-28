package com.company.start.hw4.lesson;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] cost = new int[]{500, 800, 70, 150, 200};
        Integer[] cost1 = new Integer[]{500, 800, 70, 150, 200};
        int sum = 0;

        System.out.println(Arrays.toString(cost));

       // Stream.of(cost).reduce((s1, s2) -> s1 + s2)
      //  sum = Stream.of(500, 800, 70, 150, 200).reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println(Stream.of(cost).map(el -> Arrays.stream(el).sum()));

        //System.out.println(sum = Stream.of(cost1).reduce(Integer::sum).orElse(0));


        /*for (int temp : cost
        ) {
            sum += temp;
        }*/

//collection.stream().mapToInt((s) -> Integer.parseInt(s)).sum()
       // System.out.println("Сумма = " + sum);


    }
}
