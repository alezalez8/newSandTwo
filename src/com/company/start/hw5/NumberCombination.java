package com.company.start.hw5;

import java.util.Arrays;

public class NumberCombination {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4};
        // int[] testArray = {1, 2, 3};
        int sizeArray = 4;
        int[] array = new int[sizeArray];
        int temp = array[array.length - 1];

        /*
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) * 10;
        }
*/

        // perestanovka(testArray);
        moveLeft(testArray);


    }

    public static void perestanovka(int[] array) {
        int newSize = array.length - 1;
        int temp;
        int size = array.length;

        // while (newSize > 0) {

        // loop for change all elements in array
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < size; i++) {
            temp = array[i - 1];
            array[i - 1] = array[i];
            array[i] = temp;
            System.out.println(Arrays.toString(array));
        }       // System.out.println(Arrays.toString(array));
        // }

    }

    public static int[] innerLoop(int[] array, int size) {
        int temp = array[0];
        for (int i = 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        array[size - 1] = temp;
        return array;
    }

    public static void moveLeft(int[] array) {

        int size = array.length;
        int innerSize = size;
        int countLoop = size;
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(array));
            innerLoop(array, size);
          //  System.out.println("i  = " + i);




            if (i == size - 1) {
                i = -1;

                innerSize--;


                System.out.println("innerSize = " + innerSize);
                System.out.println("=============================" + Arrays.toString(array));
                if (innerSize > 0) {
                    innerLoop(array, innerSize);
                } else {
                    return;
                }

            }
        }
    }

}
//