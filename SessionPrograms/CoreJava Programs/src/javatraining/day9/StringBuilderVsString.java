package javatraining.day9;

public class StringBuilderVsString {

    public static void main(String[] args) {
        String result = "";
        for (long i = 0; i < 9000000000000000l; i++) {
            result = result + i;
        }


        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            resultBuilder.append(i);
        }
        String resultB = resultBuilder.toString();


    }
}
