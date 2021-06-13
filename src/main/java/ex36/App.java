/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex36;

// ------------------------------------
// Exercise 36 - Computing Statistics
// ------------------------------------

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        CompStat compStat = new CompStat();

        // Loop entry till "done" entered
        while (true) {
            String number = promptForNumber();
            if (number.equals("done"))
                break;
            else {
                try {
                    compStat.addNumber(Double.parseDouble(number));
                } catch (IllegalArgumentException e) {
                    System.out.println("Enter a valid number");
                }
            }
        }

        // Print results
        System.out.println("Numbers: " + compStat);
        System.out.println("The average is: " + compStat.average());
        System.out.println("The minimum is: " + compStat.min());
        System.out.println("The maximum is: " + compStat.max());
        System.out.println("The standard deviation is: " + String.format("%.2f", compStat.std()));

    }

    public static String promptForNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextLine();
    }
}
