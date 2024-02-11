package javatraining.day5.interfaces;

// Interface definition
public interface Animal {
    void sound(); // Abstract method (implicitly public and abstract)
    void eat();   // Abstract method (implicitly public and abstract)

    // Constant variable (implicitly public, static, and final)
    String SPECIES = "Animal";
}
