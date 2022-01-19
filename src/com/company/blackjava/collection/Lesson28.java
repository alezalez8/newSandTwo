package com.company.blackjava.collection;

import java.util.LinkedHashMap;

public class Lesson28 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("vasya", 2200, 23);
        Employee emp2 = new Employee("yura", 2400, 35);
        Employee emp3 = new Employee("gena", 1200, 18);
        Employee emp4 = new Employee("maks", 1900, 25);
        Employee emp5 = new Employee("kolya", 2800, 43);
        Employee emp6 = new Employee("igor", 4400, 52);
        Employee emp7 = new Employee("aleks", 4200, 49);
        Employee emp8 = new Employee("ira", 2700, 29);
        Employee emp9 = new Employee("lena", 5200, 51);
        Employee emp10 = new Employee("jana", 5500, 53);
        Employee emp11 = new Employee("petya", 2900, 43);


        LinkedHashMap<Double, Employee> linkedHashMap =
                new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(5.4, emp1);
        linkedHashMap.put(8.4, emp2);
        linkedHashMap.put(7.2, emp3);
        linkedHashMap.put(14.4, emp4);
        /*linkedHashMap.put(3.3, emp5);
        linkedHashMap.put(9.4, emp6);
        linkedHashMap.put(88.5, emp7);
        linkedHashMap.put(2.8, emp8);
        linkedHashMap.put(1.8, emp5);*/

        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(8.4));
        System.out.println(linkedHashMap.get(7.2));
        System.out.println(linkedHashMap.get(8.4));
        System.out.println(linkedHashMap);


       /* TreeMap<Employee, Double> treeMap1 = new TreeMap<>();
        treeMap1.put(emp1, 23.2);
        treeMap1.put(emp2, 33.2);
        treeMap1.put(emp3, 13.2);
        System.out.println(treeMap1);


        System.out.println(treeMap);
        System.out.println(treeMap.get(88.5));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.headMap(9.4));
        System.out.println(treeMap.lastEntry());*/






       /* List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);
        employees.add(emp9);
        employees.add(emp10);
        employees.add(emp11);*/
    }
}
