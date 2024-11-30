import javax.swing.JOptionPane;

/**
 * This class provides methods for obtaining the number from the user,
 * calculating the product of its digits, and displaying the digits.
 */
public class RevisedMultiplyDigits {
    // Variables to store individual digits
    private static int n1, n2, n3;

    /**
     * Gets a number from the user, ensuring it's within the valid range (0-1000).
     *
     * @return The entered number
     */
    public static int getNumber() {
        int number;
        String input = JOptionPane.showInputDialog(null, "Enter a number between 0 - 1000:", "Multiply Digits", JOptionPane.QUESTION_MESSAGE);

        // Continuously prompt the user for valid input until it's provided
        while (true) {
            try {
                // Parse the input as an integer
                number = Integer.parseInt(input);

                // Validate the number
                if (number < 0 || number > 1000) {
                    throw new IllegalArgumentException("Invalid number. Please enter a value between 0 and 1000.");
                }

                // If the input is valid, break out of the loop
                break;
            } catch (NumberFormatException e) {
                // Handle invalid input format
                input = JOptionPane.showInputDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Handle invalid number range
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                input = JOptionPane.showInputDialog(null, "Enter a number between 0 - 1000:", "Multiply Digits", JOptionPane.QUESTION_MESSAGE);
            }
        }

        return number;
    }

    /**
     * Calculates the product of the digits in the given number.
     *
     * @param number The number for which to calculate the product
     * @return The product of the digits
     */
    public static int calculateProduct(int number) {
        int product;

        // Calculate the product based on the number of digits
        if (number < 10) {
            n1 = number % 10;
            product = n1 * 1;
        } else if (number < 100) {
            n2 = number % 10;
            n1 = (number / 10) % 10;
            product = n1 * n2;
        } else {
            n3 = number % 10;
            n2 = (number / 10) % 10;
            n1 = (number / 100) % 10;
            product = n1 * n2 * n3;
        }

        return product;
    }

    /**
     * Displays the digits of the given number in a dialog.
     *
     * @param number The number to display the digits of
     */
    public static void displayDigits(int number) {
        // Extract and display the digits based on the number of digits
        if (number < 10) {
            n1 = number % 10;
            JOptionPane.showMessageDialog(null, "Digits: " + n1, "Multiply Digits", JOptionPane.INFORMATION_MESSAGE);
        } else if (number < 100) {
            n2 = number % 10;
            n1 = (number / 10) % 10;
            JOptionPane.showMessageDialog(null, "Digits: " + n1 + "  " + n2, "Multiply Digits", JOptionPane.INFORMATION_MESSAGE);
        } else {
            n3 = number % 10;
            n2 = (number / 10) % 10;
            n1 = (number / 100) % 10;
            JOptionPane.showMessageDialog(null, "Digits: " + n1 + "  " + n2 + "  " + n3, "Multiply Digits", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}