package com.company.start.hw6;

public class PrintPi {

    public static void main(String[] args) {
        printPi();

    }

    public static void printPi() {
        for (int i = 2; i < 12; i++) {
            System.out.printf("%." + i + "f", Math.PI);
            System.out.println();
        }
    }
}
