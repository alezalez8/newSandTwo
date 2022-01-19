package com.company.sand;

import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        A var = new B();
        var.print();
       /* A var2 = new C();
        var2.print();*/

        //System.out.println(-9 % 2);
       /* Scanner scanner = new Scanner(System.in);
        boolean isNext = true;
        String inputLine = "";
        while (isNext) {
            System.out.println("Input number or \"e\" for exit");
            if ((inputLine = scanner.nextLine()).equals("e")) {
                isNext = false;
                System.out.println("Exit");

            } else {
                System.out.println(((Integer.parseInt(inputLine)) & 1) != 0 ? "odd" : "even");
            }
        }*/
    }


}


class A {
    static public void print() {
        System.out.println("A.print() is called");
    }

}

class B extends A {
    static public void print() {
        System.out.println("B.print() is called");
    }
}

class C extends B {
    static public void print() {
        System.out.println("C.print() is called");
    }
}
