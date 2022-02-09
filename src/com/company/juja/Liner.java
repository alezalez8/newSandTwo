package com.company.juja;

public class Liner extends AbstractShip1 {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public static void main(String[] args) {
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;
        float testRentTaxNegative=-1;

        Liner liner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
        System.out.println(liner.getName());
    }



    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    public float calculatePayment(float rentTax) {
        float result = 0f;
        if (rentTax <= 0) {
            rentTax = DEFAULT_RENTAL;
        }
                result = passengers * rentTax;
        return result;
    }
    public float calculatePayment() {
        float result = 0f;
        result = passengers * DEFAULT_RENTAL;
        return result;
    }




}

abstract class AbstractShip1 {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip1(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }
}
