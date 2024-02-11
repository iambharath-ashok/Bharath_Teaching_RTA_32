package javatraining.day17.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaExpressionExamples {

    public static void main(String[] args) {
        //A lambda that adds two numbers
        //(x, y) -> x + y

       // String name = "Bharath";
        // name1 -> name1.isEmpty();

        //message -> System.out.println(message)

        List<Integer> numbers = Arrays.asList(1, 5, 2, 9, 3);
        Integer max = numbers.stream().max((a, b) -> a.compareTo(b)).get();

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> uppercaseNames = names.stream()
                .filter(name -> !name.isEmpty())
                .filter(name -> name.length() > 4)
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);

      //  Function<Integer, Integer> factorial = n -> n == 0 ? 1 : n * factorial.apply(n - 1);

        IntPredicate isPrime = n -> IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(divisor -> n % divisor == 0);
        List<Integer> primes = IntStream.rangeClosed(2, 100)
                .filter(isPrime)
                .boxed()
                .collect(Collectors.toList());

        List<String> words = Arrays.asList("apple", "banana", "grapefruit", "orange");
        String longestWord = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse("");



    }
}
