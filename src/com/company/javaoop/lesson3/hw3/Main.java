package com.company.javaoop.lesson3.hw3;

public class Main {
    public static void main(String[] args) throws StudentNotFoundException {

        Student student1 = new Student("Aleks", "Shunin", Gender.MAIL);
        Student student2 = new Student("Gena", "Ivanov", Gender.MAIL);
        Student student3 = new Student("Sasha", "Petrov", Gender.MAIL);
        Student student4 = new Student("Leha", "Sidorov", Gender.MAIL);
        Student student5 = new Student("Sveta", "Ischenko", Gender.FEMALE);
        Student student6 = new Student("Lena", "Kapustina", Gender.FEMALE);
        Student student7 = new Student("Igor", "Zadynayskyj", Gender.MAIL);
        Student student8 = new Student("Egor", "Sverdlov", Gender.MAIL);
        Student student9 = new Student("Yuriy", "Azarov", Gender.MAIL);
        // Student student10 = new Student("Yuriy", "Azarov", Gender.MAIL);
        Student student10 = new Student("Oleg", "Menshikov", Gender.MAIL);
        Student student11 = new Student("Artyr", "Lepotov", Gender.MAIL);

        Group group = new Group("javaoop");

        try {
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

        } catch (GroupOverflowException e) {
            System.out.println(e);
           // System.err.println(e + "Group is completed, you can't added any students");
        }
        System.out.println("-----------------------------------------");

        try {
            group.searchStudentByLastName("Sverdlov");
            group.searchStudentByLastName("Sverdlo");
        } catch (StudentNotFoundException e) {
            System.out.println(e);
                    }
        System.out.println("-----------------------------------------");

        group.removeStudentByID(0);
        group.removeStudentByID(9);
        group.removeStudentByID(10);

        System.out.println("-----------------------------------------");
        System.out.println(group);
    }

}
