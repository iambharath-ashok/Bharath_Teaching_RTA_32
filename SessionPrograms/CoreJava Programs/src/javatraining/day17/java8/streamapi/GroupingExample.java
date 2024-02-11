package javatraining.day17.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Fruits {

    String name;

    Integer count;


    public Fruits(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Integer getCount() {
        return  this.count;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class GroupingExample {
    public static void main(String[] args) {

        Fruits apple = new Fruits("apple", 50);
        Fruits banana = new Fruits("banana", 20);
        Fruits cherry = new Fruits("cherry", 30);
        Fruits dates = new Fruits("dates", 20);
        Fruits fig = new Fruits("fig", 50);
        Fruits grapes = new Fruits("grapes", 30);


        List<Fruits> basketList = Arrays.asList(apple, banana, cherry, dates, fig, grapes);

        Map<Integer, List<Fruits>> groupedByFruitCount = basketList.stream()
                .collect(Collectors.groupingBy(Fruits::getCount));

        System.out.println("Fruits Grouped by Count: " + groupedByFruitCount);

        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "fig","aaa");

        Map<Integer, List<String>> groupedByLength = fruits.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Fruits Grouped by Length: " + groupedByLength);
    }
}
