package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store student names
        List<String> studentNames = new ArrayList<>(200);
        System.out.println(studentNames.size());

        Object[] objectArray = new Object[200];
        System.out.println(objectArray.length);

        // Adding elements to the ArrayList
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("bharath");

        if(studentNames.size() > 100) {
            studentNames.get(88);
        }



        System.out.println(studentNames);

        // Displaying the initial list
        System.out.println("Initial student names: " + studentNames);

        // Accessing elements using get() method
        String firstStudent = studentNames.get(0);
        System.out.println("First student: " + firstStudent);

        // Modifying an element using set() method
        studentNames.set(1, "Eve");
        System.out.println("Modified student names: " + studentNames);

        // Adding an element at a specific index using add() method
        studentNames.add(1, "David");
        System.out.println("After adding David: " + studentNames);

        // Removing an element using remove() method
        studentNames.remove(200);
        System.out.println("After removing Charlie: " + studentNames);

        // Checking if the ArrayList is empty
        boolean isEmpty = studentNames.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Getting the size of the ArrayList
        int size = studentNames.size();
        System.out.println("Number of students: " + size);
    }
}
