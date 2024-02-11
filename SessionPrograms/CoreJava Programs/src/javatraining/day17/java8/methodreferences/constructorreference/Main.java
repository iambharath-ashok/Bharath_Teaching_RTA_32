package javatraining.day17.java8.methodreferences.constructorreference;

import java.util.function.Supplier;

class Person {
    private String name;

    //Constructor
    public Person(String name) {
        this.name = name;
    }

    // Zero Argument Constructor
    public Person() {

    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Person p = new Person();


        // Using a lambda expression to create Person objects
        Supplier<Person> personSupplier1 = () -> new Person("Alice");

        // Using a constructor reference to create Person objects
        Supplier<Person> personSupplier2 = Person::new;

        // Create Person objects using both approaches
        Person person1 = personSupplier1.get();
        Person person2 = personSupplier2.get();

        System.out.println("Person 1 Name: " + person1.getName());
        System.out.println("Person 2 Name: " + person2.getName());
    }
}
