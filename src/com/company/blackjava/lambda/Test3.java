package com.company.blackjava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);

    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("ford", "red", 1.6));
        System.out.println(ourCars);
        System.out.println("==============================================");
        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter name");
            String name = in.nextLine();
            return new User(name);
        };

        changeCar(ourCars.get(0),
                car -> {
                    car.color = "black";
                    car.model = "nissan";
                    car.engine = 2.0;
                });
        System.out.println(ourCars);


/*
        User user1 = userFactory.get();
        User user = userFactory.get();
        System.out.println("1 = " + user1.getName() + "   and 2 = " + user.getName());
*/

    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}

class User {

    private String name;

    String getName() {
        return name;
    }

    User(String n) {
        this.name = n;
    }
}
