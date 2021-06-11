/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex24;

import java.util.Locale;

public class AnagramChecker {
    public boolean isAnagram(String word1, String word2) {
        int[] word1Breakdown;
        int[] word2Breakdown;

        if (word1.length() != word2.length()) {
            return false;
        } else {
            word1Breakdown = getLetterUsage(word1);
            word2Breakdown = getLetterUsage(word2);
        }

        for (int i = 0; i < word1Breakdown.length; i++) {
            if (word1Breakdown[i] != word2Breakdown[i])
                return false;
        }

        return true;
    }

    private int[] getLetterUsage(String word) {
        char[] alphebet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] letterUsage = new int[25];

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphebet.length; j++) {
                if (Character.toLowerCase(word.charAt(i)) == alphebet[j]) {
                    ++letterUsage[j];
                }
            }
        }

        return letterUsage;
    }
}
