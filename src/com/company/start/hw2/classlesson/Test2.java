package com.company.start.hw2.classlesson;

public class Test2 {
    public static void main(String[] args) {
        int[][] aa = new int[3][];
        aa[0] = new int[]{2, 3};
        aa[1] = new int[]{5, 6, 7};
        aa[2] = new int[]{9, 10, 11, 13, 14};

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(aa[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
