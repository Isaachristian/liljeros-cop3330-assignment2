/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex25;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    public void testVeryWeakPassword() {
        String password = "1234567";
        int actual = validator.validatePassword(password);
        assertEquals(0, actual);
    }

    @Test
    public void testWeakPassword() {
        String password = "abcdefg";
        int actual = validator.validatePassword(password);
        assertEquals(1, actual);
    }

    @Test
    public void testFinePassword() {
        String password = "123abc!";
        int actual = validator.validatePassword(password);
        assertEquals(2, actual);
    }

    @Test
    public void testFinePassword2() {
        String password = "abcdefghi";
        int actual = validator.validatePassword(password);
        assertEquals(2, actual);
    }

    @Test
    public void testStrongPassword() {
        String password = "1234abcd";
        int actual = validator.validatePassword(password);
        assertEquals(3, actual);
    }

    @Test
    public void testVeryStrongPassword() {
        String password = "1234abcd!@#$";
        int actual = validator.validatePassword(password);
        assertEquals(4, actual);
    }

}