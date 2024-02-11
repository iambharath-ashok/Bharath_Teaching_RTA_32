package javatraining.day17.java8.lambda;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class PersonSortingExample {
    public static void main(String[] args) {
        List<Person> peopleList = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 31),
            new Person("Charlie", 22),
            new Person("David", 30)
        );

        // Sort the list of people by age and then by name
        peopleList.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));
/*
        Function<Person, String> function = p -> p.getName();
        ToIntFunction<Person> personAgeIntFunction = p -> p.getAge();

        peopleList.sort(Comparator.comparingInt(personAgeIntFunction).thenComparing(function));

        */

        Function<Person, Integer> function = person -> person.getAge();

        List<Integer> ageList =  peopleList.stream().map(function).collect(Collectors.toList());

        peopleList.stream().map(function).forEach(System.out::println);

        // Print the sorted list
//        for (Person person : peopleList) {
//            System.out.println(person);
//        }
    }
}
