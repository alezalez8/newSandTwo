package com.company.start.hw4.lesson;

import java.util.Scanner;

public class Sand2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print("ostatok ot " + i + " = " + i % 3);
            System.out.println(";  " + i / 3 + " segmeny");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Helloy");
        }
    }
}
