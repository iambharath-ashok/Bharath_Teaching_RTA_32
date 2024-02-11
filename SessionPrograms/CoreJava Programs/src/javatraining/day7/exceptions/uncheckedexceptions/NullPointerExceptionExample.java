package javatraining.day7.exceptions.uncheckedexceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String text = null;


        try {
            int length = text.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
