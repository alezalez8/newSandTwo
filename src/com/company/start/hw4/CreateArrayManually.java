package com.company.start.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CreateArrayManually {
    public static void main(String[] args) {
        int arraySize;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array");
        arraySize = scanner.nextInt();
        scanner.close();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Input " + i + 1 + " element of array");
            array[i] = scanner.nextInt();
        }
        System.out.println("------------------------------------------");
        System.out.println("You enter array: " + Arrays.toString(array));
    }
}
