package javatraining.day17.java8.methodreferences.arbitraryobjectofparticulartype;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Person {
    private String name;

    //Constructor
    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }

    public String greet(String greeting) {
        return greeting + ", " + name + "!";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> peoplesList = Arrays.asList(new Person("Alice"),
            new Person("Bob"),
            new Person("Charlie")
        );

        Person p = new Person("Bharath");
        Consumer<String> personLambda = str -> p.greet(str);
        Consumer<String> personMethodReference =  p::greet;

        // Reference to an instance method (getName) of an arbitrary object of a particular type (Person)
        peoplesList.stream()
              .map(Person::getName)
              .forEach(System.out::println);

        //lambda way of above
        peoplesList.stream().map(person -> person.getName()).forEach(System.out::println);


        // Reference to an instance method (printName) of an arbitrary object of a particular type (Person)
        peoplesList.forEach(Person::printName);

        // Reference to an instance method (greet) with arguments of an arbitrary object of a particular type (Person)
        List<String> greetings = peoplesList.stream()
                                      .map(person -> person.greet("Hello"))
                                      .collect(Collectors.toList());

        greetings.forEach(System.out::println);
    }
}
