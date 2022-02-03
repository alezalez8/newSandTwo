package com.company.start.hw6.classlesson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date (dd:MM:yyyy)");
        String enterDate = scanner.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd:MM:yyyy");

        try {
            date = format2.parse(enterDate);
        } catch (ParseException e) {
            System.out.println("Error date format");;
        }

        String result = format.format(date);
        String result2 = format2.format(date);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(date.getTime());
    }
}
