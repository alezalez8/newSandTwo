package com.company.start.hw4.lesson;

import java.util.Arrays;

public class Sand3 {
    public static void main(String[] args) {
        // String[] source = {"1", "2", "3", "4", "5"};
        String[] source = {"1", "2", "3"};
        String[] destination = null;
        int numberOfTriad = 0;

        int sizeOfArray = source.length;
        if (source.length % 3 != 0) {
            sizeOfArray = source.length + 3 - source.length % 3;
            destination = new String[sizeOfArray];
            System.arraycopy(source, 0, destination, sizeOfArray - source.length, source.length);
        } else {
            destination = source;
        }

        System.out.println(sizeOfArray);
        System.out.println(Arrays.toString(destination));


    }
}
