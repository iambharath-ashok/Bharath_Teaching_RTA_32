package javatraining.day8;

public class MemoryModel {

    public static void main(String[] args) {

        Person person = new Person();
        method1();
        System.out.println("Person");

    }

    public static void method1(){
        int counter = 10;
        System.out.println(counter);
        method2();
    }

    public static void method2() {
        int personAge = 100;
        System.out.println(personAge);
    }

}


class Person {}