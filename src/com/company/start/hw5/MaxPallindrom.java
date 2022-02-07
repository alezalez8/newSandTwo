package com.company.start.hw5;

public class MaxPallindrom {
    public static void main(String[] args) {

        polindrom();


    }
    public static void polindrom() {
        int palindrom = 0;
        int temp = 0;
        int x = 0;
        int y = 0;
        String a;
        String b;
        for (int i = 100; i < 999; i++) {
            for (int j = 100; j < 999; j++) {
                a = String.valueOf(i * j);
                b = new StringBuilder(a).reverse().toString();
                if (a.equals(b)) {
                    palindrom = i * j;
                    // count++;
                    if (temp < palindrom) {
                        temp = palindrom;
                        x = i;
                        y = j;
                    }
                }
            }

        }
        System.out.println("Palindrom is: " + temp);
        System.out.println("fist number =   " + x);
        System.out.println("second number = " + y);
    }
}
