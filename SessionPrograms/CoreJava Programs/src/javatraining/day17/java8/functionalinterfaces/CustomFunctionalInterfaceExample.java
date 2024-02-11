package javatraining.day17.java8.functionalinterfaces;

import java.util.function.Predicate;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}


public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        MathOperation addition = getOperationType("ADD");
        MathOperation subtraction = getOperationType("SUB");
        MathOperation multiplication = getOperationType("MUL");

        int num1 = 10;
        int num2 = 5;

        int resultAddition = performOperation(num1, num2, addition);
        int resultSubtraction = performOperation(num1, num2, subtraction);
        int resultMultiplication = performOperation(num1, num2, multiplication);

        System.out.println("Result of addition: " + resultAddition);
        System.out.println("Result of subtraction: " + resultSubtraction);
        System.out.println("Result of Multiplication: " + resultMultiplication);
    }

    public static int performOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    public static MathOperation getOperationType (String operationType) {
        switch (operationType) {
            case "ADD":
                return (a, b) -> a + b;
            case "SUB":
                return (a, b) -> a - b;
            case "MUL":
                return (a, b) -> a * b;

        }
        return null;
    }
}
