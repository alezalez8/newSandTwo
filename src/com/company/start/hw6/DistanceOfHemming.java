package com.company.start.hw6;

import java.util.Scanner;
import java.util.stream.Stream;

public class DistanceOfHemming {
    public static void main(String[] args) {
        int n;
        int m;
        // набор 117 и 17 == 3, набор 825 и 180 == 6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        n = scanner.nextInt();
        System.out.println("Enter second number");
        m = scanner.nextInt();


        System.out.println("Hemming's number is " + hemming(n, m));

    }

    public static int hemming(int n, int m) {
        int result = 0;
        int isklIli = n ^ m;
        String[] binaryNumber = Integer.toBinaryString(isklIli).split("");
        System.out.println("Hemming = " + Stream.of(binaryNumber).filter(x -> x.equals("1")).count());

        for (int i = 0; i < binaryNumber.length; i++) {
            if (binaryNumber[i].equals("1")) {
                result++;
            }
        }

        return result;
    }

}
