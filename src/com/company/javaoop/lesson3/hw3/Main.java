package com.company.javaoop.lesson3.hw3;

public class Main {
    public static void main(String[] args) throws GroupOverflowException, StudentNotFoundException {

        Student student1 = new Student("Aleks", "Shunin", Gender.MAIL, 1, "javaoop");
        Student student2 = new Student("Gena", "Ivanov", Gender.MAIL, 2, "javaoop");
        Student student3 = new Student("Sasha", "Petrov", Gender.MAIL, 3, "javaoop");
        Student student4 = new Student("Leha", "Sidorov", Gender.MAIL, 4, "javaoop");
        Student student5 = new Student("Sveta", "Ischenko", Gender.MAIL, 5, "javaoop");
        Student student6 = new Student("Lena", "Kapustina", Gender.MAIL, 5, "javaoop");
        Student student7 = new Student("Igor", "Zadynayskyj", Gender.MAIL, 5, "javaoop");
        Student student8 = new Student("Egor", "Sverdlov", Gender.MAIL, 5, "javaoop");
        Student student9 = new Student("Yuriy", "Azarov", Gender.MAIL, 5, "javaoop");
        Student student10 = new Student("Oleg", "Menshikov", Gender.MAIL, 5, "javaoop");
        Student student11 = new Student("Artyr", "Lepotov", Gender.MAIL, 5, "javaoop");

        Group group = new Group();
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);
        group.addStudent(student11);



    }
}
