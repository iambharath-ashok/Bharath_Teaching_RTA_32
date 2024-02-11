package javatraining.day3.inheritance;

class Animal {
    String species;

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog() {
        this.species = "Dog";
    }

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    Cat() {
        this.species = "Cat";
    }

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound(); // Output: Dog barks
        cat.makeSound(); // Output: Cat meows
        animal.makeSound();

        Animal golderRetriever = new Dog();
        Animal turkishCat = new Cat();


        System.out.println("================================");
        golderRetriever.makeSound(); //
        turkishCat.makeSound();//
    }
}
