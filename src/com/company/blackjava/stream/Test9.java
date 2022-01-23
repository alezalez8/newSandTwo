package com.company.blackjava.stream;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Aleks", 'm', 49, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 52, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 38, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 30, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);


        int sum = students.stream().mapToInt(Student::getAge).sum();
        System.out.println(sum);

        double aver1 = students.stream().mapToInt(Student::getCourse).average().getAsDouble();
        System.out.println(aver1);

        double aver = students.stream().mapToDouble(Student::getAverage).average().getAsDouble();
        System.out.println(aver);

        int min  = students.stream().mapToInt(Student::getAge).max().getAsInt();
        System.out.println(min);

       /* List<Integer> listStud = students.stream()
                .mapToInt(el -> el.getAge())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listStud);

        List<Double> listStud2 = students.stream()
                .mapToDouble(Student::getAverage)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(listStud2);*/


      /* Student min =  students.stream().min(Comparator.comparingInt(Student::getAge)).get();
        System.out.println(min);
        Student max = students.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(max);
        Student nameMax = students.stream().min(Comparator.comparing(Student::getName)).get();

        System.out.println(nameMax);*/

        /*students.stream().filter(el -> el.getAge() > 25).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        students.stream().filter(el -> el.getAge() > 25).limit(2).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");
        students.stream().filter(el -> el.getAge() > 25).skip(3).forEach(System.out::println);
        System.out.println("-------------------------------------------------------------");*/


    }
}
