/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex29;

// ------------------------------
// Exercise 28 - Adding Numbers
// ------------------------------

import java.util.Scanner;

import static java.lang.System.exit;

public class App {
    public static MoneyCalculator mc = new MoneyCalculator();

    public static void main(String[] args) {

        grabNextInput();

        while (!mc.isValidInput()) {
            System.out.println("Sorry. That's not a valid input.");
            grabNextInput();
        }

        try {
            System.out.println("It will take " + mc.calculateYears() + " years to double your investment.");
        } catch (Exception e) {
            System.out.println("Error: Input was still not valid");
            exit(-1);
        }

    }

    public static void grabNextInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        mc.setInput(scanner.nextLine());
    }

}
