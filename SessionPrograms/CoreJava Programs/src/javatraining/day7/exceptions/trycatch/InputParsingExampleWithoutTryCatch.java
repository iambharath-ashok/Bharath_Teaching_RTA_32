package javatraining.day7.exceptions.trycatch;

public class InputParsingExampleWithoutTryCatch {

    public static void main(String[] args) {
        System.out.println("Main Started");
        String input = "abc";
        int number = Integer.parseInt(input);
        System.out.println("Parsed Input Value:: " +number);
        System.out.println("Main End");

    }
}
