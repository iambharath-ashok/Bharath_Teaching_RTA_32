package javatraining.day17.java8.defaultmethods;

interface Shape {
    double calculateArea();

    default void printInfo() {
        System.out.println("This is a shape.");
    }

    static void printDescription() {
        System.out.println("Shapes are geometric figures.");
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("This is a circle.");
    }
}

class Rectangle implements Shape {

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void printInfo() {
        System.out.println("This is a rectangle.");
    }
}

public class InterfaceMethodsExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.printInfo();
        System.out.println("Area: " + circle.calculateArea());

        Shape.printDescription(); // Calling static method

        Shape rectangle = new Rectangle();;
        rectangle.printInfo();
    }
}
