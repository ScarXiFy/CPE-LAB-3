/*
============================================================================
FILE : Hangman.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Hangman Game.
COPYRIGHT : October 21, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/
import java.util.Random;

public class Hangman
{
    private static final String[] words = {"enricogwapo", "volleyball", "joptionpane", "password", "enricocute", "eclipseide", "database", "onepiece", "canada", "circuits"};
    private String wordToGuess;
    private char[] guessedLetter;
    private int misses;

    public Hangman() {
        Random random = new Random();
        wordToGuess = words[random.nextInt(words.length)];
        guessedLetter = new char[wordToGuess.length()];
        for (int i = 0; i < guessedLetter.length; i++)
        {
        	guessedLetter[i] = '*';
        }
        misses = 0;
    }

    public String getGuessedLetter()
    {
        return new String(guessedLetter);
    }

    public boolean makeGuess(char guess)
    {
        boolean correct = false;
        for (int i = 0; i < wordToGuess.length(); i++)
        {
            if (wordToGuess.charAt(i) == guess)
            {
            	guessedLetter[i] = guess;
                correct = true;
            }
        }
        if (!correct)
        {
            misses++;
        }
        return correct;
    }

    public boolean isWordGuessed()
    {
        return !new String(guessedLetter).contains("*");
    }

    public int getMisses()
    {
        return misses;
    }

    public String getWordToGuess()
    {
        return wordToGuess;
    }
}
