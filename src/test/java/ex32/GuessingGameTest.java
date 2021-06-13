/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    // test easy gg
    @Test
    void testEasyGuessingGame() {
        GuessingGame gg = new GuessingGame(1);
        gg.setNumberToGuess(8);

        assertFalse(gg.getHasWon());
        assertEquals("Too high. Guess again: ", gg.checkGuess("10"));
        assertEquals("Too low. Guess again: ",  gg.checkGuess("1"));
        assertEquals("You got it in 3 guesses!", gg.checkGuess("8"));
        assertTrue(gg.getHasWon());
    }

    // test medium gg with invalid guess
    @Test
    void testMediumGuessingGame() {
        GuessingGame gg = new GuessingGame(2);
        gg.setNumberToGuess(80);

        assertFalse(gg.getHasWon());
        assertEquals("Too high. Guess again: ", gg.checkGuess("99"));
        assertThrows(IllegalArgumentException.class, () -> gg.checkGuess("110"));
        assertEquals("Too low. Guess again: ",  gg.checkGuess("10"));
        assertEquals("You got it in 3 guesses!", gg.checkGuess("80"));
        assertTrue(gg.getHasWon());
    }


}