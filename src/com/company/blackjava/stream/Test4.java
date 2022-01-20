package com.company.blackjava.stream;

import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(
                1, 3, 5, 7, 3, 9, 4, 12, 45, 6);

        Stream<Integer> stream2 = Stream.of(
                45, 21, 87, 32, 4, 2, 9, 6, 31);
        Stream<Integer> stream3 = Stream.of(1,2,3,4,5,6);

       /* Stream<Integer> stream4 = Stream.concat(stream1, stream2);
        stream4.forEach(System.out::println);
        */

       /* long ll = stream1.distinct().count();
        System.out.println(ll);*/

        System.out.println(stream1.distinct().peek(System.out::println).count());




    }
}
