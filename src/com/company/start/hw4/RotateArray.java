package com.company.start.hw4;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int sizeArray;
        int direction;
        int[][] array;
        int[][] arrayTest;

        int temp;

        Scanner scanner = new Scanner(System.in);
        //  System.out.println("Input size of rectangle array");
        // sizeArray = scanner.nextInt();
        //  array = new int[sizeArray][sizeArray];
// ---------------- random array
/*
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
*/
// ---------------- end -------------------------------

        arrayTest = new int[][]{{4, 5, 6, 7}, {3, 14, 15, 8}, {2, 13, 16, 9}, {1, 12, 11, 10}};
        printArray(arrayTest);

        int arrLength = arrayTest.length - 1;
        for (int i = 0; i < 1; i++) {
            temp = arrayTest[i][arrLength];
            arrayTest[i][arrLength] = arrayTest[i][i]; // 1
            arrayTest[i][i] = temp;
            temp = arrayTest[arrLength][arrLength];
            arrayTest[arrLength][arrLength] = arrayTest[i][i]; // 2

            arrayTest[i][i] = temp;
            temp = arrayTest[arrLength][i];
            arrayTest[arrLength][i] = arrayTest[i][i];
            arrayTest[i][i] = temp;
        }
        System.out.println("----------------------------");

        printArray(arrayTest);



/*
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
*/

        for (int[] ints : arrayTest) {
            for (int j = 0; j < arrayTest.length; j++) {
                temp = ints[j];

            }
        }
    }

    static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j]);
                if (ints[j] < 10) {
                    System.out.print("   ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}



