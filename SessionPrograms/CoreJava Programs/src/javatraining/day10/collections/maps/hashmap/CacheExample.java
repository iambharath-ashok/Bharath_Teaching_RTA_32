package javatraining.day10.collections.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CacheExample {
    private Map<String, String> cache = new HashMap<>();

    public String getValue(String key) {
        String value = cache.get(key);
        if (value == null) {
            value = retrieveValueFromDataSource(key);
            cache.put(key, value);
        }
        return value;
    }

    private String retrieveValueFromDataSource(String key) {
        // Simulate fetching data from a data source
        return "Value for " + key;
    }

    public static void main(String[] args) {
        CacheExample cacheExample = new CacheExample();
        System.out.println(cacheExample.getValue("vedio 1"));
        System.out.println(cacheExample.getValue("vedio 2"));
        System.out.println(cacheExample.getValue("vedio 1"));
    }
}
