package ex24;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnagramChecker checker = new AnagramChecker();

        String userInut;
        String word1, word2;

        System.out.println("Enter two strings (separated by a space):");
        userInut = scanner.nextLine();

        String[] words = userInut.split(" ");

        if (words.length == 2) {
            System.out.println(checker.isAnagram(words[0], words[1]));
        } else {
            System.out.println("Invalid input entered");
        }

    }
}
