/*
============================================================================
FILE : HangmanTest.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Hangman Game.
COPYRIGHT : October 21, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/
import javax.swing.*;

public class HangmanTest
{
    public static void main(String[] args)
    {
        boolean playAgain = true;

        while (playAgain)
        {
            Hangman game = new Hangman();
            while (!game.isWordGuessed())
            {
                String guessedWord = game.getGuessedLetter();
                String input = JOptionPane.showInputDialog(null, "Enter a letter in word " + guessedWord + " > ");
                if (input == null || input.length() == 0)
                {
                    continue;
                }
                char guess = input.charAt(0);

                if (!game.makeGuess(guess))
                {
                    JOptionPane.showMessageDialog(null, guess + " is not in the word.");
                }
            }

            JOptionPane.showMessageDialog(null, "The word is " + game.getWordToGuess() + ". You missed " + game.getMisses() + " time(s).");
            int response = JOptionPane.showConfirmDialog(null, "Do you want to guess another word?", "Play Again", JOptionPane.YES_NO_OPTION);
            playAgain = (response == JOptionPane.YES_OPTION);
        }
    }
}
