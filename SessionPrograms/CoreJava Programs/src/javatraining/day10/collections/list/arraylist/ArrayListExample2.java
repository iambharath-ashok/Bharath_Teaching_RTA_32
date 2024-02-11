package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArrayListExample2 {
    public static void main(String[] args) {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        Set<Integer> integerSet = Set.of(1,2,3,4,5);

        numbers1.addAll(numbers2); // Adding all elements from numbers2 to numbers1
        numbers1.addAll(integerSet); // Adding all elements from numbers2 to numbers1

        System.out.println("Combined list: " + numbers1);
    }
}
