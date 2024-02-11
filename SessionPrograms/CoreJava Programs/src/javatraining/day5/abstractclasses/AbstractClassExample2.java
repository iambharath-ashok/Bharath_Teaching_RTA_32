package javatraining.day5.abstractclasses;

// Abstract class for a Vehicle
abstract class Vehicle {
    private String model;

    public Vehicle(String model) {
        this.model = model;
    }

    // Abstract method to start the vehicle
    public abstract void start();

    // Abstract method to stop the vehicle
    public abstract void stop();

    // Concrete method to display the vehicle model
    public void displayModel() {
        System.out.println("Model: " + model);
    }
}

// Concrete subclass Car inheriting from Vehicle
class Car extends Vehicle {
    public Car(String model) {
        //super();
        super(model);
    }


    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Concrete subclass Bike inheriting from Vehicle
class Bike extends Vehicle {
    public Bike(String model) {
        super(model);
    }

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Honda");

        car.displayModel();
        car.start();
        car.stop();

        bike.displayModel();
        bike.start();
        bike.stop();
    }
}
