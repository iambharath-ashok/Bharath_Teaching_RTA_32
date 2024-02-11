package javatraining.day3.abstraction;



abstract class Animal {
    public abstract void makeSound();//Method Signature
}

class Lion extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Lion Roars");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}
public class AbstractionExample3 {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();;
        animal = new Lion();
        animal.makeSound();;
    }
}
