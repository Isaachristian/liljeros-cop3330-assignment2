/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartTableGeneratorTest {

    @Test
    void testTableGenerator() {
        String expected =
                "Intensity    | Rate   \n" +
                "-------------|--------\n" +
                "55%          | 138 bpm\n" +
                "60%          | 144 bpm\n" +
                "65%          | 151 bpm\n" +
                "70%          | 158 bpm\n" +
                "75%          | 164 bpm\n" +
                "80%          | 171 bpm\n" +
                "85%          | 178 bpm\n" +
                "90%          | 184 bpm\n" +
                "95%          | 191 bpm\n";

        String actual = HeartTableGenerator.generateTable(22, 65);

        assertEquals(expected, actual);
    }

    @Test
    void testInputValidatorValid() {
        App.setPulseAgeInternal("65", "22");
        assertTrue(App.validateInputs());
    }

    @Test
    void testInputValidatorInvalidPulse() {
        App.setPulseAgeInternal("-30", "22");
        assertFalse(App.validateInputs());
    }

    @Test
    void testInputValidatorInvalidAge() {
        App.setPulseAgeInternal("65", "A");
        assertFalse(App.validateInputs());
    }


}