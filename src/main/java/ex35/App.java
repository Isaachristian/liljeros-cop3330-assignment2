/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex35;

// --------------------------------
// Exercise 35 - Picking a Winner
// --------------------------------

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        WinnerPicker winnerPicker = new WinnerPicker();

        // while names are given, prompt for names
        while (true) {
            String contestant = promptForName();
            if (contestant.trim().length() > 0)
                winnerPicker.addContestant(contestant);
            else
                break;
        }

        // display winner
        System.out.println("The winner is... " + winnerPicker.pickContestant() + ".");
    }

    public static String promptForName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return scanner.nextLine();
    }
}
