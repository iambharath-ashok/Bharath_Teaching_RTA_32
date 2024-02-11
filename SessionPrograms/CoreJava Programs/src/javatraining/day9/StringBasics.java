package javatraining.day9;

public class StringBasics {


    public static void main(String[] args) {

        String message = "Hello World";

        String message1 = new String(message);


        String lang = "java";
        String lang1 = "java";
        String lang2 = "java";
        String lang3 = "java";
        String lang4 = "java";
        String lang5 = "java";
        String lang6 = "java";
        String lang7 = "java";
        String lang17 = "Java";


        String lang8 = new String("java");
        lang8 = lang8.intern();


        if(lang == lang7) {
            System.out.println("Both are pointing to same memory location");
        }

        if(lang == lang8) {
            System.out.println("Both are pointing to same memory location");

        } else {
            System.out.println("Both are pointing to Diff memory location");
        }

        if(lang7 == lang17) {
            System.out.println(true);
        }

        if(lang7.equalsIgnoreCase(lang17)) {
            System.out.println("same");
        }

        if(lang7.equals(lang17)) {
            System.out.println("same");
        }


        StringBuilder stringBuilder = new StringBuilder();
       // StringBuffer stringBuilder = new StringBuilder();
    }
}
