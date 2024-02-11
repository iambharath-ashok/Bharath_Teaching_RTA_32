package javatraining.day10.collections.set.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordFrequencyExample {
    public static void main(String[] args) {
        String text = "This is a simple example. This is just a test.";

        String[] words = text.split(" ");
        Set<String> uniqueWords = new HashSet<>();
        for (String word: words) {
            uniqueWords.add(word);
        }

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[.,]", "");
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency: " + wordFrequency.keySet());
        System.out.println("Word Frequency: " + wordFrequency);
    }
}
