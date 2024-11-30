/*
============================================================================
FILE : CashRegister.java
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

public class CashRegister 
{
    private int cashOnHand;
    public CashRegister() 
    {
        cashOnHand = 5;
    }

    public CashRegister(int cashIn) 
    {
        cashOnHand = cashIn;
    }
    /*
	 * the returning of the current balance
	 * @param - none
	 * @return - int
	 */
    public int getCurrentBalance() 
    {
        return cashOnHand;
    }
    /*
	 * the adding of the current money into the register
	 * @param - int amountIn
	 * @return - static void
	 */
    public void acceptAmount(int amountIn) 
    {
        cashOnHand += amountIn;
    }
}