package com.company.blackjava.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;


public class TestOne {

    private void searchStudent(List<Student> studentList, Predicate<Student> stud) {
        for (Student st : studentList
        ) {
            if (stud.test(st)) {
                System.out.println(st);
            }

        }
    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student("Aleks", 49, 1, 11.2));
        studentList.add(new Student("LehaOne", 34, 3, 9.8));
        studentList.add(new Student("Gena", 28, 2, 7.2));
        studentList.add(new Student("Bro", 52, 5, 10.9));
        studentList.add(new Student("Ivan", 47, 4, 11.4));

        Student st = new Student("Olga", 52, 5, 10.9);

        System.out.println(studentList);

       // Function<Student, Double> function = student -> student.getAverage();

        double res = avgOfSmth(studentList, student -> (double)student.getAge());  // этой лямбдой описываем то, что делает function.apply(student);
        System.out.println("Average is " + res);



    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> function) {
        double avg = 0;
        for (Student student : list
        ) {
            avg += function.apply(student);
        }
        return avg / list.size();

    }


}




       /* Predicate<Student> prOne = n -> n.getName().length() < 4;
        Predicate<Student> prTwo = a -> a.getAge() > 40;

        studentList.removeIf(prOne.or(prTwo));

        //studentList.removeIf(ss -> ss.getAge() == 52);
        System.out.println("After deleting");
        System.out.println(studentList);*/


/*
        Collections.sort(studentList, (p, o) -> p.getCourse() - o.getCourse());

        Collections.sort(studentList, Comparator.comparingInt(Student::getCourse));
        System.out.println(studentList);
*/

      /*  int z = 20;


        TestOne testOne = new TestOne();
       // CheckNeededStudent ns = p -> p.getCourse() < 4;


        testOne.searchStudent(studentList, student -> {
            System.out.println("Helloy  " + z);

            return student.getAge() > 40;
        });
        System.out.println("-----------------------------------------------");

        //testOne.searchStudent(studentList, ns);


        System.out.println("-----------------------------------------------");
        testOne.searchStudent(studentList, t -> t.getCourse() > 1 && t.getAverage() > 10);*/


/*

interface CheckNeededStudent {
    boolean check(Student student);
}
*/
