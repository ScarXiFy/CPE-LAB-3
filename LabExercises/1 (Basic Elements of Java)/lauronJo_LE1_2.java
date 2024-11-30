/*
============================================================================
FILE : MultiplyDigits.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Reads an integer between 0 and 1000. Display and multiplies all the digits in the integer. Assume that the user follows directions. (Hint: Use the division and remainder operators).
COPYRIGHT : August 28, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import java.util.Scanner;

public class MultiplyDigits {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// Declare Variables
		int number = 0;
		int n1, n2, n3, product;
		
		while(number <= 0 || number > 1000 ) {		// While loop for Input Validation
			
		System.out.println("Enter a number between 0 - 1000 : ");		// Reads User Input
		number = keyboard.nextInt();
		
		//	Checks if the number is greater than 1000
		if (number > 1000) {
			
			System.out.println("Error!\n");		// Prints out the Error message
		}
		
		}
		
		if (number <= 9) {		// Checks if the number is less than or equal to 9
			
			// Mathematical Equation to get the n1
			n1 = number % 10;
			
			System.out.println(n1);		// print outs the first digit
			
			product = n1;
			
			System.out.println("The product of all digits in " + number + " is " + product);
		}
		

		else if (number < 100) {	// Checks if the number is less than 100

			// Mathematical Equation to get the n1, n2 and n3
			n1 = (number / 10) % 10;
			n2 = number % 10;

			System.out.println(n1);		// print outs the first digit
			System.out.println(n2);		// print outs the second digit

			product = n1 * n2;

			System.out.println("The product of all digits in " + number + " is " + product);
		} else {

			// Mathematical Equation to get the n1, n2 and n3
			n1 = (number / 100) % 10;
			n2 = (number / 10) % 10;
			n3 = number % 10;

			System.out.println(n1);		// print outs the first digit
			System.out.println(n2);		// print outs the second digit
			System.out.println(n3);		// print outs the third digit
		
			product = n1 * n2 * n3;
			
			System.out.println("The product of all digits in " + number + " is " + product);

		}
		
		keyboard.close();		// Close the scanner object
	} 
	
}