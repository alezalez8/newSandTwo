package com.company.kym;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        int min = 99999;
        int max = 999999;

        Scanner sc = new Scanner(System.in);
        int numb;
        System.out.println("Введите шестизначное число: ");
        numb = sc.nextInt();
        if (min < numb && numb <= max) {
            int numb1 = numb / 100000;
            int numb2 = numb % 100000 / 10000;
            int numb3 = numb % 10000 / 1000;
            int numb4 = numb % 1000 / 100;
            int numb5 = numb % 100 / 10;
            int numb6 = numb % 10;


            if (numb1 == numb6
                    && numb2 == numb5
                    && numb3 == numb4) {
                System.out.println("Число - полиндром!");
            } else {
                System.out.println("Число - не полиндром!");
            }
        } else {
            System.out.println("Введеное число не шестизначное");
        }
    }
}

