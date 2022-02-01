package com.company.start.hw5;

public class LinearSearch {
    public static void main(String[] args) {
        int number = 22;
        int[] array = new int[]{3, 4, 2, 7, 87, 23, 43, 101, 22, 54, 67, 11};
        int index = searchIndex(array, number);
        System.out.printf("Index of number %d is %d", number, index);

    }

    public static int searchIndex(int[] array, int element) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                index =  i;
            }
        } return index;
    }
}
