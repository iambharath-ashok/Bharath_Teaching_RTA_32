package javatraining.assignmentssubmission;

public class MobileNumberValidatorEx {
    public static boolean validateFirstThreeDigits(String number1, String number2) {
        // Extract the first three digits or letters from each number
        String firstThreeDigits1 = number1.replaceAll("[^\\dA-Za-z]", "").substring(0, 3);
        String firstThreeDigits2 = number2.replaceAll("[^\\dA-Za-z]", "").substring(0, 3);

        // Compare the first three digits or letters
        return firstThreeDigits1.equalsIgnoreCase(firstThreeDigits2);
    }

    public static void main(String[] args) {
        // Example usage with all provided numbers
        String[] numbersToTest = {
                "123-456-7890",
                "(123) 456-7890",
                "123.456.7890",
                "1234567890",
                "+1 123-456-7890",
                "+1 (123) 456-7890",
                "+1 123.456.7890",
                "+11234567890",
                "1-123-456-7890",
                "1 (123) 456-7890",
                "1.123.456.7890",
                "11234567890",
                "001-123-456-7890",
                "001 (123) 456-7890",
                "001.123.456.7890",
                "+1-001-123-456-7890",
                "+1 (001) 456-7890",
                "+1 001.456.7890",
                "+10011234567890",
                "011-123-456-7890",
                "011 (123) 456-7890",
                "011.123.456.7890",
                "+1 011-123-456-7890"
        };

        // Test each pair of numbers
        for (int i = 0; i < numbersToTest.length; i += 2) {
            String number1 = numbersToTest[i];
            String number2 = "123";

            if (validateFirstThreeDigits(number1, number2)) {
                System.out.println("The first three digits or letters in " + number1 + " and " + number2 + " match. Valid!");
            } else {
                System.out.println("The first three digits or letters in " + number1 + " and " + number2 + " do not match. Invalid!");
            }
        }
    }
}
