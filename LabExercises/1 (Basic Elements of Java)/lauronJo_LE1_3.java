/*
============================================================================
FILE : ChocolateBars.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Write a program that allows the user to input their weight in pounds, height in inches, and age in years. The program should then output the number of chocolate bars that should be consumed to maintain one’s weight for both a woman and a man of the input weight, height, and age.
COPYRIGHT : August 28, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import java.util.Scanner;

public class ChocolateBars {
	
	public static void main(String[] args) {
		
		// Declare Variables
		double weight, height, age;
		double manBMR, womanBMR;
		double manCalories, womanCalories;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Reads and Gets the User's Weight in pounds
		System.out.println("Input your weight in pounds: ");
		weight = keyboard.nextDouble();
		
		// Reads and Gets the User's height in inches
		System.out.println("Input your height in inches: ");
		height = keyboard.nextDouble();
		
		// Reads and Gets the User's age in years
		System.out.println("Input your age in years: ");
		age = keyboard.nextDouble();
		
		
		// Mathematical Equation to get the Calories needed for a man/woman to maintain his/her weight
		womanBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		manBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		// Formulates and Prints out the number of Chocolate Bars a Woman to Consume
		womanCalories = womanBMR / 230;
		System.out.println("Number of Chocolate Bars a Woman to Consume: " + (int)womanCalories);
		
		// Formulates and Prints out the number of Chocolate Bars a Man to Consume
		manCalories = manBMR / 230;
		System.out.println("Number of Chocolate Bars a Man to Consume: " + (int)manCalories);
		
		keyboard.close();		// Close the scanner object
	} 
	
}