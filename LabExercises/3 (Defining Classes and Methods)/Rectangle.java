package laboratoryExercises;

public class Rectangle {
	
	// Private fields to store width and height
	private double width;
	private double height;

	/**
     * Default constructor that creates a Rectangle object with width and height of 1.0.
     *
     * Postcondition: The width and height of the Rectangle object are set to 1.0.
     */

	public Rectangle() {

		this.width = 1.0;
		this.height = 1.0;

	}

	/**
     * Constructor that creates a Rectangle object with specified width and height.
     *
     * @param width The width of the Rectangle (Precondition: non-negative).
     * @param height The height of the Rectangle (Precondition: non-negative).
     *
     * Postcondition: The width and height of the Rectangle object are set to the provided values.
     */

	public Rectangle(double width, double height) {
		// Precondition check for width
		if (width < 0) {
			System.out.println("ERROR! Width cannot be negative.\n");
		}

		this.width = width;

		// Precondition check for height
		if (height < 0) {
			System.out.println("ERROR! Width cannot be negative.\n");
		}
		this.height = height;
	}

	/**
     * @return The width of the Rectangle object.
     */

	public double getWidth() {

		return width;
	}

	/**
     * @return The height of the Rectangle object.
     */

	public double getHeight() {

		return height;
	}

	/**
     * Sets the width of the Rectangle object.
     *
     * @param width The new width of the Rectangle (Precondition: non-negative).
     *
     * Postcondition: The width of the Rectangle object is set to the provided value.
     */
	
	public void setWidth(double width) {
		// Precondition check for width
		if (width < 0) {
			System.out.println("ERROR! Width cannot be negative.\n");
		}

		this.width = width;
	}

	/**
     * Sets the height of the Rectangle object.
     *
     * @param height The new height of the Rectangle (Precondition: non-negative).
     *
     * Postcondition: The height of the Rectangle object is set to the provided value.
     */

	public void setHeight(double height) {
		// Precondition check for height
		if (height < 0) {
			System.out.println("ERROR! Height cannot be negative.\n");
		}

		this.height = height;
	}

	/**
     * Convenience method to set both width and height of the Rectangle object simultaneously.
     *
     * @param width The new width of the Rectangle (Precondition: non-negative).
     * @param height The new height of the Rectangle (Precondition: non-negative).
     *
     * Postcondition: The width and height of the Rectangle object are set to the provided values.
     */

	public void setRectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	/**
     * Calculates the area of the Rectangle object.
     *
     * @return The area of the Rectangle object.
     */

	public double getArea(double width, double height) {

		double area;
		
		area = width * height;

		return area;
	}

	/**
     * Calculates the perimeter of the Rectangle object.
     *
     * @return The perimeter of the Rectangle object.
     */
	
	public double getPerimeter(double width, double height) {

		double perimeter;

		perimeter = 2 * (width + height);

		return perimeter;
	}
	
}
