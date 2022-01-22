package com.company.start.hw2.classlesson;

import java.util.Scanner;

public class Test {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        double a1 = in. nextDouble(), a2 = in. nextDouble();
        double b1 = in. nextDouble(), b2 = in. nextDouble();
        double c1 = in. nextDouble(),c2 = in. nextDouble();
        double x = in. nextDouble(), y = in. nextDouble(), f, g;
        f = (y - a2)*(b1 - a1) - (x - a1)*(b2 - a2);
        g = (c2 - a2)*(b1 - a1) - (c1 - a1)*(b2 - a2);
        if (f*g > 0) {
            f = (y - a2)*(c1 - a1) - (x - a1)*(c2 - a2);
            g = (b2 - a2)*(c1 - a1) - (b1 - a1)*(c2 - a2);
            if (f*g > 0) {
                f = (y - b2)*(c1 - b1) - (x - b1)*(c2 - b2);
                g = (a2 - b2)*(c1 - b1) - (a1 - b1)*(c2 - b2);
                if (f*g > 0)
                    System.out.println("Yes\n");
                else
                    System.out.println("No\n");
            }
            else
                System.out.println("No\n");
        }
        else
            System.out.println("No\n");
    }
}
