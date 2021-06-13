/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompStatTest {

    CompStat compStat = new CompStat();

    @Test
    void testAddNumbers() {
        compStat.addNumber(100);
        compStat.addNumber(200);
        compStat.addNumber(1000);
        compStat.addNumber(300);

        assertThrows(IllegalArgumentException.class, () -> compStat.addNumber(-200));
        assertEquals("100.0, 200.0, 1000.0, 300.0", compStat.toString());
        assertEquals(400.0, compStat.average(), .01);
        assertEquals(100, compStat.min(), .01);
        assertEquals(1000, compStat.max(), .01);
        assertEquals(353.55, compStat.std(), .01);
    }


}