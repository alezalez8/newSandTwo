package com.company.start.hw6.classlesson;

public class Lesson7c {
    public static void main(String[] args) {


        String text = String.format("Hello world %.2f", 22.324325435);
        System.out.println(text);
        double x = Math.sqrt(2);
        System.out.println(doubleToString(x, 3));
    }

    public static String doubleToString(double number, int n) {
        String result = String.format("%." + n + "f", number);
        return result;
    }
}
