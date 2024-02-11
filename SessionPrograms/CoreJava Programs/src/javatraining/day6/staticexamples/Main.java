package javatraining.day6.staticexamples;

class StaticExample {
    static int staticVariable = 90;


    //Static block can be used initialize the static variable of the class.
    static {
        staticVariable = 50;
        System.out.println("Static block executed.");
    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }


}

public class Main {
    public static void main(String[] args) {

        //Static block will always gets executed before Main Method
        System.out.println("Main Method:: "+StaticExample.staticVariable);  // Output: 50


        StaticExample.staticVariable = 100;
        Person p1 = new Person("Ageon", 70);

    }
}
