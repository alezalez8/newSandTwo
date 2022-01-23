package com.company.start.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int coffeCost;
        int cups;
        int money;

        Scanner sc = new Scanner(System.in);
        double numberA;
        double numberB;
        double numberC;
        double numberD;
        double max;
        System.out.println("Введите первое число");
        numberA = sc.nextInt();

        System.out.println("Введите второе число");
        numberB = sc.nextInt();

        System.out.println("Введите третmе число");
        numberC = sc.nextInt();

        System.out.println("Введите четвертое число");
        numberD = sc.nextInt();

        max =  numberA;
        if(numberB>max) {
            max=numberA;
        }
        if(numberC>max){
            max=numberC;
        }
        if(numberD>max){
            max=numberD;
        }
        System.out.println("Самое большое число = " + max);
    }


       /* Scanner sc = new Scanner(System.in);
        System.out.println("Please input amount of cups");
        cups = sc.nextInt();
        System.out.println("Please input cost of one cup");
        coffeCost = sc.nextInt();


        money = coffeCost * cups;
        System.out.println("Total cost is " + money + " UAH");*/
    }

