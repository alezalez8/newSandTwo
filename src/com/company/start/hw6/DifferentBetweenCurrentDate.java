package com.company.start.hw6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DifferentBetweenCurrentDate {
    public static void main(String[] args) {
        Calendar currentDate = new GregorianCalendar();
        Calendar inputDate = new GregorianCalendar();
        Date date = new Date();
        currentDate.setTime(date);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date (MM:yyyy) or (MM:yy)");
        String enterDate = scanner.nextLine();
        scanner.close();

        SimpleDateFormat format = new SimpleDateFormat("MM:yy");
        try {
            date = format.parse(enterDate);
            inputDate.setTime(date);
        } catch (ParseException e) {
            System.out.println("You enter wrong date");
        }

        printDifferent(currentDate, inputDate);

    }

    public static void printDifferent(Calendar currentDate, Calendar inputDate) {
        if (currentDate.get(Calendar.MONTH) !=
                inputDate.get(Calendar.MONTH)) {
            System.out.println("Difference between current and input months is " +
                    Math.abs(currentDate.get(Calendar.MONTH) - inputDate.get(Calendar.MONTH)));
        }
        if (currentDate.get(Calendar.YEAR) !=
                inputDate.get(Calendar.YEAR)) {
            System.out.println("Difference between current and input years is " +
                    Math.abs(currentDate.get(Calendar.YEAR) - inputDate.get(Calendar.YEAR)));
        }

    }
}
