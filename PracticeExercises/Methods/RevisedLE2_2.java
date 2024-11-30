import javax.swing.JOptionPane;

/**
 * This class serves as the entry point for the coin flip simulation program.
 * It simulates flipping a coin 2 million times, counts the occurrences of heads and tails,
 * and displays the results in a dialog.
 */
public class RevisedLE2_2 {
    public static void main(String[] args) {
        // Create an array to store the count of heads and tails
        int[] results = new int[2]; // Index 0 for heads, 1 for tails

        // Simulate flipping the coin 2 million times
        RevisedSimulation.simulateFlips(results);

        // Build a message to display the results
        String message = String.format("Heads: %d\nTails: %d", results[0], results[1]);

        // Show the results in a dialog
        JOptionPane.showMessageDialog(null, message, "Coin Flipper Results", JOptionPane.INFORMATION_MESSAGE);
    }
}