package javatraining.assignments.oops.inheritanceandpolymorphism;

// Base class
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }

    public String getColor() {
        return color;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array of Shape objects containing instances of Circle, Rectangle, and Triangle
        Shape[] shapes = {
            new Circle("Red", 5.0),
            new Rectangle("Blue", 4.0, 6.0),
            new Triangle("Green", 3.0, 8.0)
        };

        // Iterate through the array and display the area of each shape
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColor());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println();
        }
    }
}
