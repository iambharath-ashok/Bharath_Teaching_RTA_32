package javatraining.day10.collections.traversal.failsafeiterators;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Apple", true);
        concurrentHashMap.put("Banana", true);
        concurrentHashMap.put("Orange", true);

        concurrentHashMap.values();


        // Concurrent modification by another thread
        new Thread(() -> {
            concurrentHashMap.put("Grapes", true); // segment -5
            concurrentHashMap.remove("Banana"); // segment - 7
        }).start();

        // Main Thread can still able to read the values
        // Iterating using an iterator (safe in ConcurrentHashMap)
        Iterator<String> iterator = concurrentHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Fruit: " + fruit);
        }
    }
}
