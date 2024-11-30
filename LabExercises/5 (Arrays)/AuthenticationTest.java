/*
============================================================================
FILE : AuthenticationTest.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Pin Authentication
COPYRIGHT : October 21, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/
import javax.swing.*;

public class AuthenticationTest
{
	
    public static void main(String[] args)
    {
        String actualPin = "243621";

        int[] randomNums = Authentication.generateRandomPin();

        StringBuilder message = new StringBuilder("PIN:   0 1 2 3 4 5 6 7 8 9\nNUM: ");
        for (int num : randomNums)
        {
            message.append(num).append(" ");
        }

        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 5 && !authenticated)
        {
            String userInput = JOptionPane.showInputDialog(null, message + "\nEnter the randomized PIN (Attempt " + (attempts + 1) + " of 5):", "PIN Authentication", JOptionPane.QUESTION_MESSAGE);

            if (userInput == null)
            {
                break;
            }

            if (Authentication.validatePin(actualPin, userInput, randomNums))
            {
                JOptionPane.showMessageDialog(null, "Authentication successful!", "Result", JOptionPane.INFORMATION_MESSAGE);
                authenticated = true;
            } else
            {
                JOptionPane.showMessageDialog(null, "Authentication failed.", "Result", JOptionPane.ERROR_MESSAGE);
                attempts++;
            }
        }

        if (!authenticated)
        {
            JOptionPane.showMessageDialog(null, "Maximum attempts reached. Access denied.", "Result", JOptionPane.WARNING_MESSAGE);
        }
    }
}
