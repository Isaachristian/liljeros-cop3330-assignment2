/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testResponses() {
        assertEquals("Yes",              App.magicEightBall(0));
        assertEquals("No",               App.magicEightBall(1));
        assertEquals("Maybe",            App.magicEightBall(2));
        assertEquals("Ask again later.", App.magicEightBall(3));
        assertThrows(IllegalArgumentException.class, () -> App.magicEightBall(5));
        assertThrows(IllegalArgumentException.class, () -> App.magicEightBall(-1));
    }

}