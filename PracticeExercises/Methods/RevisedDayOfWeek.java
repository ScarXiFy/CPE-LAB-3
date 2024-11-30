import javax.swing.JOptionPane;

/**
 * This class provides methods for obtaining user input (year, month, and day),
 * calculating the day of the week using Zeller's congruence algorithm,
 * and returning the result as a string.
 */
public class RevisedDayOfWeek {
    // Variables to store the year, month, and day
    private static int year, month, day;

    /**
     * Gets the year from the user.
     *
     * @return The entered year
     */
    public static int getYearInput() {
        String input = JOptionPane.showInputDialog(null, "Enter year (e.g., 2012):", "Day of the Week Calculator", JOptionPane.QUESTION_MESSAGE);

        // Continuously prompt the user for valid input until it's provided
        while (true) {
            try {
                // Parse the input as an integer and return it
                year = Integer.parseInt(input);
                return year;
            } catch (NumberFormatException e) {
                // Handle invalid input format
                input = JOptionPane.showInputDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Gets the month from the user, ensuring it's within the valid range (1-12).
     *
     * @return The entered month
     */
    public static int getMonthInput() {
        String input = JOptionPane.showInputDialog(null, "Enter month (1-12):", "Day of the Week Calculator", JOptionPane.QUESTION_MESSAGE);

        // Continuously prompt the user for valid input until it's provided
        while (true) {
            try {
                // Parse the input as an integer and validate it
                month = Integer.parseInt(input);
                if (month < 1 || month > 12) {
                    throw new IllegalArgumentException("Invalid month. Please enter a value between 1 and 12.");
                }
                return month;
            } catch (NumberFormatException e) {
                // Handle invalid input format
                input = JOptionPane.showInputDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Handle invalid month range
                input = JOptionPane.showInputDialog(null, e.getMessage(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Gets the day from the user, ensuring it's within the valid range (1-31).
     *
     * @return The entered day
     */
    public static int getDayInput() {
        String input = JOptionPane.showInputDialog(null, "Enter day (1-31):", "Day of the Week Calculator", JOptionPane.QUESTION_MESSAGE);

        // Continuously prompt the user for valid input until it's provided
        while (true) {
            try {
                // Parse the input as an integer and validate it
                day = Integer.parseInt(input);
                if (day < 1 || day > 31) {
                    throw new IllegalArgumentException("Invalid day. Please enter a value between 1 and 31.");
                }
                return day;
            } catch (NumberFormatException e) {
                // Handle invalid input format
                input = JOptionPane.showInputDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Handle invalid day range
                input = JOptionPane.showInputDialog(null, e.getMessage(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Calculates the day of the week using Zeller's congruence algorithm.
     *
     * @return The calculated day of the week as a string
     */
    public static String calculateDayOfWeek() {
        // Adjust month and year for January and February
        if (month == 1 || month == 2) {
            if (month == 1) {
                month = 13;
            } else {
                month = 14;
            }
            year--;
        }

        // Calculate the day of the week using Zeller's congruence
        int j = year / 100;
        int k = year % 100;
        int DTW = (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;

        // Convert the calculated value to the corresponding day of the week
        switch (DTW) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            default:
                return "Error: Unexpected day of the week calculation.";
        }
    }
}