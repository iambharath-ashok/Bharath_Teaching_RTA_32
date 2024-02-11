package javatraining.day5.methodhiding;

 class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Cat extends Animal {
   // @Override
    public  void makeSound() {
        System.out.println("Meow");
    }
}

public class MethodOverridingExample {

     public static class Person {

     }

     public static  String personName = "";



    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.makeSound(); // Output: Generic animal sound
        cat.makeSound();    // Output: Meow


    }
}
