package com.company.start.hw3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int inputNumber;
        long factorial = 1;
        int lowBound = 4;
        int highBond = 16;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input  number");
        inputNumber = scanner.nextInt();
        scanner.close();

        if (lowBound < inputNumber && highBond > inputNumber) {
            for (int i = 1; i <= inputNumber; i++) {
                factorial = factorial * i;
            }
            System.out.printf("The factorial of the number %d is: %d", inputNumber, factorial);
        } else {
            System.out.println("Your input number is wrong. Number must be between 4 and 16.");
        }
    }
}
