package javatraining.day3.abstraction;

// Abstract class
abstract class Shape {
    protected String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Abstract method to calculate area
    public abstract double calculateArea();

    // Concrete method to display color
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Concrete subclass
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementation of abstract method to calculate area
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method to calculate area
    @Override
    public double calculateArea() {
        return length * width;
    }
}



//Users View
public class AbstractionExample1 {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);

        circle.displayColor();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.displayColor();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}
