/*
============================================================================
FILE : DistanceTwoPoints.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Write a program that allows the user to input their weight in pounds, height in inches, and age in years. The program should then output the number of chocolate bars that should be consumed to maintain one’s weight for both a woman and a man of the input weight, height, and age.
COPYRIGHT : August 28, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import java.util.Scanner;

public class DistanceTwoPoints {
	
	public static void main(String[] args) {
		
		// Declare Variables
		double x1, x2, y1, y2, distance;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Reads and Gets the User's x1 and y1 Input
		System.out.println("Input x1 and y1: ");
		x1 = keyboard.nextDouble();
		y1 = keyboard.nextDouble();
		
		// Reads and Gets the User's x2 and y2 Input
		System.out.println("Input x2 and y2: ");
		x2 = keyboard.nextDouble();
		y2 = keyboard.nextDouble();
		
		// Formula to get the distance
		distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		// Print outs the distance
		System.out.println("The distance between the two points is " + distance);
		
		keyboard.close();		// Close the scanner object
	} 
	
}