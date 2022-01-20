package com.company.blackjava.stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
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
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

}