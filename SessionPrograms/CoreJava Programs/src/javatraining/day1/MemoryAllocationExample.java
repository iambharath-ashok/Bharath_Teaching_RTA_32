package javatraining.day1;

public class MemoryAllocationExample {
    public static void main(String[] args) {
        double doubleValue = 123.45678901234567894534534;
        float floatValue = 123.4567890123456789f;

        System.out.println("Double Value: " + doubleValue);
        System.out.println("Float Value: " + floatValue);

        System.out.println("Memory used by double: " + memoryUsed(doubleValue) + " bytes");
        System.out.println("Memory used by float: " + memoryUsed(floatValue) + " bytes");
    }

    public static int memoryUsed(double value) {
        return Double.BYTES;
    }

    public static int memoryUsed(float value) {
        return Float.BYTES;
    }
}
