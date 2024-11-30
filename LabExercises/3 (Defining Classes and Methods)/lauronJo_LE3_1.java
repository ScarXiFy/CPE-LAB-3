/*
============================================================================
FILE : LE3_1.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Person.
COPYRIGHT : September 16, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/
package laboratoryExercises;
import java.util.Scanner;

public class LE3_1 {

	public static void main(String[] args) {
		
		// Create a Scanner object to read user input
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the name and age of Person 1
		System.out.print("Enter the Name of Person 1: ");
		String name1 = keyboard.nextLine();
		
		System.out.print("Enter the Age of Person 1: ");
		int age1 = keyboard.nextInt();
		
		// Create a new Person object for Person 1 with the entered details
		Person person1 = new Person(name1, age1);
		
		// Consume the newline character left by keyboard.nextInt()
		keyboard.nextLine();
		
		// Prompt the user to enter the name and age of Person 2
		System.out.print("Enter the Name of Person 2: ");
		String name2 = keyboard.nextLine();
		
		System.out.print("Enter the Age of Person 2: ");
		int age2 = keyboard.nextInt();
		
		// Create a new Person object for Person 2 with the entered details
		Person person2 = new Person(name2, age2);
		
		// Compare Person 1 and Person 2 using their methods
        System.out.println("Person 1 and Person 2 are equal: " + person1.equals(person2));
        System.out.println("Person 1 and Person 2 have the same name: " + person1.hasSameName(person2));
        System.out.println("Person 1 and Person 2 have the same age: " + person1.hasSameAge(person2));
        System.out.println("Person 1 is older than Person 2: " + person1.isOlderThan(person2));
        System.out.println("Person 2 is younger than Person 1: " + person2.isYoungerThan(person1));
        
		// Close the Scanner object to release resources
        keyboard.close();
	}

}
