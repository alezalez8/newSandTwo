package com.company.start.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int coffeCost;
        int cups;
        int money;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input amount of cups");
        cups = sc.nextInt();
        System.out.println("Please input cost of one cup");
        coffeCost = sc.nextInt();


        money = coffeCost * cups;
        System.out.println("Total cost is " + money + " UAH");
    }
}
