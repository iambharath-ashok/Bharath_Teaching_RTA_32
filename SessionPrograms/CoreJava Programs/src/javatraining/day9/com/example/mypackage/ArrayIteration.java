package javatraining.day9.com.example.mypackage;

public class ArrayIteration {

    public static void main(String[] args) {

        int[] numbers = {10, 20,30,40,50};

        for(int num : numbers) {
         //   System.out.println(num);
        }

//        for(int i= 0; i < numbers.length;i++) {
//            System.out.println(numbers[i]);
//        }

        int indexPos = 5;
        if(numbers != null && numbers.length > indexPos) {
            System.out.println(numbers[indexPos]);
        } else {
            System.out.println("Array Size is less than::" +indexPos);
        }




    }
}
