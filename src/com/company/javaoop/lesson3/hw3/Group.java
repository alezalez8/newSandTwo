package com.company.javaoop.lesson3.hw3;

import java.util.Arrays;

public class Group {

    private String groupName;
    private Student[] students = new Student[10];

    public Group() {
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student student) throws GroupOverflowException {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && student.getName().equals(students[i].getName())
                    && student.getLastName().equals(students[i].getLastName())) {
                System.err.println("This student is already in this group, you can't add again");
                return;
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                student.setGroupName(groupName);
                student.setId(i + 1);
                students[i] = student;
                System.out.println("Student " + student.getName() +
                        " " + student.getLastName() + " was added to group succesfully");
                return;
            }
        }
        throw new GroupOverflowException("Group is completed, you can't added any students");


    }

    public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
        Student student;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && lastName.equals(students[i].getLastName())) {
                student = students[i];
                System.out.println("Student  " + student.getLastName() + " was found");
                return student;
            }
        }
        throw new StudentNotFoundException("Student " + lastName + " was not found");
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
        return "Группа: " + "\"" + groupName + "\"" +
                ", студенты: " + Arrays.toString(students) +
                '}';
    }
}
