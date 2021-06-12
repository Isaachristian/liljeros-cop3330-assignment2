/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex24;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {

    @Test
    @Tag("Test Valid Anigram 1")
    public void testIsAnagram1() {
        String word1 = "tone";
        String word2 = "note";

        AnagramChecker checker = new AnagramChecker();

        boolean actualResult   = checker.isAnagram(word1, word2);
        boolean expectedResult = true;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Tag("Test Valid Anigram 2")
    public void testIsAnagram2() {
        String word1 = "ate";
        String word2 = "tea";

        AnagramChecker checker = new AnagramChecker();

        boolean actualResult   = checker.isAnagram(word1, word2);
        boolean expectedResult = true;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Tag("Test Valid Anigram 1")
    public void testIsNotAnagram1() {
        String word1 = "tone";
        String word2 = "goose";

        AnagramChecker checker = new AnagramChecker();

        boolean actualResult   = checker.isAnagram(word1, word2);
        boolean expectedResult = false;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @Tag("Test Valid Anigram 2")
    public void testIsNotAnagram2() {
        String word1 = "Arnold";
        String word2 = "shorty";

        AnagramChecker checker = new AnagramChecker();

        boolean actualResult   = checker.isAnagram(word1, word2);
        boolean expectedResult = false;

        assertEquals(expectedResult, actualResult);
    }

}