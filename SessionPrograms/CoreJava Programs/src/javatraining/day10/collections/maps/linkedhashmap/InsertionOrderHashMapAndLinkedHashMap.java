package javatraining.day10.collections.maps.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class InsertionOrderHashMapAndLinkedHashMap {

    public static void main(String[] args) {

        Map<Integer, String> integerStringHashMap = new HashMap<>();

        integerStringHashMap.put(1,"ADB");//Bucket 1
        integerStringHashMap.put(2,"TTT");//Bucket 2
        integerStringHashMap.put(3,"EEE");//Bucket 3
        integerStringHashMap.put(4,"DDD");//Bucket 4
        integerStringHashMap.put(5,"CCC");//Bucket 5
        integerStringHashMap.put(6,"BBB");//Bucket 6
        integerStringHashMap.put(16,"BBB");//Bucket 0
        integerStringHashMap.put(17,"OOO");//Bucket 1

        System.out.println("HashMap Traversal Order");
        Set<Map.Entry<Integer, String>> entrySet = integerStringHashMap.entrySet();
        for (Map.Entry<Integer, String> e : entrySet) {
            System.out.println("Key:: "+ e.getKey() +" Value::"+e.getValue());
        }

        System.out.println("===============================================");
        Map<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();

        integerStringLinkedHashMap.put(1,"ADB");//Bucket 1
        integerStringLinkedHashMap.put(2,"TTT");//Bucket 2
        integerStringLinkedHashMap.put(3,"EEE");//Bucket 3
        integerStringLinkedHashMap.put(4,"DDD");//Bucket 4
        integerStringLinkedHashMap.put(5,"CCC");//Bucket 5
        integerStringLinkedHashMap.put(6,"BBB");//Bucket 6
        integerStringLinkedHashMap.put(16,"BBB");//Bucket 0
        integerStringLinkedHashMap.put(17,"OOO");//Bucket 1

        System.out.println("LinkedHashMap Traversal Order");
        Set<Map.Entry<Integer, String>> eSet = integerStringLinkedHashMap.entrySet();
        for (Map.Entry<Integer, String> e : eSet) {
            System.out.println("Key:: "+ e.getKey() +" Value::"+e.getValue());
        }

    }
}
