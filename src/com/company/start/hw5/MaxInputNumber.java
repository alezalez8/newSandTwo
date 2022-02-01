package com.company.start.hw5;

public class MaxInputNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 7, 87, 23, 43, 101, 22, 54, 67, 11};
        int result = max(arr);
        System.out.println("max number is " + result);
    }

    public static int max(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (result < array[i]) {
                result = array[i];
            }
        }
        return result;
    }
}
