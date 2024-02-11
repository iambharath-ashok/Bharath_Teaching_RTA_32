package javatraining.day7.exceptions.assignments;

public class Calculator {
    public static void main(String[] args) {
        // Test your divide method here
        double result = divide(10.0, 2.0);
        System.out.println("Result: " + result);

        // Test with denominator as 0
        result = divide(5.0, 0.0);
        System.out.println("Result: " + result);  // This line won't be reached if an exception occurs
    }

    public static double divide(double numerator, double denominator) {
        // Implement division and handle ArithmeticException
        try {
            // Check if the denominator is zero
            if (denominator == 0.0) {
                // If the denominator is zero, throw an ArithmeticException
                throw new ArithmeticException("Cannot divide by zero");
            }

            // If the denominator is not zero, perform the division
            return numerator / denominator;
        } catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.err.println("Error: " + e.getMessage());
            // You can also print the stack trace for more detailed information
            // e.printStackTrace();
            return Double.NaN;  // Return a special value to indicate an error
        }
    }
}
