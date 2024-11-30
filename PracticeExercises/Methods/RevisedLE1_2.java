import javax.swing.JOptionPane;

/**
 * This class serves as the entry point for the digit multiplication program.
 * It obtains the number from the user, calculates the product of its digits,
 * displays the digits, and shows the final product in a dialog.
 */
public class RevisedLE1_2 {
    public static void main(String[] args) {
        // Get the number from the user
        int number = RevisedMultiplyDigits.getNumber();

        // Calculate the product of the digits
        int product = RevisedMultiplyDigits.calculateProduct(number);

        // Display the digits
        RevisedMultiplyDigits.displayDigits(number);

        // Show the result in a dialog
        JOptionPane.showMessageDialog(null, "The product of all digits in " + number + " is " + product, "Multiply Digits", JOptionPane.INFORMATION_MESSAGE);
    }
}