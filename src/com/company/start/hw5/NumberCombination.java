package com.company.start.hw5;

import java.util.Arrays;
import java.util.Random;

public class NumberCombination {

    public static void main(String[] args) {
        int sizeArray = 4;
        int[] array = new int[sizeArray];
        int temp = array[array.length - 1];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) * 10;
        }

    }

    public static int[] perest(int[] array) {
        int k = array[array.length - 1];
        int temp;
        int size = array.length;
        for (int i = 0; i < size; i++) {
            temp = array[i];

        }



        return null;
    }

}
