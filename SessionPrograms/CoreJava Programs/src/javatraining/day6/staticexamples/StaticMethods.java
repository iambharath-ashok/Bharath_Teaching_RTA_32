package javatraining.day6.staticexamples;

class MathUtils {
    protected static int add(int a, int b) {
        return a + b;
    }

    protected  int add (double a, double b) {
        return add(10, 20);
    }
}


public class StaticMethods {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 3);  // Calling the static method
        System.out.println(result);  // Output: 8
        MathUtils mathUtils = new MathUtils();
        mathUtils.add(10.0,20);
    }
}
