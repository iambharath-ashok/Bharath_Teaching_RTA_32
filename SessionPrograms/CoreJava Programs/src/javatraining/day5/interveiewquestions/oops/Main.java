package javatraining.day5.interveiewquestions.oops;

class Parent {
    private int value;

    // Superclass constructor
    Parent(int value) {
        this.value = value;
        System.out.println("Parent constructor called");
    }

    void display() {
        System.out.println("Value from Parent: " + value);
    }
}

class Child extends Parent {
    // Subclass constructor
    Child(int value) {
        super(value);  // Calling the superclass constructor
        System.out.println("Child constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child(5);
        child.display();
    }
}
