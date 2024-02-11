package javatraining.day2;

import java.util.List;

public class ControlFlowStatementsExample {

    public static void main(String[] args) {

        //1. if-else Statement:
       // ifElseStatement();

        //2. switch Statement:
       // switchStatement();

     //   switchStringExample();


        //Loops
        //3. while Loop:
     //   whileLoop();

        //4. do-while Loop:
     //   doWhileLoop();

        //5. for Loop:
       //forLoop();


        //6. break Statement:
        //breakStatement();

        //breakWithNestedLoops();


        //7. continue Statement:
        continueStatement();


    }

    private static void continueStatement() {
        int money = 0;
        int budget = 100;
        int beneificary = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == 3 || i == 5) {
                continue; // Skip the iteration when i is 3
            }
            if(money == budget) {
                break;
            }
            money+=10;
            beneificary++;
            if (beneificary == 5) {
                break;
            }
            System.out.println("Value: " + i);
            //millions of lines
        }
    }

    private static void breakStatement() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("Value: " + i);
        }
        System.out.println("came out of the loop");
    }

    private static void breakWithNestedLoops() {

        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if(j == 5) {
                    break;
                }
                System.out.println("Value:: "+ j);
            }
            System.out.println("==================");
        }
        System.out.println("Came out of the loop");
    }

    private static void forLoop() {
        for (int i = 1; i <= 5; i++) { // Initialization, Condition, Increment
            System.out.println("Iteration: " + i);
        }

        //Example of: For loop as While
        int count  = 1;// Initialization
        for(;count <= 7;) {// Condition
            System.out.println("Current Counter Value:: "+count);
            count++;// Increment
        }



        int i = 1;//Initialization
        while (i<=5) { //Condition
            System.out.println("Iteration: " + i);
            i++; //Increment
            int j = 0;
            while (j <= 5) {
                j++;
            }
        }

        List<String> list = List.of("Aegon", "Danarys", "Aemon");
        for (String s : list) { //Advance for loop
            System.out.println("Name:: "+ s);
        }
    }

    private static void doWhileLoop() {
        int num = 600;

        /*
        //DO WHILE SYNTAX

        do {
            // STATEMENTS Will get executed at least One-Time
        } while (CONDITION)


        */
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
    }

    private static void whileLoop() {
        int count = 1;// Initialization

        // SYNTAX OF WHILE LOOP

//        while (CONDITION) {
//            //SET OF STATEMENTS
//        }

        while (count <= 5) { // Condition
            System.out.println("Count: " + count);
            count++;// Increment
        }
    }

    private static void switchStatement() {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // ... other cases ...
            default:
                System.out.println("Invalid day");
                break;
        }

    }

    private static void switchStringExample() {
      String name = "Robert";

      switch (name) {

          case "Aegon":
              System.out.println("Targaryn");
              break;
          case "Cersi":
              System.out.println("Lannister");
              break;
          case "Arya":
              System.out.println("Stark");
              break;
          default:
              System.out.println("Bastard");
        }

    }

    private static void ifElseStatement() {
        int age = 21;
        String name = new String("Bharath");//Memory location 111 7777
           // "Bharath" 8888 77777
           // 8888 77777 == 111 7777 ==> false

        //if - else if - else ladder
        if (age >= 18 && name.equals( "AAharath")) {
            System.out.println("Bharath, You are an adult.");
        } else if(age >= 21) {
            System.out.println( "You are an adult. And you are eligible to vote.");
        }
        else if(age >= 18) {
            System.out.println( "You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        System.out.println("Exiting from If else Statement");
    }
}
