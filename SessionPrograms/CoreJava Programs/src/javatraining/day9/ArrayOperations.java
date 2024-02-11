package javatraining.day9;

import java.util.Arrays;
import java.util.stream.IntStream;


//Array Declaration and Initialization
// int [] number = new int[5]; [0,0,0,0,0]
// int[] array = { 10, 5, 7, 20, 15, 3 };

//Advantages of Array:
//1. Continous memory allocation (Continuous Memory blog)
//2. Index based access array[100]
//3. Access Time Complexity is O(1)
//4. Memory consumption is less compare to other data structure
//5. Easy to use

//Disadvantages of Array:
//1. Array size is fixed even at runtime
//2. If we need to add one more new element to existing array,
    //  we need to recreate the new array by copying existing elements and add new element
//3. Array can have only similar data types (Homogeneous)
//4. Adding and deleting an element to/from middle of array is a costly process
//5. Arrays does not grow dynamically at the runtime

// Array are fixed


public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = { 10, 5, 7, 20, 15, 3 };

        IntStream stream = Arrays.stream(array);
        stream.filter(v -> v ==2).forEach(System.out::println);

        System.out.println(array[10]);

        // Finding the sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // Finding the average of array elements
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);

        // Finding the maximum value in the array
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max: " + max);

        // Finding the minimum value in the array
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min: " + min);
    }
}
