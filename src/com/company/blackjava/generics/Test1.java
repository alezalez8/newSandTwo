package com.company.blackjava.generics;

import java.util.ArrayList;

public class Test1 {


    public static void main(String[] args) {

        Car<String> car1 = new Car<>("honda");
        Car<Integer> car2 = new Car<>(12);
        NewCar<Integer, String> car3 = new NewCar<>(1, "bmv");
        System.out.println(car3.getValue1());
        System.out.println(car3.getValue2());

    }

    public void aaa1(Car<String> value) {
        String s = value.getValue();
    }

    public void aaa(Car<Integer> value) {
        Integer i = value.getValue();
    }

    public double summ(ArrayList<? extends Number> array) {
        double sum = 0;
        for (Number i : array
        ) {
            sum += i.doubleValue();
        }
        return sum;
    }

    public  <K extends Number>  K summ1(ArrayList<K> array) {
        double sum = 0;
        for (Number i : array
        ) {
            sum += i.doubleValue();
        }
        return null;
    }

}

class Car<T> {
    private T value;

    public Car(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public <K extends Number> K sdff(ArrayList<K> varaa) {
        K k = null;
        return k;
    }


}

interface I1 {

}

interface I2 {

}

class Dagag<U extends I1 & I2> {

}


class NewCar<V1, V2> {
    private V1 value1;
    private V2 value2;

    public NewCar(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 gagag(ArrayList<V1> arrayList) {
        return arrayList.get(1);
    }

    public V1 getValue1() {
        return value1;
    }

    public void setValue1(V1 value1) {
        this.value1 = value1;
    }

    public V2 getValue2() {
        return value2;
    }

    public void setValue2(V2 value2) {
        this.value2 = value2;
    }
}

