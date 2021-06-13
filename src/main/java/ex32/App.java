/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex32;

// -------------------------------------
// Exercise 32 - Guess the Number Game
// -------------------------------------

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");

        runGame();

        System.out.println();
        System.out.println("Good bye!");
    }

    private static void runGame() {
        Scanner scanner = new Scanner(System.in);
        boolean stillPlaying = true;
        while (stillPlaying) {
            System.out.println();

            // Get Difficulty
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            String difficulty = scanner.nextLine();

            GuessingGame gg;

            // Initialize game object. If number is not number or is out of range, ask again
            try {
                gg = new GuessingGame(Integer.parseInt(difficulty));
            } catch (IllegalArgumentException e) {
                System.out.println("You must enter a valid number between 1 and 3");
                System.out.println();
                continue;
            }

            System.out.print("I have my number. What's your guess? ");

            // while player has not won, ask for guesses
            while (!gg.getHasWon()) {
                try {
                    String guess = scanner.nextLine();
                    System.out.print(gg.checkGuess(guess));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    System.out.print("What's your guess? ");
                }
            }

            // Ask whether or not to play again?
            System.out.print("\nWould you like to play again (Y/N)? ");
            while (true) {
                String response = scanner.nextLine();

                if (response.toLowerCase(Locale.ROOT).equals("y")) {
                    break;
                } else if (response.toLowerCase(Locale.ROOT).equals("n")) {
                    stillPlaying = false;
                    break;
                }
                System.out.print("Invalid response! Enter again: ");
            }
        }
    }
}
