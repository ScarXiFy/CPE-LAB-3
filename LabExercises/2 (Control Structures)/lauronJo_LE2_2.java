/*
============================================================================
FILE : LE2_2.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Simulates flipping a coin two million times and displays the number of heads and tails.
COPYRIGHT : September 4, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

public class LE2_2 {

	public static void main(String[] args) {
		
		// Declare Variables
		int heads = 0, tails = 0;
		int counter;
		
		// For Loop for the Simulation of flipping the coin
		for(counter = 0; counter < 2000000; counter++) {
			
			if ((int)(Math.random() * 2) == 0 ) {
				
				heads++;	// increments heads
			} else {
				
				tails++;	// increments tails
			}
		}
		
		System.out.println("heads: " + heads + " tails: " + tails);		// Displays the number of heads and tails

	}
}
