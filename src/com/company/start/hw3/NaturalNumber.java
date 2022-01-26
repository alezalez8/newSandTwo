package com.company.start.hw3;

public class NaturalNumber {
    public static void main(String[] args) {
        int number = 100;


      /*  for (int i = 1; i <= 37; i++) {
            System.out.println(37 % i);
        }*/

        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i == j) {
                    System.out.print(i + "  ");

                }


            }
        }

    }
}
// 37