package javatraining.day7.exceptions.finallyexamples;

public class FinallyUnconditional {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
//            return;
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println("----------------------------------");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
            return;
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
