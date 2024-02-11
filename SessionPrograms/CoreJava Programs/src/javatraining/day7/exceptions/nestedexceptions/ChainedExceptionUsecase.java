package javatraining.day7.exceptions.nestedexceptions;

public class ChainedExceptionUsecase {
    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception ex) {
            System.out.println("Chained Exception: " + ex.getMessage());
            System.out.println("Original Cause: " + ex.getCause().getMessage());
        }
    }
    public static void methodA() throws Exception {
        try {
            methodB();
        } catch (Exception innerEx) {
            throw new Exception("Exception in methodA", innerEx);
        }
    }
    public static void methodB() throws Exception {
        throw new Exception("Exception in methodB");
    }
}
