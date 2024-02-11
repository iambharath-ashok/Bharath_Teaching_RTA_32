package javatraining.day10.collections.maps.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> cache = new LRUCache<>(3);
        cache.put("apple", 5);
        cache.put("banana", 3);
        cache.put("cherry", 7);
        System.out.println(cache);
        cache.put("mango", 17);
        System.out.println(cache);
        cache.get("apple");
        System.out.println(cache);
    }
}
