/*
============================================================================
FILE : Authentication.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Pin Authentication
COPYRIGHT : October 21, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

import java.util.Random;

public class Authentication
{
    public static int[] generateRandomPin()
    {
        Random random = new Random();
        int[] randomNums = new int[10];

        for (int i = 0; i < randomNums.length; i++)
        {
            randomNums[i] = random.nextInt(9) + 1;
        }
        return randomNums;
    }

    public static boolean validatePin(String actualPin, String userInput, int[] randomNums)
    {
        StringBuilder expectedInput = new StringBuilder();

        for (int i = 0; i < actualPin.length(); i++)
        {
            int pinDigit = Character.getNumericValue(actualPin.charAt(i));
            expectedInput.append(randomNums[pinDigit]);
        }
        
        return expectedInput.toString().equals(userInput);
    }
}