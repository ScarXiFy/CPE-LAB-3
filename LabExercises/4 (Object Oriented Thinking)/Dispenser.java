/*
============================================================================
FILE : Dispenser.java
AUTHOR : John Enrico Lauron
DESCRIPTION : contains all the methods for LE3_3
COPYRIGHT : September 25, 2024
REVISION HISTORY
Date: 		By:							 Description:
09/25		Lauron						Created the file
09/30		Linga						Added loops
09/30		Maravillas					Added comments
============================================================================
*/
package LE5;
	
public class Dispenser 
{
    private int numberOfItems;
    private int cost;
    //default constructor for the dispenser
    public Dispenser() 
    {
        numberOfItems = 50;
        cost = 2;
    }
    //customized constructor for the dispenser
    public Dispenser(int setNoOfItems, int setCost) 
    {
        numberOfItems = setNoOfItems;
        cost = setCost;
    }
    /*
	 * the returning of the current amount of items
	 * @param - none
	 * @return - int
	 */
    public int getNoOfItems() 
    {
        return numberOfItems;
    }
    /*
	 * the returning of the item's cost
	 * @param - none
	 * @return - int
	 */
    public int getCost() 
    {
        return cost;
    }
    /*
	 * the subtracting of the total quantity
	 * @param - int quantity
	 * @return - void
	 */
    public void makeSale(int quantity) 
    {
        if (numberOfItems >= quantity) 
        {
            numberOfItems -= quantity;
        }
    }
}