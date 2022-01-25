package com.company.start.hw3.classlesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int start;
        int end;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number");
        start = scanner.nextInt();
        System.out.println("Please input second number");
        end = scanner.nextInt();

        if (end > start) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            System.out.println("Сумма чисел по заданному диапазону = " + sum);
        } else {
            System.err.println("Вы ввели ошибочные значения");
        }

    }
}

