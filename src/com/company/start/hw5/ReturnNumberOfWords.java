package com.company.start.hw5;

import java.util.Scanner;

public class ReturnNumberOfWords {
    public static void main(String[] args) {
       // String example = "Hello   world! How   are you?  ";
        String stroka;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        stroka = scanner.nextLine();
        scanner.close();

        System.out.println("Number of words in text is " + words(stroka));

    }

    public static int words(String stroka) {
        if (stroka == null) {
            System.out.println("Wrong stroka");
            return -1;
        }
        int sum = stroka.split(" +").length;
        return sum;
    }
}
