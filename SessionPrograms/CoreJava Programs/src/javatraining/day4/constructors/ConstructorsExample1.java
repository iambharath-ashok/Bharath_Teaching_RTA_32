package javatraining.day4.constructors;

class Person {
    String name;
    int age;


    //Parameterized Constructors
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Person() {

    }

    // Default Constructor
//    Person() {
//        name = null;
//        age = 0;
//    }
}

public class ConstructorsExample1 {
    public static void main(String[] args) {
        Person person = new Person();

        Person person2 = new Person("Ramya", 30);

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

        person.name = "Bharath";
        for(int i =0;i < 5;i++) {
            System.out.println("I Value:: " + i);
        }

        person.age = 27;

        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
    }
}
