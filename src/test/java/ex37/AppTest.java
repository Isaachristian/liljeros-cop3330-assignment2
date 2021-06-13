/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testMakePassword() {
        String password = App.generatePassword(20, 3, 3);

        int letters = 0;
        int numbers = 0;

        for (char c : password.toCharArray()) {
            if(Character.isDigit(c)) numbers++;
            if(Character.isLetter(c)) letters++;
        }

        assertEquals(3, numbers);
        assertEquals(14, letters);

    }

    @Test
    void testMakeInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> App.generatePassword(10, 5, 2));
    }

}