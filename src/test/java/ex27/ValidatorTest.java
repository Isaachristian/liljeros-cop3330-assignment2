/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex27;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static ex27.Validator.validateInput;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void testValidEntry() {
        List<String> errors = validateInput("Isaac", "Liljeros", "32771", "AB-1234");

        assertEquals(1, errors.size());
        assertEquals("There were no errors found.", errors.get(0));
    }

    @Test
    public void testInvalidFirstName() {
        List<String> errorsNoName = validateInput("", "Liljeros", "32771", "AB-1234");
        List<String> errorsSmallName = validateInput("I", "Liljeros", "32771", "AB-1234");

        List<String> expected1 = Arrays.asList("The first name must be filled in.");
        List<String> expected2 = Arrays.asList("The first name must be at least 2 characters long.");

        assertEquals(expected1, errorsNoName);
        assertEquals(expected2, errorsSmallName);
    }

    @Test
    public void testInvalidLastName() {
        List<String> errorsNoName = validateInput("Isaac", "", "32771", "AB-1234");
        List<String> errorsSmallName = validateInput("Isaac", "L", "32771", "AB-1234");

        List<String> expected1 = Arrays.asList("The last name must be filled in.");
        List<String> expected2 = Arrays.asList("The last name must be at least 2 characters long.");

        assertEquals(expected1, errorsNoName);
        assertEquals(expected2, errorsSmallName);
    }

    @Test
    public void testInvalidZip() {
        List<String> errorsNoZip = validateInput("Isaac", "Liljeros", "", "AB-1234");
        List<String> errorInvalidZip = validateInput("Isaac", "Liljeros", "ab123", "AB-1234");

        List<String> expected1 = Arrays.asList("The zipcode must be present.");
        List<String> expected2 = Arrays.asList("The zipcode must be a 5 digit number.");

        assertEquals(expected1, errorsNoZip);
        assertEquals(expected2, errorInvalidZip);
    }

    @Test
    public void testInvalidID() {
        List<String> errorsNoID     = validateInput("Isaac", "Liljeros", "32771", "");
        List<String> errorsInvalid1 = validateInput("Isaac", "Liljeros", "32771", "12-ABCD");
        List<String> errorsInvalid2 = validateInput("Isaac", "Liljeros", "32771", "I-123");
        List<String> errorsInvalid3 = validateInput("Isaac", "Liljeros", "32771", "ABC");

        List<String> expected1 = Arrays.asList("The employee ID must be present.");
        List<String> expected2 = Arrays.asList("The employee ID must be in the format of AA-1234.");
        List<String> expected3 = Arrays.asList("The employee ID must be in the format of AA-1234.");
        List<String> expected4 = Arrays.asList("The employee ID must be in the format of AA-1234.");

        assertEquals(expected1, errorsNoID);
        assertEquals(expected2, errorsInvalid1);
        assertEquals(expected3, errorsInvalid2);
        assertEquals(expected4, errorsInvalid3);
    }
}