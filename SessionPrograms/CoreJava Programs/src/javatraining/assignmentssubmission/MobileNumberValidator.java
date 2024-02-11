package javatraining.assignmentssubmission;

public class MobileNumberValidator {
    public static boolean validateFirstThreeDigits(String mobileNumber, String prefixToken) {
        // Extract the first three digits or letters from each number excluding country code and specific prefix
        String firstThreeDigits1 = extractFirstThreeDigits(mobileNumber);

        // Compare the first three digits or letters
        return firstThreeDigits1.equalsIgnoreCase(prefixToken);
    }

    // Helper method to extract first three digits or letters excluding country code and specific prefix
 /*   private static String extractFirstThreeDigits(String number) {
        // Define regex patterns for country code and specific prefix
        String countryCodePattern = "^[+]?\\d{1,2}\\s*";
        String specificPrefixPattern = "^001[-]?";

        String numberWithoutSpecificPrefix = number.replaceFirst(specificPrefixPattern, "");
        String firstThreeDigits1 = numberWithoutSpecificPrefix.replaceAll("[^\\dA-Za-z]", "");
        String cleanedNumberNew = "";
        if(firstThreeDigits1.length() > 10) {
            cleanedNumberNew = number.replaceAll("^[+]?1?", "").replaceAll("\\D", "");
           if(cleanedNumberNew.length() > 10) {
               cleanedNumberNew = cleanedNumberNew.replaceFirst(specificPrefixPattern, "");
               cleanedNumberNew = cleanedNumberNew.replaceAll("\\+?1-001", "").replaceAll("\\D", "");
               cleanedNumberNew = cleanedNumberNew.replaceAll("\\+?011", "");
           }
            System.out.println(cleanedNumberNew);
        } else if(firstThreeDigits1.length() == 10) {
            System.out.println(firstThreeDigits1);
            cleanedNumberNew = firstThreeDigits1;
        }

        // Extract the first three digits or letters
        return cleanedNumberNew.replaceAll("[^\\dA-Za-z]", "").substring(0, 3);
    }*/

    private static String extractFirstThreeDigits(String phoneNumber) {
        // Define regex patterns for country code and specific prefix
        String specificPrefixPattern = "^001[-]?";

        // Remove specific prefix and non-digit characters
        String cleanedNumber = phoneNumber.replaceAll(specificPrefixPattern, "").replaceAll("[^\\dA-Za-z]", "");

        if (cleanedNumber.length() > 10) {
            // Handle cases with country code
            cleanedNumber = cleanedNumber.replaceAll("^[+]?1?", "").replaceAll("\\D", "");

            // Further cleanup for specific cases
            cleanedNumber = cleanedNumber.replaceFirst(specificPrefixPattern, "")
                    .replaceAll("\\+?1-001", "")
                    .replaceAll("\\+?011", "");
        }

        // Extract the first three digits or letters
        return cleanedNumber.substring(0, Math.min(cleanedNumber.length(), 3));
    }


    public static void main(String[] args) {
        // Example usage with modified numbers
        String[] numbersToTest = {
                "011-123-456-7890",
                "+10011234567890",
                "+1 (123) 456-7890",
                "+1 123.456.7890",
                "+1-001-123-456-7890",
                "(123) 456-7890",
                "+1 123-456-7890",

                "123-456-7890",

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
                "001.123.456.7890"
        };

        // Test each pair of numbers
        for (int i = 0; i < numbersToTest.length; i ++) {
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
