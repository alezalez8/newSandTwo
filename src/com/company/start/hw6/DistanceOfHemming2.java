package com.company.start.hw6;

import java.util.Scanner;
import java.util.stream.Stream;

public class DistanceOfHemming2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = scanner.nextInt();
        System.out.println("Enter second number");
        int m = scanner.nextInt();

        System.out.println("Hemming's number is " + hemming(n, m));

    }
    public static long hemming(int n, int m) {
        String hemNum = Integer.toBinaryString(n ^ m);
        return  Stream.of(hemNum.split("")).filter(el -> el.equals("1")).count();
    }
}
