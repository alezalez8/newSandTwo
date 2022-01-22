package com.company.start.hw2;

import java.util.Scanner;

public class MaxInputNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int inputNumber;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Please input " + (i + 1) + " nubmer");
            inputNumber = scanner.nextInt();
            if (max < inputNumber) {
                max = inputNumber;
            }
        }
        System.out.println("Maximum is " + max);
    }

}
