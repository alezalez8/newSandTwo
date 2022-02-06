package com.company.start.hw5;

public class MaxPallindrom {
    public static void main(String[] args) {
        long palindrom = 0;
        int x = 0;
        int y = 0;
        String a;
        String b;
       // int count = 0;

        for (int i = 100; i < 999; i++) {
            for (int j = 100; j < 999; j++) {

                a = String.valueOf(i * j);
                b = new StringBuilder(a).reverse().toString();
                if (a.equals(b)) {
                   // count++;
                    x = i;
                    y = j;
                    palindrom = i * j;
                }
            }

        }
        System.out.println("Palindrom is: " + palindrom);
        System.out.println("fist number =   " + x);
        System.out.println("second number = " + y);
       // System.out.println(count);

    }
}
