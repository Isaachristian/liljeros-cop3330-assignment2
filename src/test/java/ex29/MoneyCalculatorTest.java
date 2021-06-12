/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCalculatorTest {
    MoneyCalculator mc = new MoneyCalculator();

    @Test
    void testValidInput() throws Exception {
        mc.setInput("4");

        assertTrue(mc.isValidInput());
        assertEquals(18, mc.calculateYears());
    }

    @Test
    void testInvalidInput1() {
        mc.setInput("0");

        assertFalse(mc.isValidInput());
        assertThrows(Exception.class, () -> mc.calculateYears());
    }

    @Test
    void testInvalidInput2() {
        mc.setInput("ABC");

        assertFalse(mc.isValidInput());
        assertThrows(Exception.class, () -> mc.calculateYears());
    }
}