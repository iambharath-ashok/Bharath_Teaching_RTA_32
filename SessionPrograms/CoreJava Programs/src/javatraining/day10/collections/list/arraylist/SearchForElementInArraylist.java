package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SearchForElementInArraylist {

    public static void main(String[] args) {

        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Kiwi");
        fruitsList.add("Blue Berry");
        fruitsList.add("Gozi Berry");



        if(fruitsList.contains("Kiwi")) {
            System.out.println(fruitsList.indexOf("Kiwi"));
        }

        System.out.println(fruitsList.indexOf("Kiwi Fruit"));
        fruitsList.add("Cranberry");
        System.out.println(fruitsList);
    }
}
