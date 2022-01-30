package com.company.start.hw4;

public class CountOfOddNubmers {
    public static void main(String[] args) {
        int[] array = {0, 5, 2, 4, 7, 1, 3, 19};
        int summOdd = 0;

        for (int element : array
        ) {
            if ((element & 1) == 1) {
                summOdd++;
            }
        }
        System.out.println("Amount of odd numbers is " + summOdd);
    }
}
