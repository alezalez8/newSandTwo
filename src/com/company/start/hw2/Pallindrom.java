package com.company.start.hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pallindrom {


    public static void main(String[] args) {
        int inputNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input six-digits number");
        try {
            inputNumber = scanner.nextInt();

            if (inputNumber / 100_000 == inputNumber % 10
                    && inputNumber % 100_000 / 10_000 == inputNumber % 100 / 10
                    && inputNumber % 10_000 / 1000 == inputNumber % 1000 / 100) {
                System.out.println("This number is polindrom");
            } else {
                System.out.println("This number is not polindrom");
            }

        } catch (InputMismatchException exception) {
            System.out.println("You input no six-digits number");
        }

    }
}
