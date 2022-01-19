package com.company.blackjava.generics;

import com.company.blackjava.collection.Employee;

import java.util.*;

public class ArrTest {
    public static void main(String[] args) {
        int[] dest = {5, 3, 5, 9, 12, 34, 11, 56, 2};
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

        TreeMap<Double, Employee> treeMap = new TreeMap<>();
        treeMap.put(5.4, emp1);
        treeMap.put(8.4, emp2);
        treeMap.put(7.2, emp3);
        treeMap.put(14.4, emp4);
        treeMap.put(3.3, emp5);
        treeMap.put(9.4, emp6);
        treeMap.put(88.5, emp7);
        treeMap.put(2.8, emp8);
        treeMap.put(1.8, emp5);

        TreeMap<Employee, Double> treeMap1 = new TreeMap<>();
        treeMap1.put(emp1, 23.2);
        treeMap1.put(emp2, 33.2);
        treeMap1.put(emp3, 13.2);
        System.out.println(treeMap1);


        System.out.println(treeMap);
        System.out.println(treeMap.get(88.5));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.headMap(9.4));
        System.out.println(treeMap.lastEntry());






        List<Employee> employees = new ArrayList<>();
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
        employees.add(emp11);

       /* System.out.println(employees);
        System.out.println("after sorting");
        Collections.sort(employees);
        System.out.println(employees);

        int index = Collections.binarySearch(employees, new Employee("ira", 2900, 29));
        System.out.println("Index = " + index);
        System.out.println("==================================");
        System.out.println(Arrays.toString(dest));
        Arrays.sort(dest);
        System.out.println(Arrays.toString(dest));
        int index2 = Arrays.binarySearch(dest, 12);
        System.out.println(index2);
        Collections.shuffle(employees);
        System.out.println(employees);
*/

        // System.out.println(Arrays.toString(dest));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        Collections.sort(list);

        int index3 = Collections.binarySearch(list, 5);
       // System.out.println(index);

       /* System.out.println("Array is " + list);
        //List<Integer> subl = list.subList(1, 4);
       // System.out.println(subl);
        list.add(7);
        System.out.println("Array is " + list);
       // list.subList(1, 4).clear();
       // System.out.println(list);
        Object[] arrayObject = list.toArray();
        System.out.println(arrayObject);
        Integer[] list2 = list.toArray(new Integer[0]);
        for (Integer s:list2
             ) {
            System.out.println(s);

        }


        System.out.println("===========================================");
       *//* (new Random())
                .ints()
                .limit(10)
                .sorted()
                .forEach(System.out::println);*//*


        System.out.println("Всего элементов  " + (new Random())
                .ints(10)
                //.limit(10)
                .sorted()
                .peek(s -> System.out.print(s + ";    "))
                .count());
    }*/
    }
}
