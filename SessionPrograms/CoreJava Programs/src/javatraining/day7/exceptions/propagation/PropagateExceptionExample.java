package javatraining.day7.exceptions.propagation;

public class PropagateExceptionExample {
    public static void main(String[] args) {
//        try {
            methodA();
//        } catch (Exception ex) {
//            System.out.println("Exception caught in main: " + ex.getMessage());
//        }
    }
    public static void methodA()  {
        methodB();
    }
    public static void methodB()  {
        try {
            throw new Exception("Exception from methodB");
        } catch ( Exception e) {

        }

    }
}
