package javatraining.day5.interfaces;

// Interface for a printable object
interface Printable {
    void print();
}

// Interface for a scannable object
interface Scannable {
    void scan();
}

// Class implementing both Printable and Scannable interfaces
class MultiFunctionPrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

public class MultipleInterfacesExample {
    public static void main(String[] args) {
        MultiFunctionPrinter printer = new MultiFunctionPrinter();
        printer.print(); // Output: Printing...
        printer.scan();  // Output: Scanning...
    }
}
