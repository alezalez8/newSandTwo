package com.company.blackjava.enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SUNDAY);
        today.daysInfo();
    }
}

enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class Today {
    WeekDays weekDays;


    public Today(WeekDays weekDays) {
        this.weekDays = weekDays;
    }

    void daysInfo() {
        switch (weekDays) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Stay home");
                break;
        }
    }
}
