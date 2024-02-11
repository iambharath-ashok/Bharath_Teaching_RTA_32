package javatraining.day7.exceptions.throwkeyword;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}

//Compile-time Exception
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}
