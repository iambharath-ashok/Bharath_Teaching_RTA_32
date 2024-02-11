package javatraining.day7.exceptions.trycatch;

public class InputParsingExample {

    public static void main(String[] args) {
        System.out.println("main started");
        try {
            String input = "100";
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch ( NumberFormatException  e) {
            System.out.println("Input parsing exception: " + e);
        }
        System.out.println("main end");
    }
}
