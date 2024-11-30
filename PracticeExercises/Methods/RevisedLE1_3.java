import javax.swing.JOptionPane;

/**
 * This class serves as the entry point for the chocolate intake estimation program.
 * It obtains user information (weight, height, age, and gender), calculates the BMR for both men and women,
 * estimates the number of chocolate bars needed for each gender, and displays the results.
 */
public class RevisedLE1_3 {
    public static void main(String[] args) {
        // Get user information
        double weight = RevisedChocolateBars.getUserInput("Enter your weight in pounds: ");
        double height = RevisedChocolateBars.getUserInput("Enter your height in inches: ");
        double age = RevisedChocolateBars.getUserInput("Enter your age in years: ");

        // Calculate BMR and chocolate bars for women
        double womanBMR = RevisedChocolateBars.calculateBMR(weight, height, age, false);
        int womanCalories = RevisedChocolateBars.calculateChocolateBars(womanBMR);

        // Calculate BMR and chocolate bars for men
        double manBMR = RevisedChocolateBars.calculateBMR(weight, height, age, true);
        int manCalories = RevisedChocolateBars.calculateChocolateBars(manBMR);

        // Display the results
        String output = "Number of Chocolate Bars to Consume:\n"
                + "Woman: " + womanCalories + "\n"
                + "Man: " + manCalories;

        JOptionPane.showMessageDialog(null, output, "Chocolate Intake", JOptionPane.INFORMATION_MESSAGE);
    }
}