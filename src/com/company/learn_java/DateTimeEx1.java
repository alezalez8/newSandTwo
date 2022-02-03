package com.company.learn_java;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeEx1 {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(15, 30);
        LocalDate localDate = LocalDate.of(2022, 1, 20);
        System.out.println(localDate);
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(localDate.format(formatter1));
        DateTimeFormatter formatter2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(localTime);
        System.out.println(localTime.format(formatter2));
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(localTime.format(formatter3));


    }

}

