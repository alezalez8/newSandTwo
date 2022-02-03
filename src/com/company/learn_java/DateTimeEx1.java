package com.company.learn_java;

import java.time.*;

public class DateTimeEx1 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2022, 1, 22);
        LocalDate ld2 = LocalDate.of(2022, 2, 25);
        System.out.println(ld);
        Duration dur = Duration.ofHours(5);
        LocalTime localTime = LocalTime.of(15, 20);
        System.out.println(localTime);
        //localTime = localTime.plus(dur);
       // System.out.println(localTime);
        Duration dur2 = Duration.ofMinutes(35);
        localTime = localTime.plus(dur2).plus(dur);
        System.out.println(localTime);



       // ld = ld.plusDays(1600).minusYears(3);
        // System.out.println(ld.isBefore(ld2));

        System.out.println();





       /* LocalDate ld2 = LocalDate.of(2022, Month.JANUARY, 12);
        System.out.println(ld2);
        System.out.println(Month.MARCH.getValue());
        LocalTime localTime = LocalTime.of(12, 45, 00);
        System.out.println(localTime);
        System.out.println("---------------------------");

        LocalDateTime time = LocalDateTime.of(ld, localTime);
        System.out.println(time);*/



    }

}

