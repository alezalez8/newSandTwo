package com.company.start.hw5.lesson6;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        milliSec();

    }
    public static void milliSec(){


        Date date = new Date();
        Calendar cl =  Calendar.getInstance();

        int b = cl.get(Calendar.MONTH);
        b--;

        if(b<0) {
            b=11;
        }

        cl.set(Calendar.MONTH, b);

        Date date1 = cl.getTime();
        long l1 = date1.getTime();

        long l = date.getTime();

        long l2 = l - l1;



        System.out.println(l2);
        }

        /*int x = 117;
        int y = 17;



        String hemNum = Integer.toBinaryString(x ^ y);
        long hemming = Stream.of(hemNum.split("")).filter(el -> el.equals("1")).count();
        System.out.println(hemming);*/



}
