package javatraining.day4.superandthis;

public abstract class Animal {
    protected String sound;

    public Animal(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Animal sound: " + sound);
    }
}


