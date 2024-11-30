/*
============================================================================
FILE : LE2_1.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Determines the day of the Week
COPYRIGHT : September 4, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import java.util.Scanner;

public class LE2_1 {

	public static void main(String[] args) {
		
		// Declare Variables
		Scanner keyboard = new Scanner(System.in);
		int year, month, day;
		
		System.out.print("Enter year: (e.g., 2012): ");
		
		// While Loop to get the user's year + Input Validation
        while (!keyboard.hasNextInt()) {
        	
          System.out.println("Input is not a number.");
          keyboard.nextLine();
          System.out.print("Enter year: (e.g., 2012): ");
          
        }
        
        year = keyboard.nextInt();
		
		// Do-While Loop to ask the user's month
		do {
			
			// Reads and Gets User's month
			System.out.println("Enter month 1 - 12: ");
			
			while (!keyboard.hasNextInt()) {
				
				System.out.println("Input is not a number.");
				keyboard.nextLine();
				System.out.println("Enter month 1 - 12: ");
			}
			
			month = keyboard.nextInt();
			
			// Input Validation for Month
			if (month < 1 || month > 12) {
				
				System.out.println("Error!\n");
			}
			
			
			
		} while (month < 1 || month > 12);
		
		
		// Do-While Loop to ask the user's day of the month
		do {
			
			// Reads and Gets User's day
			System.out.print("Enter the day of the month 1 - 31: ");
			
			while (!keyboard.hasNextInt()) {
				
				System.out.println("Input is not a number.");
				keyboard.nextLine();
				System.out.print("Enter the day of the month 1 - 31:");
			}
			
			day = keyboard.nextInt();
			
			// Input Validation for the day of the month
			if (day < 1 || day > 31) {
				
				System.out.println("Error!\n");
			}
			
		} while (day < 1 || day > 31);
		
		
		// Conditional Statement to convert the user input 1 to 13 and 2 to 14
		if (month == 1 || month == 2) {
			
			if (month == 1) {
				
				month = 13;
			} else {
				
				month = 14;
			}
			
			year--;
		}
		
		// Declare Variables
		int j = year / 100;
		int k = year % 100;
		
		// Mathematical Equation to get the day of the week
		int DTW = (day + ((26 * (month + 1)) / 10) + k + (k / 4) +  (j / 4) + 5 * j) % 7;
		
		
		// Switch Case
		switch(DTW) {
		
		case 0:		// if the DTW is equal to 0
			
			System.out.print("Day of the Week: Saturday");
			
			break;
			
		case 1:		// if the DTW is equal to 1
			
			System.out.print("Day of the Week: Sunday");
			
			break;
			
		case 2:		// if the DTW is equal to 2
			
			System.out.print("Day of the Week: Monday");
			
			break;
			
		case 3:		// if the DTW is equal to 3
			
			System.out.print("Day of the Week: Tuesday");
			
			break;
			
		case 4:		// if the DTW is equal to 4
			
			System.out.print("Day of the Week: Wednesday");
			
			break;
			
		case 5:		// if the DTW is equal to 5
			
			System.out.print("Day of the Week: Thursday");
			
			break;
			
		case 6:		// if the DTW is equal to 6
			
			System.out.print("Day of the Week: Friday");
			
			break;
		
		
		}
		
		keyboard.close();
	}

}
