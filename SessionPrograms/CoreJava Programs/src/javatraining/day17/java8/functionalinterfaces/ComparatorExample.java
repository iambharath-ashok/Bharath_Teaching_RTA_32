package javatraining.day17.java8.functionalinterfaces;

import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

        int num1 = 5;
        int num2 = 8;

        int result = comparator.compare(num1, num2);

        if (result < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else if (result > 0) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
