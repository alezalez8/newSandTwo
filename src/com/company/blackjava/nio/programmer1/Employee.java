package com.company.blackjava.nio.programmer1;

import java.io.Serializable;

public class Employee implements Serializable {
    static final long serialVersionUID = 2;
    String name;
    String surename;
    String department;
   // int age;
    transient double salary;
    Car car;

    public Employee(String name, String surename,
                    // int age,
                    String department,
                    double salary, Car car) {
        this.name = name;
        this.department = department;
        //this.age = age;
        this.salary = salary;
        this.car = car;
        this.surename = surename;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", department='" + department + '\'' +
               // ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
