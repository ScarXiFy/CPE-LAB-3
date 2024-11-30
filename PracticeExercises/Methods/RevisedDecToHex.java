/**
 * This class provides methods for converting a decimal number to hexadecimal and validating input.
 */
public class RevisedDecToHex {
    /**
     * Converts a decimal number to its hexadecimal representation.
     *
     * @param decimal The decimal number to convert
     * @return The hexadecimal representation of the decimal number
     */
    public static String convertDecimalToHex(int decimal) {
        // Create a StringBuilder to build the hexadecimal string
        StringBuilder hexString = new StringBuilder();

        // Convert the decimal number to hexadecimal digit by digit
        while (decimal != 0) {
            // Get the remainder of dividing by 16
            int remainder = decimal % 16;

            // Convert the remainder to a hexadecimal character
            if (remainder >= 10) {
                hexString.append((char) (remainder - 10 + 'A')); // Convert digit to uppercase hex character
            } else {
                hexString.append(remainder);
            }

            // Divide the decimal number by 16 for the next iteration
            decimal /= 16;
        }

        // Reverse the string for proper hex representation
        return hexString.reverse().toString();
    }

    /**
     * Validates whether the given input is a valid decimal number.
     *
     * @param input The input string to validate
     * @return True if the input is a valid decimal number, false otherwise
     */
    public static boolean isValidInput(String input) {
        // Attempt to parse the input as an integer
        try {
            Integer.parseInt(input);
            return true; // If parsing is successful, the input is valid
        } catch (NumberFormatException e) {
            // If parsing fails due to a NumberFormatException, the input is invalid
            return false;
        }
    }
}