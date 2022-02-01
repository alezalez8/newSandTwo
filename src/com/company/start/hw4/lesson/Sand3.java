package com.company.start.hw4.lesson;

import java.util.Arrays;

public class Sand3 {
    public static void main(String[] args) {
        String[] source = {"1", "2", "3", "4", "5"};
        String[] destin = new String[3];
       // int[] source = {1, 2, 3, 4, 5};
    //    int[] destin = new int[3];
        System.arraycopy(source, 2, destin, 0, 3);
        Arrays.copyOfR

        System.out.println(Arrays.toString(destin));


    }
}
