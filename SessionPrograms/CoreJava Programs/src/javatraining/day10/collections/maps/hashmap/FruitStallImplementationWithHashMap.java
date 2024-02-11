package javatraining.day10.collections.maps.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FruitStallImplementationWithHashMap {

    public static void main(String[] args) {

        Map<String, Integer> fruitStockTrackerMap = new HashMap<>();

        fruitStockTrackerMap.put("apple", 7);
        fruitStockTrackerMap.put("Grapes", 6);
        fruitStockTrackerMap.put("Black Currant", 0);
        fruitStockTrackerMap.put("Mango", 15);
        fruitStockTrackerMap.put("Kiwi", 5);
        fruitStockTrackerMap.put("Orange", 2);

        int minimumFruitQuantity = 10;
        int newStockQuantity = 25;

        System.out.println("Current Fruit Stock of the Shop");
        Set<Map.Entry<String, Integer>> fruitEntrySet = fruitStockTrackerMap.entrySet();
        for(Map.Entry<String, Integer> fruitEntry : fruitEntrySet) {
            System.out.println(fruitEntry.getKey() +" :: "+fruitEntry.getValue());
        }

        String[] fruitsArray = {"apple", "banana", "Mango"};

        for (String eachIndividualFruit : fruitsArray) {
            System.out.println(eachIndividualFruit);
        }

        System.out.println("New Fruit Stock after Restocking");
       Set<String> fruitNameSet =  fruitStockTrackerMap.keySet();

       for(String fruit : fruitNameSet) {
           if(fruitStockTrackerMap.get(fruit) < minimumFruitQuantity) {
               fruitStockTrackerMap.put(fruit, newStockQuantity);
           }
       }

        for(Map.Entry<String, Integer> fruitEntry : fruitStockTrackerMap.entrySet()) {
            System.out.println(fruitEntry.getKey() +" :: "+fruitEntry.getValue());
        }


        Collection<Integer> values = fruitStockTrackerMap.values();
        System.out.println("Only values of the Map:: "+values);

        Set<String> fruitSet = fruitStockTrackerMap.keySet();
        System.out.println("Only keys of the Map:: "+fruitSet);

        Set<Map.Entry<String, Integer>> entrySetFruits = fruitStockTrackerMap.entrySet();
        System.out.println("Both keys of the Map:: "+entrySetFruits);



    }
}
