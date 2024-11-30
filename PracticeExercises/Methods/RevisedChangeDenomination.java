import javax.swing.JOptionPane;

/**
 * This class provides methods for obtaining the amount from the user and calculating the change.
 */
public class RevisedChangeDenomination {
    // Define constants for coin values
    private static final int QUARTER_VALUE = 25;
    private static final int DIME_VALUE = 10;
    private static final int NICKEL_VALUE = 5;

    /**
     * Gets the amount from the user, ensuring it's within the valid range (1-99 cents).
     *
     * @return The entered amount
     */
    public static int getAmount() {
        int amount;
        String input = JOptionPane.showInputDialog(null, "Enter amount (from 1 - 99 cents):", "Change Denomination", JOptionPane.QUESTION_MESSAGE);

        // Continuously prompt the user for valid input until it's provided
        while (true) {
            try {
                // Parse the input as an integer
                amount = Integer.parseInt(input);

                // Validate the amount
                if (amount < 1 || amount > 99) {
                    throw new IllegalArgumentException("Invalid amount. Please enter a value between 1 and 99.");
                }

                // If the input is valid, break out of the loop
                break;
            } catch (NumberFormatException e) {
                // Handle invalid input format
                input = JOptionPane.showInputDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Handle invalid amount range
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                input = JOptionPane.showInputDialog(null, "Enter amount (from 1 - 99 cents):", "Change Denomination", JOptionPane.QUESTION_MESSAGE);
            }
        }

        return amount;
    }

    /**
     * Calculates the change for the given amount and returns it as a formatted string.
     *
     * @param amount The amount for which to calculate the change
     * @return A string representing the calculated change
     */
    public static String calculateChange(int amount) {
        // Calculate the number of each coin needed
        int quarters = amount / QUARTER_VALUE;
        int remaining = amount % QUARTER_VALUE;

        int dimes = remaining / DIME_VALUE;
        remaining = remaining % DIME_VALUE;

        int nickels = remaining / NICKEL_VALUE;
        remaining = remaining % NICKEL_VALUE;

        int pennies = remaining;

        // Build a formatted string to represent the change
        String message = "Your change is:\n";
        message += quarters + " quarter(s)\n";
        message += dimes + " dime(s)\n";
        message += nickels + " nickel(s)\n";
        message += pennies + " penny(ies)";

        return message;
    }
}