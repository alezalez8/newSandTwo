package com.company.start.hw6;

import java.util.Calendar;

public class AmountOfMilisec {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Time between current and previous months is "
                + timeBetweenMonths(calendar)
                + "  millisec");

/*
        System.out.println("Amount of days between this dates is " +
                timeBetweenMonths(calendar)  / 1000 / 60 / 60 / 24
        + " days");
*/

    }

    public static long timeBetweenMonths(Calendar calendar) {
        long finish = calendar.getTimeInMillis();
        calendar.add(Calendar.MONTH, -1);
        long start = calendar.getTimeInMillis();
        return finish - start;
    }
}
