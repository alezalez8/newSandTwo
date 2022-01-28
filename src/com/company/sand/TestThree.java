package com.company.sand;

import java.util.Arrays;
import java.util.Random;

public class TestThree {
    public static void main(String[] args) {
       /* byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();


        for (byte t : bytes) {
            System.out.format("0x%x ", t);
        }*/

/*
        Stream<Integer> stream = null;
        Random random = new Random();
        stream.mapToInt(x -> random.nextInt(100)).filter(el -> el %2 != 0).limit(15).forEach(System.out::println);
*/
        int[] array = new Random().ints(15, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        new Random().ints(15, 0, 100)
                .filter(el -> el %2 != 0)
                .forEach(System.out::print);



    }




}
