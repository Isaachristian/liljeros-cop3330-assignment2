/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex32;

import java.security.SecureRandom;

public class GuessingGame {
    private int difficulty;
    private int numberToGuess;
    private int numberOfGuesses;
    private boolean hasWon;

    GuessingGame(int difficulty) {
        setDifficulty(difficulty);
        generateNumberToGuess();
    }

    // True if guess is correct
    public String checkGuess(String guess) throws IllegalArgumentException {
        if (validateGuess(guess)) {
            int guessInt = Integer.parseInt(guess);

            if (guessInt > Math.pow(10, difficulty))
                throw new IllegalArgumentException("Guess is out of the games range!");

            numberOfGuesses++;

            if (guessInt > numberToGuess)
                return "Too high. Guess again: ";

            if (guessInt < numberToGuess)
                return "Too low. Guess again: ";

            // if none of the above return, the guess was right
            hasWon = true;
            if (numberOfGuesses == 1)
                return "You got it in " + numberOfGuesses + " guess!";
            else
                return "You got it in " + numberOfGuesses + " guesses!";
        }

        throw new IllegalArgumentException("Guess must be valid positive number!");
    }

    public boolean getHasWon() {
        return hasWon;
    }

    private boolean validateGuess(String guess) {
        boolean isPositiveNumber = true;
        for (char c : guess.toCharArray())
            isPositiveNumber = Character.isDigit(c) && isPositiveNumber;

        return isPositiveNumber;
    }

    private void setDifficulty(int difficulty) {
        if (difficulty > 0 && difficulty <= 3)
            this.difficulty = difficulty;
        else
            throw new IllegalArgumentException("Difficulty must be 1, 2, or 3");
    }

    private void generateNumberToGuess() {
        SecureRandom sr = new SecureRandom();
        numberToGuess = sr.nextInt((int) Math.pow(10, difficulty));
    }

    // Testing Functions
    void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }
}
