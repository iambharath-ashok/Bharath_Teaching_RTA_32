package javatraining.day17.java8.staticmethods;

interface LoggerUtility {
    static void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}

interface StringUtility {
    static boolean isStringEmpty(String inputString) {
        return inputString != null && inputString.length() > 0;
    }
}

public class StaticMethodSimpleExample {
    public static void main(String[] args) {
        LoggerUtility.printMessage("Hello, Static Method!"); // Prints "Message: Hello, Static Method!"
        System.out.println(StringUtility.isStringEmpty(null));;
    }
}
