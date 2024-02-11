package javatraining.day17.java8.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Peek {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4);

       Long count = integerList.parallelStream().peek(System.out::println).count();
        System.out.println(count);

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }
}
