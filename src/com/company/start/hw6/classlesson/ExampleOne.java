package com.company.start.hw6.classlesson;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class ExampleOne {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, -73);

/*
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int year = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);
        System.out.println(year);
*/

        Formatter formatter = new Formatter();

        calendar.set(1981, Calendar.OCTOBER, 11);

        System.out.println(calendar.getTimeInMillis());

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
