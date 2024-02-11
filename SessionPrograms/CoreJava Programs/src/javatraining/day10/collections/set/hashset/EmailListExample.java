package javatraining.day10.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class EmailListExample {
    public static void main(String[] args) {
        Set<String> uniqueEmails = new HashSet<>();

        uniqueEmails.add("user@example.com");
        uniqueEmails.add("anotheruser@example.com");
        uniqueEmails.add("user@example.com"); // Duplicate
        uniqueEmails.add("thirduser@example.com");

        System.out.println("Unique Email Addresses: " + uniqueEmails);
    }
}
