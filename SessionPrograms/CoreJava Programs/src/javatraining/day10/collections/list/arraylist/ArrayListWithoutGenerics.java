package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics {
    public static void main(String[] args) {
        List mixedList = new ArrayList();
        mixedList.add("Alice"); // String
        mixedList.add(42); // Integer
        mixedList.add(3.14); // Double
        mixedList.add(true); // Boolean



        for (Object element : mixedList) {
            if (element instanceof String) {
                System.out.println("String: " + element);
            } else if (element instanceof Integer) {
                System.out.println("Integer: " + element);
            } else if (element instanceof Double) {
                System.out.println("Double: " + element);
            } else if (element instanceof Boolean) {
                System.out.println("Boolean: " + element);
            } else {
                System.out.println("Unknown type: " + element);
            }
        }
    }
}
