package com.company.blackjava.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {
        Student st1 = new Student("Aleks", 'm', 49, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 52, 2, 6.4);
        Student st5 = new Student("Elena", 'f', 38, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 30, 4, 7);
        Student st3 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        /*students.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);
        System.out.println("=================================");

        students.stream().sorted(Comparator.comparingDouble(Student::getAverage)).forEach(System.out::println);
        System.out.println("=================================");

        students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
        System.out.println("=================================");


        students.stream().sorted(Comparator.comparing(Student::getCourse)).distinct().forEach(System.out::println);*/

        students.stream().map(element -> {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .filter( element -> element.getSex()=='f')
                //.sorted(Comparator.comparing(a -> a.getAge()))
                .sorted(Comparator.comparingInt(Student::getAge))       // .sorted((a,b) -> a.getAge() - b.getAge())
                .forEach(System.out::println);

       /* students.stream().filter(element -> element.getSex()=='f')
                .sorted(Comparable<Student>.to)
                .map(student -> student.getName().toUpperCase())

               // .filter(elem -> elem.getSex.eguals('f'))
                .forEach(System.out::println);*/
                /*.sorted(Comparator)
                .forEach(System.out::println);*/

/*
        students.stream().filter(v -> (v.getAverage() > 7.5) && (v.getAge() > 30)).forEach(System.out::println);

        students = students.stream().filter(v -> (v.getAverage() > 7.5) && (v.getAge() > 30)).collect(Collectors.toList());
        System.out.println("--------------------------------------");
        System.out.println(students);
*/
                Stream < Student > myStream = Stream.of(st1, st2, st3, st4, st5);

        //myStream.reduce((a, e) -> (e.getAverage())).get()

    }


}

class Student {
    private String name;
    private int age;
    private int course;
    private double average;
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student(String name, char sex, int age, int course, double average) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.average = average;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
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
                ", sex=" + sex +
                '}';
    }
}
