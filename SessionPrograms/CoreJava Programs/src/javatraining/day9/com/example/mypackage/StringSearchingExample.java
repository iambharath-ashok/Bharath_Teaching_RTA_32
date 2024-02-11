package javatraining.day9.com.example.mypackage;

import java.util.Arrays;

public class StringSearchingExample {


    public static void main(String[] args) {

        String originalString = "Hello WorldGood Morning";

        int indexPosition = originalString.indexOf("Good");

        System.out.println(indexPosition);

        String[] words = originalString.split(" ");

        System.out.println(Arrays.deepToString(words));
    }
}
