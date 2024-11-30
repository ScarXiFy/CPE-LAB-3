/*
============================================================================
FILE : ChangeDenomination.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Determines the change to be dispenses from a vending machine. The user enters an amount between 1 cent and 99 cents. The program determines a combination of coins equal to that amount. Denominations is in a formed of: quarter, dime, nickel and penny.
COPYRIGHT : August 28, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import java.util.Scanner;

public class ChangeDenomination {
	
	public static final int QUARTER = 25;		// Declare Constant
	
	public static void main(String[] args) {
		
		// Declare Constants
		
		final int DIME = 10;
		final int NICKEL = 5;
		final int PENNY = 1;
		
		Scanner keyboard = new Scanner(System.in);
		
		int amount = 0;		// Declare Variables
		
		while(amount < 1 || amount > 99 ) {		// While loop for Input Validation
			
		System.out.println("Enter amount (from 1 - 99 cents) : ");		// Reads User Input
		amount = keyboard.nextInt();
		
		// Checks if the number is greater than or equal to 100
		if (amount >= 100) {
			
			System.out.println("Error!\n");		// Prints out the Error message
		}
		
		}
		
		// Formula to get the quarters
		int quarters = amount / QUARTER;
		int rquarters = amount % QUARTER;
		
		// Formula to get the dimes
		int dimes = rquarters / DIME;
		int rdimes = rquarters % DIME;
		
		// Formula to get the nickels
		int nickels = rdimes / NICKEL;
		int rnickels = rdimes % NICKEL;
		
		// Formula to get the penniesSSS
		int pennies = rnickels / PENNY;
		
		System.out.println("Your change is");
		System.out.println(quarters + " quarter");	// Print outs the change in quarters
		System.out.println(dimes + " dime");		// Print outs the change in dimes
		System.out.println(nickels + " nickels");	// Print outs the change in nickels
		System.out.println(pennies + " penny");		// Print outs the change in pennies
		
		keyboard.close();		// Close the scanner object
	} 
}