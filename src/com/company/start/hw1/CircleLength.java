package com.company.start.hw1;

import java.util.Scanner;

public class CircleLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input radius of circle");

        double radius = scanner.nextDouble();
        double lengthCircle = 2 * Math.PI * radius;

        System.out.printf("Length of circle is %.2f", lengthCircle);

    }
}
