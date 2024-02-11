package javatraining.day10.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 10 * result + age;
        return result;
    }
}


public class RemoveDuplicatesFromCollectionExample {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Alice", 25)); // Duplicate
        people.add(new Person("Charlie", 28));

        System.out.println("Unique People: " + people);
    }
}
