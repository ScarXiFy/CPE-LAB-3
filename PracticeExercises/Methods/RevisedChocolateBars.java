import javax.swing.JOptionPane;

/**
 * This class provides methods for obtaining user input, calculating the BMR,
 * and estimating the number of chocolate bars needed.
 */
public class RevisedChocolateBars {
    // Variables to store weight and height
    private static double weight;
    private static double height;

    /**
     * Gets a double value from the user, ensuring it's positive.
     *
     * @param message The prompt message to display to the user
     * @return The entered double value
     */
    public static double getUserInput(String message) {
        String input = JOptionPane.showInputDialog(null, message, "Chocolate Intake", JOptionPane.QUESTION_MESSAGE);

        // Continuously prompt the user for valid input until it's provided
        while (true) {
            try {
                double value = Double.parseDouble(input);

                // Validate the value
                if (value < 0) {
                    throw new IllegalArgumentException("Invalid input. Please enter a positive value.");
                }

                // If the input is valid, return the value
                return value;
            } catch (NumberFormatException e) {
                // Handle invalid input format
                input = JOptionPane.showInputDialog(null, "Invalid input. Please enter a number.", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                // Handle invalid value
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                input = JOptionPane.showInputDialog(null, message, "Chocolate Intake", JOptionPane.QUESTION_MESSAGE);
            }
        }
    }

    /**
     * Sets the weight value.
     *
     * @param weight The new weight value
     */
    public static void setWeight(double weight) {
        RevisedChocolateBars.weight = weight;
    }

    /**
     * Sets the height value.
     *
     * @param height The new height value
     */
    public static void setHeight(double height) {
        RevisedChocolateBars.height = height;
    }

    /**
     * Calculates the Basal Metabolic Rate (BMR) based on the Mifflin-St Jeor equation.
     *
     * @param weight The weight in pounds
     * @param height The height in inches
     * @param age The age in years
     * @param isMale Indicates whether the person is male (true) or female (false)
     * @return The calculated BMR
     */
    public static double calculateBMR(double weight, double height, double age, boolean isMale) {
        if (isMale) {
            return 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        } else {
            return 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        }
    }

    /**
     * Estimates the number of chocolate bars needed based on the daily calorie intake.
     *
     * @param calories The daily calorie intake
     * @return The estimated number of chocolate bars
     */
    public static int calculateChocolateBars(double calories) {
        return (int) Math.ceil(calories / 230); // Round up to nearest whole chocolate bar
    }
}