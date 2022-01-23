package com.company.kym;

import java.util.Scanner;

public class PointInTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xA = 0;
        double yA = 0;
        double xB = 4;
        double yB = 4;
        double xC = 6;
        double yC = 1;
        double xP;
        double yP;
        double sqABC;
        double sqABP;
        double sqBPC;
        double sqAPC;

        System.out.println("Введите координаты точки (х):");
        xP = sc.nextDouble();
        System.out.println("Введите координаты точки (y):");
        yP = sc.nextDouble();

        sqABC = ((xB - xA) * (yC - yA) - (xC - xA) * (yB - yA)) / 2;
        sqABP = ((xB - xA) * (yP - yA) - (xP - xA) * (yB - yA)) / 2;
        sqBPC = ((xB - xP) * (yC - yP) - (xC - xP) * (yB - yP)) / 2;
        sqAPC = ((xP - xA) * (yC - yA) - (xC - xA) * (yP - yA)) / 2;

        System.out.println("sqABC = " + sqABC);
        System.out.println("sqABP = " + sqABP);
        System.out.println("sqBPC = " + sqBPC);
        System.out.println("sqAPC = " + sqAPC);


        if (sqABC == (sqABP + sqBPC + sqAPC)) {
            System.out.println("Точка находится внутри треугольника!");
        }else {
            System.out.println("Точка не находится внутри треугольника! ");
        }
    }
}