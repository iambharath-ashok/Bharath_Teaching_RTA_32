package javatraining.day3.polymorphism;


// Example:: Compile Time Polymorphism
class MathOperations {

    int x;
    double d;

    String name;

    // Method Overloading
    // Compile Time Polymorphism will acheived through Method Overloading

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class PolymorphismExample2 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int sum1 = math.add(5, 10);           // Calls the int version of add()
        double sum2 = math.add(3.5, 2.5);    // Calls the double version of add()
        String sum3 = math.add("Hello, ", "world!");  // Calls the String version of add()
        int sum10 = math.add(3, 4, 6);

        System.out.println("Sum1: " + sum1);  // Output: Sum1: 15
        System.out.println("Sum2: " + sum2);  // Output: Sum2: 6.0
        System.out.println("Sum3: " + sum3);  // Output: Sum3: Hello, world!
    }
}
