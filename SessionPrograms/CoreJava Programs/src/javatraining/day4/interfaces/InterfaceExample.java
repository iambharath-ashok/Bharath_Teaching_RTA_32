package javatraining.day4.interfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Output: Dog barks
        dog.eat();   // Output: Dog eats bones

        System.out.println("Animal species: " + Animal.SPECIES); // Output: Animal species: Animal
    }
}
