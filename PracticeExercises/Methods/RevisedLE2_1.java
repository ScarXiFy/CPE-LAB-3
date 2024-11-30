import javax.swing.JOptionPane;

/**
 * This class serves as the entry point for the day of the week calculation program.
 * It obtains the year, month, and day from the user, calculates the day of the week,
 * and displays the result in a dialog.
 */
public class RevisedLE2_1 {
    public static void main(String[] args) {
        // Get user input for year, month, and day
        RevisedDayOfWeek.getYearInput();
        RevisedDayOfWeek.getMonthInput();
        RevisedDayOfWeek.getDayInput();

        // Calculate the day of the week
        String dayOfWeek = RevisedDayOfWeek.calculateDayOfWeek();

        // Display the result in a dialog
        JOptionPane.showMessageDialog(null, "Day of the Week: " + dayOfWeek, "Day of the Week Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}