/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex33;

// ---------------------------
// Exercise 33 - Magic 8 Ball
// ---------------------------

import java.security.SecureRandom;
import java.util.Scanner;

public class App {
    private static final String[] responses = {"Yes", "No", "Maybe", "Ask again later."};

    public static void main(String[] args) {
        System.out.println("What's your question? ");
        new Scanner(System.in).nextLine();

        System.out.println();
        System.out.println(magicEightBall(generateRandomNumber()));

        for (int i = 0; i < 10; i++) {
            System.out.println(generateRandomNumber());
        }
    }

    static String magicEightBall(int randomNumber) throws IllegalArgumentException {
        if (randomNumber >= 0 && randomNumber <= 3)
            return responses[randomNumber];
        else
            throw new IllegalArgumentException("Random number should be between 0 and 3");
    }

    static int generateRandomNumber() {
        SecureRandom sr = new SecureRandom();
        return sr.nextInt(4);
    }
}
