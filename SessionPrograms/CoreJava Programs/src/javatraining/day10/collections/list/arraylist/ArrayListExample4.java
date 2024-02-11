package javatraining.day10.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListExample4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Green");

        //indexof method
        int indexOfGreen = colors.indexOf("Green");
        int lastIndexOf = colors.lastIndexOf("Green");
        System.out.println("Index of Green: " + indexOfGreen);
    }
}
