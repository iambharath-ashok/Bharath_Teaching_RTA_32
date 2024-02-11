package javatraining.day5.interfaces;

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal human = new Human();


        dog.sound(); // Output: Dog barks
        dog.eat();   // Output: Dog eats bones

        cat.sound(); // Output: Dog barks
        cat.eat();   // Output: Dog eats bones

        human.sound(); // Output: Dog barks
        human.eat();   // Output: Dog eats bones
       // System.out.println("Animal species: " + Animal.SPECIES); // Output: Animal species: Animal
    }
}
