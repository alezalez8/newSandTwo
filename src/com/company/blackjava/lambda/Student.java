package com.company.blackjava.lambda;

public class Student {
    private String name;
    private  int age;
    private int course;
    private double average;

    public Student(String name, int age, int course, double average) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", average=" + average +
                '}';
    }
}
