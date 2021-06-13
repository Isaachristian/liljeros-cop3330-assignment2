/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex37;

import java.security.SecureRandom;
import java.util.Scanner;

public class App {
    private static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static char[] special = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the minimum length? ");
        int length = scanner.nextInt();
        System.out.print("How many special characters? ");
        int special = scanner.nextInt();
        System.out.print("How many numbers? ");
        int numbers = scanner.nextInt();

        System.out.println("Your password is " + generatePassword(length, special, numbers));
    }

    public static String generatePassword(int length, int specialChar, int numbers) throws IllegalArgumentException {
        // make sure that there are at least as many letters as there are special characters and numbers
        if (specialChar + numbers <= length / 2) {
            SecureRandom secureRandom = new SecureRandom();
            StringBuilder passwordBuilder = new StringBuilder();

            int lettersNeeded = length - numbers - specialChar;

            for (int i = 0; i < length; i++) {
                // first, pick whether to add number, letter, or special

                // choices: 0 -> letter, 1 -> number, 2 -> special
                int choice = makeChoice(lettersNeeded, specialChar, numbers, secureRandom);

                switch (choice) {
                    case 0:
                        passwordBuilder.append(letters[secureRandom.nextInt(26)]);
                        lettersNeeded--;
                        break;
                    case 1:
                        passwordBuilder.append(secureRandom.nextInt(10));
                        numbers--;
                        break;
                    case 2:
                        passwordBuilder.append(special[secureRandom.nextInt(10)]);
                        specialChar--;
                        break;
                }
            }

            return passwordBuilder.toString();

        } else {
            throw new IllegalArgumentException("Must be less than half non-letter characters");
        }
    }

    private static int makeChoice(int lettersNeeded, int specialChar, int numbers, SecureRandom sr) {

        if      (lettersNeeded != 0 && numbers != 0 && specialChar != 0)
            return sr.nextInt(3);
        else if (lettersNeeded == 0 && numbers != 0 && specialChar != 0)
            return sr.nextInt(2) + 1;
        else if (lettersNeeded != 0 && numbers == 0 && specialChar != 0)
            return 0;
        else if (lettersNeeded != 0 && numbers != 0 && specialChar == 0)
            return sr.nextInt(2);
        else if (lettersNeeded != 0 && numbers == 0 && specialChar == 0)
            return 0;
        else if (lettersNeeded == 0 && numbers != 0 && specialChar == 0)
            return 1;
        else if (lettersNeeded == 0 && numbers == 0 && specialChar != 0)
            return 2;

        throw new IllegalArgumentException("Should not have been called!");
    }
}
