/*
============================================================================
FILE : LE3_2.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Rectangle.
COPYRIGHT : September 16, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/
package laboratoryExercises;
import java.util.Scanner;

public class LE3_2 {

	public static void main(String[] args) {

		// Create a Scanner object to read user input
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the width and height for Rectangle 1
		System.out.print("Enter width 1: ");
		double width1 = keyboard.nextDouble();

		System.out.print("Enter height 1: ");
		double height1 = keyboard.nextDouble();

		// Create a new Rectangle object for Rectangle 1
		Rectangle rectangle1 = new Rectangle(width1, height1);

		// Consume the newline character left by keyboard.nextDouble
		keyboard.nextLine();

		// Prompt the user to enter the width and height for Rectangle 2
		System.out.print("Enter width 2: ");
		double width2 = keyboard.nextDouble();

		System.out.print("Enter height 2: ");
		double height2 = keyboard.nextDouble();

		// Create a new Rectangle object for Rectangle 2
		Rectangle rectangle2 = new Rectangle(width2, height2);

		System.out.println();
		System.out.println("***** Rectangle 1 *****");

		// Print details of Rectangle 1
		System.out.println("Width 1 = " + width1);
		System.out.println("Height 1 = " + height1);
		System.out.println("Area of the first Rectangle = " + rectangle1.getArea(width1, height1));
		System.out.println("Perimeter of the first Rectangle = " + rectangle1.getPerimeter(width1, height1));
		System.out.println();

		System.out.println("***** Rectangle 2 *****");
		
		// Print details of Rectangle 2
		System.out.println("Width 2 = " + width2);
		System.out.println("Height 2 = " + height2);
		System.out.println("Area of the second Rectangle = " + rectangle2.getArea(width2, height2));
		System.out.println("Perimeter of the second Rectangle = " + rectangle2.getPerimeter(width2, height2));
		System.out.println();

		// Close the Scanner object to release resources
		keyboard.close();
	}

}
