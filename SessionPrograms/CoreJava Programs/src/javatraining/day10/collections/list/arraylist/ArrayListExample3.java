package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        //contains method
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Does the list contain Banana? " + hasBanana);
    }
}
