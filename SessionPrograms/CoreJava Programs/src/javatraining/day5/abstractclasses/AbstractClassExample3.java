package javatraining.day5.abstractclasses;

// Abstract class for an Animal
abstract class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    // Abstract method for animal sound
    public abstract void makeSound();

    // Concrete method to display animal species
    public void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

// Concrete subclass Dog inheriting from Animal
class Dog extends Animal {
    public Dog(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Concrete subclass Cat inheriting from Animal
class Cat extends Animal {
    public Cat(String species) {
        super(species);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbstractClassExample3 {
    public static void main(String[] args) {
        Animal dog = new Dog("Canine");
        Animal cat = new Cat("Feline");

        dog.displaySpecies();
        dog.makeSound();

        cat.displaySpecies();
        cat.makeSound();
    }
}
