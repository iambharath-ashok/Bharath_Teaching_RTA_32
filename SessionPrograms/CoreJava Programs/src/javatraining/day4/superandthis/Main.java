package javatraining.day4.superandthis;

class Vehicle {
    private String type;
    private int year;

    public Vehicle() {
        super();

    }

    // Constructor with one parameter
    public Vehicle(String type) {
        this.type = type;
        this.year = 0; // Default value
    }

     //Constructor with two parameters
    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    // Getter methods...

    public void printDetails() {
        super.hashCode();
        this.year = 100;
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    private String brand;

    // Constructor chaining using 'super' keyword
    public Car(String type, int year, String brand) {
        super();
        //super(type, year); // Call superclass constructor
        this.brand = brand;
        super.printDetails();



    }

    public void printCarDetails() {
        super.printDetails(); // Call superclass method
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 2022, "Toyota");
        car.printCarDetails();
    }
}