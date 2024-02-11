package javatraining.day17.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, String> functionString = (num) -> "Number: " + num;
        Function<Integer, Integer> integerMultiplicationFunction = (num) -> num * 10;
        Predicate<Integer> filterInteger30 = num -> num != 30;

        List<String> stringList = new ArrayList<>();

       numbers.stream()
                .map(integerMultiplicationFunction)
                .filter(filterInteger30)
                .map(functionString)// map - transform one data type to another data type
                .collect(Collectors.toList());

//       for(Integer i :  Arrays.asList(1, 2, 3, 4, 5)) {
//           System.out.println(i);
//       }

       // System.out.println("Transformed numbers: " + transformedNumbers);
    }
}
