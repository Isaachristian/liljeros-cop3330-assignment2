/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WinnerPickerTest {

    @Test
    void testAddContestant() {
        WinnerPicker wp = new WinnerPicker();

        assertEquals(0, wp.getNumberOfContestants());

        wp.addContestant("George");

        assertEquals(1, wp.getNumberOfContestants());
    }

    @Test
    void testReturnsAddedContestant() {
        WinnerPicker wp = new WinnerPicker();
        String[] contestants = {"Bob", "George", "Frank", "Rose", "Kitty"};

        for (String c : contestants)
            wp.addContestant(c);

        String winner = wp.pickContestant();

        boolean foundWinner = false;
        for (String c : contestants)
            foundWinner = foundWinner || c.equals(winner);

        assertTrue(foundWinner);
    }
}