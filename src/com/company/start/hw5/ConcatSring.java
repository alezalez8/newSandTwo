package com.company.start.hw5;

public class ConcatSring {
    public static void main(String[] args) {
        int a = 12;
        float b = 15.6f;
        String str = " stroka";

        String outLine = concat(a, b, str);
        System.out.println(outLine);

    }

    public static String concat(int numberOne, float numberTwo, String stroka) {
        return (numberOne + numberTwo) + stroka;
    }
}
