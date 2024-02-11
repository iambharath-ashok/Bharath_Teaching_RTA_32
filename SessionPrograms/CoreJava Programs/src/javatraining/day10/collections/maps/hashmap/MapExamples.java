package javatraining.day10.collections.maps.hashmap;

import java.util.*;

public class MapExamples {

    public static void main(String[] args) {
        // Creating and using HashMap
        Map<String, Integer> hashMap = new HashMap<>();

//        Map<Integer, Integer> integerMap = new HashMap<>();
//        Map<String, Student> studentMap = new HashMap<>();

        hashMap.put("apple", 5);
        hashMap.put("banana", 3);
        hashMap.put("apple", 10);
        System.out.println(hashMap);


    }
}
