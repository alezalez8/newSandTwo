package com.company.kym;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

abstract class A {
    String first() {
        return second();



    }
     static  {
        System.out.println("initial A");
    }

    {
        System.out.println("normal A");
    }
    public int a = 10;




    abstract String second();

    String third() {
        return "A";
    }
}

class B extends A {


    String second() {
        return third();
    }
}

class C extends B {
    String third() {
        return "C";
    }
}

class Test {
    public static void main(String[] args) {
        B ref = new C();
        System.out.println(ref.first());
        System.out.println(ref.a);

       List<String> list = new LinkedList<>();
    }
}