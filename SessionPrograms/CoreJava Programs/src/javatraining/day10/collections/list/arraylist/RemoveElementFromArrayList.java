package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList {

    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("Apple");
        fruitsList.add("Banana");
        fruitsList.add("Kiwi");
        fruitsList.add("Blue Berry");
        fruitsList.add("Gozi Berry");


        System.out.println(fruitsList);
        fruitsList.remove(1);
        System.out.println(fruitsList);


    }
}
