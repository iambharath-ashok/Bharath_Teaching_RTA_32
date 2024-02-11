package javatraining.day17.java8.staticmethods;

import java.util.Arrays;

interface MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
    static int subtract(int a, int b) {
        return a - b;
    }
    static int calculateSum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}



public class StaticMethodComplexExample {
    public static void main(String[] args) {
        int sum = MathUtil.calculateSum(1, 2, 3, 4, 5); // Sum of numbers
        int result = MathUtil.add(sum, 10); // Add 10 to the sum
        result = MathUtil.subtract(result, 3); // subtract 3 from result
        System.out.println("Result: " + result); // Prints "Result: 25"
    }
}
