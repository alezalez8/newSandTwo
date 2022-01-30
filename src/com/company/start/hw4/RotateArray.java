package com.company.start.hw4;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int arraySize;
        int direction;
        int[][] arrayTest;
        int temp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of rectangle array");
        arraySize = scanner.nextInt();
        arrayTest = new int[arraySize][arraySize];
        System.out.println("Input number   of rotate: 1 - 90, 2 - 180, 3 - 270 degrees, 0 - without rotate");
        direction = scanner.nextInt();
        scanner.close();
// ---------------- random array ----------------------
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                arrayTest[i][j] = (int) (Math.random() * 10);
            }
        }
// ---------------- end -------------------------------
        // arrayTest = new int[][]{{4, 5, 6, 7}, {3, 14, 15, 8}, {2, 13, 16, 9}, {1, 12, 11, 10}};
        printArray(arrayTest);
       // arraySize = arrayTest.length;
//========================
        switch (direction) {
            case 1: direction = 3;
            break;
            case 2: direction = 2;
            break;
            case 3: direction = 1;
            break;
            default: direction = 0;
        }

        for (int rot = 0; rot < direction; rot++) {
// ----------------- rotate array --------------------
            for (int i = 0; i < arraySize / 2; i++) {
                for (int j = i; j < arraySize - i - 1; j++) {
                    temp = arrayTest[i][j];
                    arrayTest[i][j] = arrayTest[j][arraySize - 1 - i];
                    arrayTest[j][arraySize - 1 - i] = arrayTest[arraySize - 1 - i][arraySize - 1 - j];                // Move values from left to bottom
                    arrayTest[arraySize - 1 - i][arraySize - 1 - j] = arrayTest[arraySize - 1 - j][i];
                    arrayTest[arraySize - 1 - j][i] = temp;
                }
            }
        }
        System.out.println("----------------------");
        printArray(arrayTest);
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

/*
There is N/2 squares or cycles in a matrix of side N.
Process a square one at a time. Run a loop to traverse
the matrix a cycle at a time, i.e loop from 0 to N/2 – 1,
loop counter is i
Consider elements in group of 4 in current square,
rotate the 4 elements at a time. So the number of such
groups in a cycle is N – 2*i.
So run a loop in each cycle from x to N – x – 1, loop counter is y
The elements in the current group is
 (x, y),
 (y, N-1-x),
 (N-1-x, N-1-y),
 (N-1-y, x),
 now rotate the these 4 elements, i.e
 (x, y) <- (y, N-1-x),
 (y, N-1-x)<- (N-1-x, N-1-y),
 (N-1-x, N-1-y)<- (N-1-y, x),
 (N-1-y, x)<- (x, y)
* */

/*
        for (int i = 0; i < s; i++) {
            for (int j = i+1; j < s; j++) {
                temp = arrayTest[i][j];
                arrayTest[i][j] = arrayTest[j][i];
                arrayTest[j][i] = temp;
            }
        }
*/
//==========================================
/*
        for (int i = 0; i < 1; i++) {
            temp = arrayTest[i][s];
            arrayTest[i][s] = arrayTest[i][i]; // 1
            arrayTest[i][i] = temp;
            temp = arrayTest[s][s];
            arrayTest[s][s] = arrayTest[i][i]; // 2

            arrayTest[i][i] = temp;
            temp = arrayTest[s][i];
            arrayTest[s][i] = arrayTest[i][i];
            arrayTest[i][i] = temp;
        }
*/



