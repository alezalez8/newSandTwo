package com.company.javaoop.lesson4.hw4;

import java.util.Arrays;
import java.util.Comparator;

public class Group {

    private String groupName;
    private Student[] students = new Student[10];
    private int countOfStudents = 0;

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws GroupOverflowException {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && student.getName().equals(students[i].getName())
                    && student.getLastName().equals(students[i].getLastName())) {
                throw new GroupOverflowException("This student is already present in this group, you can't add this student again");
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student.setGroupName(groupName);
                student.setId(i + 1);
                students[i] = student;
                countOfStudents++;
                System.out.println("Student " + student.getName() +
                        " " + student.getLastName() + " was added to group succesfully");
                return;
            }
        }
        throw new GroupOverflowException("Group is completed, you can't added any students");


    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && lastName.equals(students[i].getLastName())) {
                System.out.println("Student  " + students[i].getLastName() + " was found");
                return students[i];
            }
        }
        throw new StudentNotFoundException("Student " + lastName + " was not found");
    }


    public Student[] sortByLastName() {
        Student[] factStudents = new Student[countOfStudents];
        int newArrayOfStudent = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                factStudents[newArrayOfStudent] = students[i];
                newArrayOfStudent++;
            }
        }
        Arrays.sort(factStudents, Comparator.nullsFirst(Comparator.comparing(Student::getLastName)));
        return factStudents;


    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && id == students[i].getId()) {
                students[i] = null;
                countOfStudents--;
                System.out.println("Student with id = " + id + " was deleted succesfully");
                return true;
            }
        }
        System.out.println("Student with id = " + id + " was not found");
        return false;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "????????????: " + "\"" + groupName + "\"" +
                ", ????????????????: "
                + Arrays.toString(sortByLastName())
                +
                '}';
    }
}
