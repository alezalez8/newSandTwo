package com.company.javaoop.lesson3.hw3;

import java.util.Arrays;

public class Group {

    private String groupName;
    private Student[] students = new Student[10];

    public Group() {
    }

    public Group(String groupName, Student[] students) {
        this.groupName = groupName;
        this.students = students;
    }

    public void addStudent(Student student) throws GroupOverflowException {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Student " + student.getName() +
                        " " + student.getLastName() + " was added to group succesfully");
                return;
            }
        }
        throw new GroupOverflowException("Group is completed, you can't added any students");


    }

    public Student searchStudentByLastName(String lastName) throws GroupOverflowException {
        Student student = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && lastName.equals(students[i])) {
                student = students[i];
            } else {
                throw new GroupOverflowException("Student " + lastName + " was not found");
            }
        }
        return student;

    }

    public boolean removeStudentByID(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && id == students[i].getId()) {
                students[i] = null;
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
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
