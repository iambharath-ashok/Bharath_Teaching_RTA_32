package javatraining.day17.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CustomLambdaExpressionExamples {

    public static void main(String[] args) {

        List<String> personNameList = List.of("Bharath", "Hema", "Bikash", "Kavya");

        Predicate<String> predicate = nm -> nm.isEmpty();
        Function<String, Integer> personNameLengthFunction = name -> name.length();


        Function<String, Integer> personNameLengthFunctionWithBody = (name) -> {
           return name.length();
        };

        Function<Integer, String> integerToString = (integerValue) -> {
            return String.valueOf(integerValue);
        };


        for (String personName : personNameList){
            System.out.println("Person:: "+personName+" :- "+personNameLengthFunction.apply(personName));
        }


    }
}
