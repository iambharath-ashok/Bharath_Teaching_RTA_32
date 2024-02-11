package javatraining.day17.java8.methodreferences.referencetostaticmethod;

import java.util.Arrays;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Example 1: Using a static method from the Arrays class
        String[] array = {"apple", "banana", "orange", "kiwi"};
        
        // Using lambda expression
        Arrays.sort(array, (s1, s2) -> StringHelper.compareByLength(s1, s2));
        System.out.println(Arrays.toString(array));
        
        // Using method reference
        Arrays.sort(array, StringHelper::compareByLength);
        System.out.println(Arrays.toString(array));
        
        // Example 2: Using a static method from a custom class
        // Let's assume StringHelper class has a static method called printUpperCase
        Arrays.asList(array).forEach(StringHelper::printUpperCase);
    }
}

class StringHelper {
    // Static method to compare strings by length
    public static int compareByLength(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }
    
    // Static method to print a string in upper case
    public static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
}
