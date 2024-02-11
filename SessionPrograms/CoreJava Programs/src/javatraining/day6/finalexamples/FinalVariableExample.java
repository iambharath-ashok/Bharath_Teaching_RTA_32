package javatraining.day6.finalexamples;

public class FinalVariableExample {

    private static final int MAX_SCORE = 999;


    public static void main(String[] args) {
        final int VALUE_MAX = 10; // Final variables are used to define the Constant in Programs
        // value = 20; // This will result in a compilation error
        System.out.println("Final value: " + VALUE_MAX);
    }
}
