/*
============================================================================
FILE : LE2_3.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Converts the inputted decimal number into hexadecimal number.
COPYRIGHT : September 4, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import java.util.Scanner;

public class LE2_3 {

	public static void main(String[] args) {
		
		// Declare Variables
		Scanner keyboard = new Scanner(System.in);
		String hexaNum = "";
		int decimalNumber, remainder;
		
		System.out.print("Enter a decimal number: ");
		
		// Input Validation if the User inputted a character
		while(!keyboard.hasNextInt()) {
			
			System.out.println("Input is not a number.");
			keyboard.nextLine();
			System.out.println("Enter a decimal number: ");
		}
		
		decimalNumber = keyboard.nextInt();
	
		while (decimalNumber != 0) {		// While Loop for Conversion from Decimal to Hexadecimal
			
			remainder = decimalNumber % 16;
			
			switch (remainder) {
			
			case 10:
				hexaNum = "A" + hexaNum;	// Appends A to the string hexaNum
				break;
				
			case 11:
				hexaNum = "B" + hexaNum;	// Appends B to the string hexaNum
				break;
				
			case 12:
				hexaNum = "C" + hexaNum;	// Appends C to the string hexaNum
				break;
				
			case 13:
				hexaNum = "D" + hexaNum;	// Appends D to the string hexaNum
				break;
				
			case 14:
				hexaNum = "E" + hexaNum;	// Appends E to the string hexaNum
				break;
				
			case 15:
				hexaNum = "F" + hexaNum;	// Appends F to the string hexaNum
				break;
				
			default:
				hexaNum = remainder + hexaNum;
				break;
			}
			
			decimalNumber = decimalNumber / 16;
			
		}
		
		System.out.println("Hexadecimal Number: " + hexaNum);		// Displays the Hexadecimal Number
		
		keyboard.close();
	}
}
