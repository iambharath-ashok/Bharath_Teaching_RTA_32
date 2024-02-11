package javatraining.day17.java8.defaultmethods;

public class Java7Example implements Printer, ColorPrinter {
    @Override
    public void print() {
        System.out.println("Printing");
    }

    @Override
    public void scan() {
        System.out.println("Scanning");
        wifi();
    }

    @Override
    public void wifi() {
        ColorPrinter.super.wifi();
    }


}


interface Printer {
    void print();

    void scan();

    default void airDrop() {

    }

    default void wifi() {
        System.out.println("Printer Connecting to Wifi");
    }

}

interface ColorPrinter {
    void print();

    void scan();

    default void wifi(){
        System.out.println("Color Printer Connecting to Wifi");
    }
}

class Main {
    public static void main(String[] args) {
        Java7Example java7Example = new Java7Example();
        java7Example.scan();
        java7Example.print();
    }
}
