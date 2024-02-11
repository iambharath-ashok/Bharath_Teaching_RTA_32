package javatraining.day10.collections.maps.commonmethods;

import java.util.*;

public class MapMethodsExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        // Adding key-value pairs
        scores.put("Alice", 95);
        scores.put("Bob", 80);

        // Retrieving values
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Checking if a key exists
        boolean hasBob = scores.containsKey("Bob");
        System.out.println("Has Bob: " + hasBob);

        // Checking if a value exists
        boolean hasHighScore = scores.containsValue(95);
        System.out.println("Has high score: " + hasHighScore);

        // Getting the number of key-value pairs
        int size = scores.size();
        System.out.println("Number of entries: " + size);

        // Getting all keys
        Set<String> keys = scores.keySet();
        System.out.println("Keys: " + keys);

        // Getting all values
        Collection<Integer> values = scores.values();
        System.out.println("Values: " + values);

        // Getting all key-value pairs
        Set<Map.Entry<String, Integer>> entries = scores.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing a key-value pair
        scores.remove("Alice");
        System.out.println("After removing Alice: " + scores);

        // Copying key-value pairs from another map
        Map<String, Integer> additionalScores = new HashMap<>();
        additionalScores.put("Eve", 70);
        scores.putAll(additionalScores);
        System.out.println("After adding more scores: " + scores);

        // Clearing the map
        scores.clear();
        System.out.println("After clearing: " + scores);
    }
}
