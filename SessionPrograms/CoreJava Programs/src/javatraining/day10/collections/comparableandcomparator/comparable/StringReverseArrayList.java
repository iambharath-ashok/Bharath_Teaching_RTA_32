package javatraining.day10.collections.comparableandcomparator.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverseArrayList {

    public static void main(String[] args) {
        String revString = "I am Priyanka";
        List<String> words = Arrays.asList(revString.split("\\s"));
        System.out.println("words : " + words);
        Collections.reverse(words);
        System.out.println("after reverse :" + words);



        for(String word : words) {

            List<String> list = Arrays.asList(word.split(""));

            Collections.reverse(list);
            System.out.println(list);

        }




    }
}
