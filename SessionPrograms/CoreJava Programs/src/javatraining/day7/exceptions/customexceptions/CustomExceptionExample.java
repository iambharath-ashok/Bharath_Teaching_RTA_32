package javatraining.day7.exceptions.customexceptions;

class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom exception occurred");
        } catch (CustomException | RuntimeException e) {
            System.out.println("Custom exception caught: " + e);
        }
    }
}
