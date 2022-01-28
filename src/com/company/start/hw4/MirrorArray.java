package com.company.start.hw4;

import java.util.Arrays;

public class MirrorArray {
    public static void main(String[] args) {
        int[] arrayTest = {7, 2, 9, 4};
        int[] arrayTest1 = {7, 2, 9, 4, 5};

        System.out.println("Print array one");
        System.out.println(Arrays.toString(arrayTest));
        mirrorArray(arrayTest);
        System.out.println(Arrays.toString(arrayTest));

        System.out.println("Print array two");
        System.out.println(Arrays.toString(arrayTest1));
        mirrorArray(arrayTest1);
        System.out.println(Arrays.toString(arrayTest1));
    }

    static void mirrorArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}

