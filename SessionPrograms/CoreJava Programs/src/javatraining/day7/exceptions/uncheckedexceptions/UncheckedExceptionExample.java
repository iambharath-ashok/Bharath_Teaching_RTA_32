package javatraining.day7.exceptions.uncheckedexceptions;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };

        try {
            int result = divideNumbers(numbers, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divideNumbers(int[] numbers, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return numbers[0] / divisor;
    }
}
