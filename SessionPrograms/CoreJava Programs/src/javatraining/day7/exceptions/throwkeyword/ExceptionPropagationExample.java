package javatraining.day7.exceptions.throwkeyword;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            performDivision();
        } catch (DivideByZeroExceptionProp e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void performDivision() throws DivideByZeroExceptionProp {
        int result = divide(10, 0);
        System.out.println("Result: " + result);
    }

    public static int divide(int dividend, int divisor) throws DivideByZeroExceptionProp {
        if (divisor == 0) {
            throw new DivideByZeroExceptionProp("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}

class DivideByZeroExceptionProp extends Exception {
    public DivideByZeroExceptionProp(String message) {
        super(message);
    }
}
