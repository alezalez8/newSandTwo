package com.company.start.hw6;

public class MyOwnToString {
    public static void main(String[] args) {
        int[] testArray = {23, 5, 7, 9, -3, 5, -8, -2, 3, 1};

        System.out.println(arraysString(testArray));

    }

    public static String arraysString(int[] array) {
        StringBuilder out = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            out.append(", ");
            out.append(array[i]);
        }
        out.replace(1, 3, "");
        out.append("]");
        return out.toString();

    }
}
