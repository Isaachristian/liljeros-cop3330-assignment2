/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex31;

// -----------------------------------
// Exercise 31 - Karvonen Heart Rate
// -----------------------------------

import java.util.Scanner;

public class App {
    private static String restingPulse;
    private static String age;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        setPulseAge(scanner);

        while (!validateInputs()) {
            setPulseAge(scanner);
        }

        System.out.println(HeartTableGenerator.generateTable(Integer.parseInt(age), Integer.parseInt(restingPulse)));
    }

    public static boolean validateInputs() {
        if (restingPulse.length() > 0 && age.length() > 0) {
            for (char c : restingPulse.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            for (char c : age.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    private static void setPulseAge(Scanner scanner) {
        System.out.print("Enter your resting pulse: ");
        restingPulse = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextLine();
    }

    public static void setPulseAgeInternal(String pulse, String ageInput) {
        restingPulse = pulse;
        age = ageInput;
    }
}
