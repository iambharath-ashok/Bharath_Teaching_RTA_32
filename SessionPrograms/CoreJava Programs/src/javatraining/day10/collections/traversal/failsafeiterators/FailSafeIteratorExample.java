package javatraining.day10.collections.traversal.failsafeiterators;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        Iterator<Integer> iterator = map.keySet().iterator();

        // Concurrent modification by another thread
        new Thread(() -> {
            map.put(4, "Four");
            map.remove(2);
        }).start();

        // Iterating using a fail-safe iterator
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
