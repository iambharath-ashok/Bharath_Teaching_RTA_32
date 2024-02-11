package javatraining.day3.polymorphism;

// Superclass
class Animal {

    // makeSound is overloaded within Animal Class
    void makeSound() {
        System.out.println("Animal makes a sound");
    }

    void makeSound(String sound) {
        System.out.println("making sound" + sound);
    }
}

// Subclass 1
class Dog extends Animal {

    //makeSound() is inherited from parent class Animal and Provided new Implementation in the sub class.
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}


class Lion extends  Animal {
    @Override
    void makeSound() {
        System.out.println("Lion Roars");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Output: Dog barks
        animal2.makeSound(); // Output: Cat meows

        animal1 = new Lion();
        animal1.makeSound();
    }
}
