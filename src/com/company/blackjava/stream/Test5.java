package com.company.blackjava.stream;

import java.util.Arrays;

public class Test5 {

    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 18, 8, 21, 81, 7, 18};

       /* array = Arrays.stream(array).sorted().distinct().toArray();
        System.out.println(Arrays.toString(array));*/

        int outArray = Arrays.stream(array).filter(element -> element % 2 != 0)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                })
                .reduce((acc, element) -> acc + element).getAsInt();
        System.out.println(outArray);

        System.out.println("==================================");

        Arrays.stream(array).filter(elem -> {
            System.out.println("!!!!");
            return elem % 2 == 0;
        })
               .forEach(System.out::println);

    }
}
