package javatraining.day9.com.example.mypackage;

public class ObjectArrayExample {

    public static void main(String[] args) {

        Vehicle car = new Car();
        Object[] objectArray = new Object[]{ "Bharath", 10, 89.0, car };
        objectArray[5] = new Dog();
        System.out.println(objectArray);

        Object[] objectArray2 = new Object[6];
        objectArray[5] = new Dog();
    }
}

interface  Vehicle {

}

class Car implements  Vehicle {

}

class Dog {}
