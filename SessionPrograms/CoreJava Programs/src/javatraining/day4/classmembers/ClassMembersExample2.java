package javatraining.day4.classmembers;

class MathUtils {
    // Static variable
    static final double PI = 3.14159;

    // Static method
    static int add(int a, int b) {
        return a + b;
    }

    // Static method with parameters and return value
    static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}

public class ClassMembersExample2 {
    public static void main(String[] args) {
        System.out.println("PI: " + MathUtils.PI);

        int sum = MathUtils.add(5, 10);
        System.out.println("Sum: " + sum);

        double circleArea = MathUtils.calculateCircleArea(3.0);
        System.out.println("Circle Area: " + circleArea);
    }
}
