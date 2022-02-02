package com.company.blackjava.nio.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx2 {
    public static void main(String[] args) {
        List<Employee> employees1 = new ArrayList<>();
        Car car = new Car("Hundai", "white");
        Employee employee = new Employee("Aleks", "IT", 49,
                1500, car);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin")
        )) {
            outputStream.writeObject(employee);
            System.out.println("Done!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
