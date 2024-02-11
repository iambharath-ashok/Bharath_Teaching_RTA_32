package javatraining.day10.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListUniqueMethodsExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Adding elements at the beginning of the list
        linkedList.addFirst("First");
        linkedList.addFirst("New First");
        
        // Adding elements at the end of the list
        linkedList.addLast("Last");
        linkedList.addLast("New Last");
        
        // Display the list
        System.out.println("LinkedList: " + linkedList);
        
        // Retrieving and removing the first element
        String firstElement = linkedList.removeFirst();
        System.out.println("Removed First: " + firstElement);
        
        // Retrieving and removing the last element
        String lastElement = linkedList.removeLast();
        System.out.println("Removed Last: " + lastElement);
        
        // Display the modified list
        System.out.println("Modified LinkedList: " + linkedList);
    }
}
