import javax.swing.JOptionPane;

/**
 * This class serves as the entry point for the distance calculation program.
 * It obtains the coordinates of two points, calculates the distance between them,
 * and displays the result in a dialog.
 */
public class RevisedLE1_4 {
    public static void main(String[] args) {
        // Get coordinates for point 1
        double x1 = RevisedDistanceTwoPoints.getCoordinateInput("Enter x1 coordinate:");
        double y1 = RevisedDistanceTwoPoints.getCoordinateInput("Enter y1 coordinate:");

        // Get coordinates for point 2
        double x2 = RevisedDistanceTwoPoints.getCoordinateInput("Enter x2 coordinate:");
        double y2 = RevisedDistanceTwoPoints.getCoordinateInput("Enter y2 coordinate:");

        // Set all coordinates at once
        RevisedDistanceTwoPoints.setCoordinates(x1, y1, x2, y2);

        // Calculate the distance between the two points
        double distance = RevisedDistanceTwoPoints.calculateDistance();

        // Display the result in a dialog
        JOptionPane.showMessageDialog(null, "The distance between the two points is " + distance, "Distance Calculator", JOptionPane.INFORMATION_MESSAGE);
    }
}