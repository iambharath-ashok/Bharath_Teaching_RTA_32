package javatraining.day17.java8.defaultmethods;

interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }
}

public class DefaultMethodOverrideExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start(); // Prints "Car is starting."
    }
}
