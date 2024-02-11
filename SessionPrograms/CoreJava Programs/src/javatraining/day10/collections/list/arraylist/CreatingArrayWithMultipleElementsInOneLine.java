package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingArrayWithMultipleElementsInOneLine {

    public static void main(String[] args) {

        List<String> fruitsList = List.of("Banana", "Apple", "Grapes", "Banana");
        List<String> fruitsListNonImmutable = new ArrayList<>(Arrays.asList("Banana", "Apple", "Grapes", "Banana"));
        System.out.println(fruitsList.indexOf("Banana"));
        System.out.println(fruitsList.lastIndexOf("Banana"));

        System.out.println(fruitsListNonImmutable);;
      //  fruitsList.add("Cranberry");

        fruitsListNonImmutable.add("Cranberry");
        System.out.println(fruitsListNonImmutable);



    }
}
