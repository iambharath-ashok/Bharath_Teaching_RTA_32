package javatraining.day10.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListMethodsExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the end of the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(4);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);

        // Add an element at the beginning of the list
        numbers.addFirst(5);

        // Add an element at a specific index
        numbers.add(2, 15);

        // Display the list
        System.out.println("LinkedList: " + numbers);

        // Access elements using get()
        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Modify an element
        numbers.set(3, 25);

        // Remove elements by index
        numbers.remove(1);

        // Remove the first element
        numbers.removeFirst();

        // Display the modified list
        System.out.println("Modified LinkedList: " + numbers);

        // Check if an element exists in the list
        boolean containsTwentyFive = numbers.contains(25);
        System.out.println("Contains 25? " + containsTwentyFive);

        // Get the index of an element
        int indexOfTwentyFive = numbers.indexOf(25);
        System.out.println("Index of 25: " + indexOfTwentyFive);

        // Get the size of the list
        int size = numbers.size();
        System.out.println("Size of LinkedList: " + size);

        // Clear all elements from the list
        numbers.clear();
        System.out.println("Cleared LinkedList: " + numbers);
    }
}
