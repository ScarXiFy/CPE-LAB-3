/*
============================================================================
FILE : FruitJuiceMachine.java
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
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class FruitJuiceMachine 
{
	static CashRegister register;
	static Dispenser appleJuice;
	static Dispenser orangeJuice;
	static Dispenser mangoLassi;
	static Dispenser fruitPunch;
    
    public static void main(String[] args) 
    {
    	register = new CashRegister();
    	appleJuice = new Dispenser(50, 2);
    	orangeJuice = new Dispenser(50, 3);
    	mangoLassi = new Dispenser(50, 4);
    	fruitPunch = new Dispenser(50, 5);

        int again;
        do 
        {
            chooseSelection();
            
            //confirming the user if they want to go back to the menu
            again = JOptionPane.showConfirmDialog(new JFrame(), "Buy again?");
        } while (again == JOptionPane.YES_OPTION);
    }
    /*
	 * shows the menu of the program
	 * @param - none
	 * @return - static void
	 */
    
    public static void chooseSelection()
    {
    	int choice;
    	choice = showSelection();
        //the options for the user to choose
        switch (choice) 
        {
            case 1: 
            	sellProduct(appleJuice, "Apple Juice");
            	break;
            case 2: 
            	sellProduct(orangeJuice, "Orange Juice");
            	break;
            case 3: 
            	sellProduct(mangoLassi, "Mango Lassi");
            	break;
            case 4: 
            	sellProduct(fruitPunch, "Fruit Punch");
            	break;
            case 5:
            	JOptionPane.showMessageDialog(null, "Current Balance: $" + register.getCurrentBalance());
            	break;
            default: 
            	JOptionPane.showMessageDialog(null, "Invalid selection. Try again.");
        }
    }
    /*
	 * shows the menu of the program
	 * @param - none
	 * @return - static int
	 */
    public static int showSelection() 
    {
        String menu = "Juice Machine Menu\n" +
                      "1. Apple Juice - $2 (" + appleJuice.getNoOfItems() + " left)\n" +
                      "2. Orange Juice - $3 (" + orangeJuice.getNoOfItems() + " left)\n" +
                      "3. Mango Lassi - $4 (" + mangoLassi.getNoOfItems() + " left)\n" +
                      "4. Fruit Punch - $5 (" + fruitPunch.getNoOfItems() + " left)\n" +
                      "5. Show Total Balance \n" + 
                      "Enter your choice (1-5): ";
        int choice = -1;
        boolean validInput = false;

        //validation for the selection
        while (!validInput) 
        {
            String input = JOptionPane.showInputDialog(menu);
            if(input == null)
            {
            	System.exit(0);
            }
            try 
            {
                choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 5) 
                {
                    validInput = true;         	
            	} else 
            	{
                    JOptionPane.showMessageDialog(null, "Invalid selection. Please enter a number between 1 and 5.");
                }
            } catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between 1 and 5.");
            }
        }
        return choice;
    }
    /*
	 * the calculating for the change
	 * @param - Dispenser dispenser, String productName
	 * @return - static void
	 */
    public static void sellProduct(Dispenser dispenser, String productName) 
    {
    	//to check if the quantity of item is enough
        if (dispenser.getNoOfItems() > 0) 
        {
            int quantity = getQuantity(dispenser.getNoOfItems(), productName);
           	int totalCost = quantity * dispenser.getCost();
            JOptionPane.showMessageDialog(null, quantity + " " + productName + " will cost $" + totalCost + ".");

            //validation for the input money
            boolean validChange = false;
            while(!validChange)
            {
            	boolean validAmount = true;
            	do
                {
	            	int amount = getDepositAmount(totalCost);
			        if (amount >= totalCost) 
			        {   
		               dispenser.makeSale(quantity);
			           validChange = true;
	                	register.acceptAmount(totalCost);
	                	// Calculate change
	                	int change = amount - totalCost;
	                	
	                	if(change <= register.getCurrentBalance())
	                	{
	                		validAmount = true;
	                		JOptionPane.showMessageDialog(null, "Here is your " + quantity + " " + productName + ". Enjoy!\n" +
	                                                     "Your change is $" + change + ".");
	                	}else
	                	{
	                		validAmount = false;
	                		JOptionPane.showMessageDialog(null, "Insufficient Change.");
	                	}
			        } 
			        else 
			         {		        	
			        	validChange = false;
			           JOptionPane.showMessageDialog(null, "Insufficient amount. Please try again.");
			         }
                }while(validAmount == false);
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, productName + " is sold out.");
        }
    }
    /*
	 * the calculating of the quantity
	 * @param - int maxItems, String productName
	 * @return - static int
	 */
    public static int getQuantity(int maxItems, String productName) 
    {
        int quantity = -1;
        
      //validation for the quantity input
        boolean validInput = false;
        while (!validInput) 
        {
            String input = JOptionPane.showInputDialog("Enter the number of " + productName + " you want to buy (Available: " + maxItems + "):");
            if(input == null)
            {
            	chooseSelection();
            }
            else
            {
	            try 
	            {
	                quantity = Integer.parseInt(input);
	                if (quantity > 0 && quantity <= maxItems) 
	                {
	                    validInput = true;
	                } else 
	                {
	                    JOptionPane.showMessageDialog(null, "Invalid quantity. Please enter a value between 1 and " + maxItems + ".");
	                }
	            } catch (NumberFormatException e) 
	            {
	                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
	            }
            }
        }
        return quantity;
    }
    /*
	 * the depositing of the money received
	 * @param - none
	 * @return - static int
	 */
    public static int getDepositAmount(int totalCost) 
    {
        int amount = -1;
        
        //validation for the money input
        boolean validInput = false;
        while (!validInput) 
        {
            String input = JOptionPane.showInputDialog("Please deposit the amount [$" + totalCost + "]:");
            if(input == null)
            {
            	chooseSelection();
            }
            else
            {
	            try {
	                amount = Integer.parseInt(input);
	                if (amount > 0) 
	                {
	                    validInput = true;
	                } else 
	                {
	                    JOptionPane.showMessageDialog(null, "Amount must be greater than 0. Please enter a valid amount.");
	                }
	            } catch (NumberFormatException e) 
	            {
	                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
	            }
            }
        }
        return amount;
    }
}