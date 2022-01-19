package com.company.start.hw1;

public class TriangleArea {
    public static void main(String[] args) {
        double sideA = 0.3;
        double sideB = 0.4;
        double sideC = 0.5;

        double halfPerim = (sideA + sideB + sideC) / 2;
        double figureArea = Math.sqrt(halfPerim * (halfPerim - sideA)
                * (halfPerim - sideB)
                * (halfPerim - sideC));

        System.out.printf("Area of triangle is %.2f ", figureArea);
    }
}
