package com.company.start.hw2.classlesson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount;
        int max = Integer.MIN_VALUE;
       /* int min = Integer.MAX_VALUE;
        System.out.println("Min = " + max);
        System.out.println("Min = " + min);*/

        System.out.println("Введите кол-во цифр для анализа");
        amount = sc.nextInt();

        for (int i = 0; i < amount; i++) {
            System.out.println("Ведите " + (i + 1) + " число");
            int current = sc.nextInt();
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Maximum price is " + max);

    }
        /*System.out.println("Input first price");
        numberA = sc.nextInt();
        System.out.println("Input second price");
        numberB = sc.nextInt();
        System.out.println("Input third price");
        numberC = sc.nextInt();

        if (numberA < numberB) {
            if (numberB < numberC) {
                max = numberC;
            } else {
                max = numberB;
            }
        } else if (numberA > numberC) {
            max = numberA;
        } else max = numberC;

        System.out.println("Maximum price is " + max);*/

       /* List<Integer> list = new ArrayList<>();
        list.add(numberA);
        list.add(numberB);
        list.add(numberC);
        System.out.println(list.stream().max(Comparator.comparingInt(a -> a)).get());*/


    }

