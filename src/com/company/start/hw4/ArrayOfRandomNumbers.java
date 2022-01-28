package com.company.start.hw4;

import java.util.Arrays;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        int sizeOfArray = 15;
        int[] firstArray = new int[sizeOfArray];

/*
        int[] testArray = new Random().ints(15,0,10).toArray();
       */

        for (int i = 0; i < sizeOfArray; i++) {
            firstArray[i] = (int) (Math.random() * 10);
        }

        int[] doubleArray = Arrays.copyOf(firstArray, sizeOfArray * 2);

        for (int i = 0; i < sizeOfArray; i++) {
            doubleArray[sizeOfArray + i] = 2 * doubleArray[i];
        }

        System.out.println("first array is  " + Arrays.toString(firstArray));
        System.out.println("double array is " + Arrays.toString(doubleArray));
    }
}
