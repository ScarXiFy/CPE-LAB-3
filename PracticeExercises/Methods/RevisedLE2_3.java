import javax.swing.JOptionPane;

/**
 * This class serves as the entry point for the decimal to hexadecimal conversion program.
 * It obtains the decimal number from the user, converts it to hexadecimal,
 * and displays the result in a dialog.
 */
public class RevisedLE2_3 {
    public static void main(String[] args) {
        // Get the decimal number from the user, ensuring it's valid
        String input = JOptionPane.showInputDialog(null, "Enter a decimal number: ", "Decimal to Hexadecimal Converter", JOptionPane.QUESTION_MESSAGE);

        while (!RevisedDecToHex.isValidInput(input)) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            input = JOptionPane.showInputDialog(null, "Enter a decimal number: ", "Decimal to Hexadecimal Converter", JOptionPane.QUESTION_MESSAGE);
        }

        // Convert the decimal number to an integer
        int decimalNumber = Integer.parseInt(input);

        // Convert the decimal number to hexadecimal
        String hexString = RevisedDecToHex.convertDecimalToHex(decimalNumber);

        // Display the result in a dialog
        JOptionPane.showMessageDialog(null, "Hexadecimal Number: " + hexString, "Decimal to Hexadecimal Converter", JOptionPane.INFORMATION_MESSAGE);
    }
}