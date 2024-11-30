import javax.swing.JOptionPane;

/**
 * This class provides methods for obtaining coordinate input, setting coordinates,
 * and calculating the distance between two points.
 */
public class RevisedDistanceTwoPoints {
    // Variables to store the coordinates of the two points
    private static double x1, x2, y1, y2;

    /**
     * Gets a double value from the user.
     *
     * @param message The prompt message to display to the user
     * @return The entered double value
     */
    public static double getCoordinateInput(String message) {
        String input = JOptionPane.showInputDialog(null, message, "Distance Calculator", JOptionPane.QUESTION_MESSAGE);

        // Continuously prompt the user for valid input until it's provided
        while (true) {
            try {
                double value = Double.parseDouble(input);
                return value;
            } catch (NumberFormatException e) {
                // Handle invalid input format
                input = JOptionPane.showInputDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Sets the coordinates of the two points.
     *
     * @param x1Value The x-coordinate of the first point
     * @param y1Value The y-coordinate of the first point
     * @param x2Value The x-coordinate of the second point
     * @param y2Value The y-coordinate of the second point
     */
    public static void setCoordinates(double x1Value, double y1Value, double x2Value, double y2Value) {
        x1 = x1Value;
        y1 = y1Value;
        x2 = x2Value;
        y2 = y2Value;
    }

    /**
     * Calculates the distance between the two points using the Euclidean distance formula.
     *
     * @return The calculated distance
     */
    public static double calculateDistance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}