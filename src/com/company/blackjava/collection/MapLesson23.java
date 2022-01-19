package com.company.blackjava.collection;

import java.util.HashMap;
import java.util.Map;

public class MapLesson23 {
    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<>();
       /* Map<Integer, String> map = new HashMap<>();

        String aaa = map.put(1234, "agfagag");
         map.put(15464, "agolkjgag");
        map.put(15657, "agfertag");
        map.put(19734, "auttgag");
        map.put(19734, "WWWEEE");
        System.out.println(map.get(15657));
        System.out.println(map.keySet());
        System.out.println(map.values());


        System.out.println(map);*/
    }
}

class Student {
    String name;
    String surname;
    int course;


    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return surname != null ? surname.equals(student.surname) : student.surname == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }
}
