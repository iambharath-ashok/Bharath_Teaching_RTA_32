package javatraining.day10.collections.maps.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "This is a simple example. This is just a test.";
        String[] words = text.split("\\s+");

        // Java 8
        Map<String, Integer> wordFrequency = new LinkedHashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        //Before 8
        for (String word : words) {
            word = word.toLowerCase();
            if(wordFrequency.containsKey(word)) {
                int currentWordCount = wordFrequency.get(word);
                wordFrequency.put(word, currentWordCount + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

        // Display word frequencies
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
