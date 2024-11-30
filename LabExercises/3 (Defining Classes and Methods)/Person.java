package laboratoryExercises;

public class Person {
	
	// Private fields to store name and age
	private String name;
	private int age;
	
	 /**
     * Default constructor that creates a Person object with empty name and age equal to 0.
     *
     * Postcondition: The name and age of the Person object are set to empty string and 0, respectively.
     */

	public Person() {
		
		name = "";
		age = 0;
		
	}
	
	/**
     * Constructor that creates a Person object with a given name and age.
     *
     * @param name The name of the Person (Precondition: not null).
     * @param age The age of the Person (Precondition: non-negative).
     *
     * Postcondition: The name and age of the Person object are set to the provided values.
     */

	public Person(String name, int age) {
		// Precondition check for name
		if (name == null) {
			System.out.println("ERROR! Name cannot be null.\n");
		}
		
		this.name = name;

		// Precondition check for age
		if (age < 0) {
			System.out.println("ERROR! Age cannot be negative");
		}
		this.age = age;
	}
	
	/**
     * @return The name of the Person object.
     */

	public String getName() {
		
		return name;
	}

	/**
     * @return The age of the Person object.
     */
	
	public int getAge() {
		
		return age;
	}

	/**
     * Sets the name of the Person object.
     *
     * @param name The new name of the Person (Precondition: not null).
     *
     * Postcondition: The name of the Person object is set to the provided value.
     */
	
	public void setName(String name) {
		// Precondition check for name
		if (name == null) {
			System.out.println("ERROR! Name cannot be null.\n");
		}
		
		this.name = name;
	}

	/**
     * Sets the age of the Person object.
     *
     * @param age The new age of the Person (Precondition: non-negative).
     *
     * Postcondition: The age of the Person object is set to the provided value.
     */
	
	public void setAge(int age) {
		// Precondition check for age
		if (age < 0) {
			System.out.println("ERROR! Age cannot be negative.\n");
		}
		
		this.age = age;
	}
	
	/**
     * Convenience method to set both name and age of the Person object simultaneously.
     *
     * @param name The new name of the Person (Precondition: not null).
     * @param age The new age of the Person (Precondition: non-negative).
     *
     * Postcondition: The name and age of the Person object are set to the provided values.
     */

	public void setPerson(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	/**
     * Compares the current Person object with another object for equality.
     *
     * @param obj The object to compare with (Precondition: not null).
     *
     * @return True if the objects are equal (same name and age), false otherwise.
     */
	public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		Person other = (Person) obj;
		
		return name.equals(other.name) && age == other.age;
	}
	
	/**
	 * Precondition: Both the calling object and the otherObject must be properly intialized.
	 * Postcondition: Returns true if the objects are equal (same name), false otherwise.
	 */

	public boolean hasSameName(Person other) {
		
		return name.equals(other.name);
	}

	/**
	 * Precondition: Both the calling object and the otherObject must be properly intialized.
	 * Postcondition: Returns true if the objects are equal (same age), false otherwise.
	 */
	
	public boolean hasSameAge(Person other) {
		
		return age == other.age;
	}

	/**
	 * Precondition: Both the calling object and the otherObject must be properly intialized.
	 * Postcondition: Returns true if the object is older than the otherObject.
	 */
	
	public boolean isOlderThan(Person other) {
		
		return age > other.age;
	}

	/**
	 * Precondition: Both the calling object and the otherObject must be properly intialized.
	 * Postcondition: Returns true if the object is younger than the otherObject.
	 */
	
	public boolean isYoungerThan(Person other) {
		
		return age < other.age;
	}
}