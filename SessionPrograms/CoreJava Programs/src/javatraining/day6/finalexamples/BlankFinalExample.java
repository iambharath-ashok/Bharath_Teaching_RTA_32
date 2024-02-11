package javatraining.day6.finalexamples;

public class BlankFinalExample {
    private final int blankFinalField;

    public BlankFinalExample() {
        // The blank final field must be assigned a value in the constructor
        blankFinalField = 42;
    }

    public int getBlankFinalField() {
        return blankFinalField;
    }

    public static void main(String[] args) {
        BlankFinalExample blankFinalExample = new BlankFinalExample();


    }
}
