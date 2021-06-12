/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {

    @Test
    public void testAddingIntegers() {
        Adder adder = new Adder();
        double[] numbers = {1, 2, 3, 4, 5};

        adder.setInputtedNumbers(numbers);

        assertEquals(15, adder.printSum());
    }

    @Test
    public void testAddingDoubles() {
        Adder adder = new Adder();
        double[] numbers = {1.3, 26.2, 398.456, 4.2, 100};

        adder.setInputtedNumbers(numbers);

        assertEquals(530.156, adder.printSum(), 0.0001);
    }

}