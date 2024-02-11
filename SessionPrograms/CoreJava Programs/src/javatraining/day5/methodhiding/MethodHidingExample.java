package javatraining.day5.methodhiding;



public class MethodHidingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.printType(); // Output: Generic animal
        cat.printType();    // Output: Generic animal (method hiding, not overriding)
    }

    static class Animal {
        public static void printType() {
            System.out.println("Generic animal");
        }

        public void makeSound() {
            System.out.println("Animal");
        }
    }

    static class Cat extends Animal {
        public static void printType() {
            System.out.println("Cat");
        }

        public void makeSound() {
            System.out.println("cat");
        }
    }
}
