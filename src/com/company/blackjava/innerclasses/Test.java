package com.company.blackjava.innerclasses;

public class Test {

    String color;
    int door;
    Engine engine;
     int forStatic;
    int horsePower;

    private Engine gaga = this.new Engine(32);

    public Test(String color, int door) {
        this.color = color;
        this.door = door;
        this.engine = this.new Engine(horsePower);
        System.out.println("Power is " + this.engine.ttt);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Test{" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;
        private int ttt;


        public Engine(int horsePower) {
            this.horsePower = horsePower;
            forStatic = 5;
            ttt = this.horsePower;
        }

        @Override
        public String toString() {
            return "My engine has " +
                    "horsePower = " + horsePower;
        }
    }


}

class Runner {
    public static void main(String[] args) {

        Test test = new Test("black", 4);
        System.out.println(test);

        Test.Engine engine = test.new Engine(500);
        test.setEngine(engine);
        System.out.println(test);

        Test.Engine engine1 = new Test("red", 2).new Engine(500);
        System.out.println(engine1  );



        /*Test.Engine te = new Test.Engine(240);
        Test test = new Test("black", 4, te);
        System.out.println(te);
        System.out.println(test);*/


    }
}


