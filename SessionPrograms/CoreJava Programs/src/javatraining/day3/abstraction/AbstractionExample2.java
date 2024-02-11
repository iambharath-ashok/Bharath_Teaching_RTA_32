package javatraining.day3.abstraction;

// Interface
interface Vehicle {

    void start();

    void accelerate();

    void stop();

//    void fly();///2050


    default void fly() {
        System.out.println("default fly");
    }

}

// Concrete class implementing the interface
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }


//    @Override
//    public void fly() {
//        System.out.println("Added Fly functionality to Car");
//    }

}

// Concrete class implementing the interface
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerating");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class AbstractionExample2 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.accelerate();
        car.stop();

        System.out.println("====================");
        bike.start();
        bike.accelerate();
        bike.stop();

        System.out.println("====================");
        car.fly();
        bike.fly();
    }
}
