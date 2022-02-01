package com.company.start.hw5.lesson6;

public class Main {

    public static void main(String[] args) {
        long fact = factorialCalculate(14);
        System.out.println(fact);
    }

    public static long factorialCalculate(int f) {
        long fact = 1;
        for (int i = 1; i <= f; i++) {
            fact *= i;
        }
        return fact;
    }
}
