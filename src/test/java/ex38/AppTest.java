/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex38;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testValidEntries() {
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] evenNumbers = {"2", "4", "6", "8"};

        assertArrayEquals(evenNumbers, App.filterEvenNumbers(numbers));
    }

    @Test
    void testInvalidEntry() {
        String[] notNumbers = {"1", "abc"};

        assertThrows(IllegalArgumentException.class, () -> App.filterEvenNumbers(notNumbers));
    }

}