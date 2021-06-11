/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex24;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnagramChecker checker = new AnagramChecker();

        String userInut;
        String word1, word2;

        System.out.print("Enter two strings (separated by a space) to see if they are an anagram: ");
        userInut = scanner.nextLine();

        String[] words = userInut.split(" ");

        if (words.length == 2) {
            if (checker.isAnagram(words[0], words[1]))
                System.out.printf("%s and %s are anagrams", words[0], words[1]);
            else
                System.out.printf("%s and %s are not anagrams", words[0], words[1]);
        } else {
            System.out.println("Invalid input entered");
        }

    }
}
