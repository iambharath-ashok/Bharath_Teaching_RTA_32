package javatraining.day9;

public class StringBuilderExamples {
   int count = 0;
    public static void main(String[] args) {

        StringBuilderExamples stringBuilderExamples = new StringBuilderExamples();
        stringBuilderExamples.count++;


        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", ").append("World");
        stringBuilder.insert(5, "Java ");
        stringBuilder.delete(0, 5);

        String finalString = stringBuilder.toString();
        System.out.println(finalString); // Output: "Java World"

    }
}
