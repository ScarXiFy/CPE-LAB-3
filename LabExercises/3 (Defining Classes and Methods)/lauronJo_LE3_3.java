/*
============================================================================
FILE : LE3_3.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Grade Distribution.
COPYRIGHT : September 16, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/
package laboratoryExercises;
import java.util.Scanner;

public class LE3_3 {

    public static void main(String[] args) {

		// Create a Scanner object to read input from the user
        Scanner keyboard = new Scanner(System.in);

		// Create a GradeDistribution object to manage grade calculations
        GradeDistribution gradeDistribution = new GradeDistribution();

		// Prompt the user to enter the number of students with each grade
        System.out.print("Enter the number of Grade A: ");
        int gradeA = keyboard.nextInt();

        System.out.print("Enter the number of Grade B: ");
        int gradeB = keyboard.nextInt();

        System.out.print("Enter the number of Grade C: ");
        int gradeC = keyboard.nextInt();

        System.out.print("Enter the number of Grade D: ");
        int gradeD = keyboard.nextInt();

        System.out.print("Enter the number of Grade F: ");
        int gradeF = keyboard.nextInt();

		// Set the grades in the GradeDistribution object
        gradeDistribution.setGrades(gradeA, gradeB, gradeC, gradeD, gradeF);

		// Call methods in GradeDistribution to perform calculations and display results
		System.out.println();
		System.out.println("The total number of Grades = " + gradeDistribution.getTotalGrades());
		System.out.println();
        gradeDistribution.displayGraph();
		System.out.println();

        keyboard.close();	// Close the Scanner object to release resources
    }
}