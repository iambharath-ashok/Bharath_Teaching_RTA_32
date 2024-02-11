package javatraining.day7.exceptions.throwkeyword;

public class ThrowNewCompileTimeExcpetion {

    public static void main(String[] args)  {
        int dividend = 100;
        int divisor = 0;
        int result = 0;

        try {
            result = divideTheNumbersWithCompiletimeCheck(dividend, divisor);
        } catch (Exception e) {
            System.out.println("Excpetion...");
        }


        result = divideTheNumbers(dividend, divisor);
        System.out.println("Result :: "+result);
    }

    public static int divideTheNumbers(int dividend, int divisor) {
        if(divisor == 0) {
            throw new RuntimeException("Arithmatic Excpetion");
        }
        return dividend/divisor;
    }


    public static int divideTheNumbersWithCompiletimeCheck(int dividend, int divisor) throws Exception {
        if(divisor == 0) {
            throw new Exception("Arithmatic Excpetion");
        }
        return dividend/divisor;
    }
}
