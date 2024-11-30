import java.util.Random;

/**
 * This class provides methods for simulating coin flips and updating the results array.
 */
public class RevisedSimulation {
    /**
     * Simulates flipping a coin once.
     *
     * @return 0 for heads, 1 for tails
     */
    public static int flipCoin() {
        // Create a random number generator
        Random random = new Random();

        // Generate a random number between 0 and 1 (inclusive)
        return random.nextInt(2);
    }

    /**
     * Simulates flipping a coin a specified number of times and updates the results array.
     *
     * @param results The array to store the results (index 0 for heads, 1 for tails)
     */
    public static void simulateFlips(int[] results) {
        // Simulate flipping the coin 2 million times
        for (int i = 0; i < 2000000; i++) {
            // Flip the coin and increment the corresponding counter
            int flipResult = flipCoin();
            results[flipResult]++;
        }
    }
}