package com.company.start.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCombin {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        size = scanner.nextInt();
        scanner.close();
        availableAmountOfCombination(createArray(size));
    }

    public static void availableAmountOfCombination(int[] array) {
        int size = array.length - 1;
        int innerSize = size;

        System.out.println(Arrays.toString(array));
        // for(int i = size; i > 0; ) {
        for (; size > 0; ) {
            innerLoop(array, size);
            if (array[size] <= size) {
                System.out.println(Arrays.toString(array));
                size = innerSize;
            } else {
                // i--;
                size--;
            }
        }
    }


    public static void innerLoop(int[] array, int size) {
        int temp = array[0];
        for (int i = 0; i < size; i++) {
             //  array[i - 1] = array[i];
            array[i] = array[i + 1];
        }
       // array[size - 1] = temp;
        array[size] = temp;
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
}


