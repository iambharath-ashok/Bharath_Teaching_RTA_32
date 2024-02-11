package javatraining.day17.java8.staticmethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface StringUtil {
    static List<String> filterLongStrings(List<String> strings, int maxLength) {
        return strings.stream()
                      .filter(str -> str.length() <= maxLength)
                      .collect(Collectors.toList());
    }
}

public class StaticMethodIntermediateExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange");
        List<String> shortWords = StringUtil.filterLongStrings(words, 5);
        System.out.println("Short words: " + shortWords); // Prints "Short words: [apple, grape, orange]"
    }
}
