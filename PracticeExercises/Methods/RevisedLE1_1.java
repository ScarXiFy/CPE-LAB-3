import javax.swing.JOptionPane;

/**
 * This class serves as the entry point for the change denomination program.
 * It obtains the amount from the user, calculates the change, and displays it in a dialog.
 */
public class RevisedLE1_1 {
    public static void main(String[] args) {
        // Get the amount from the user
        int amount = RevisedChangeDenomination.getAmount();

        // Calculate the change
        String change = RevisedChangeDenomination.calculateChange(amount);

        // Display the calculated change in a dialog
        JOptionPane.showMessageDialog(null, change, "Change Denomination", JOptionPane.INFORMATION_MESSAGE);
    }
}