/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex38;

// --------------------------------
// Exercise 38 - Filtering Values
// --------------------------------

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");


        try {
            String[] result = filterEvenNumbers(scanner.nextLine().split(" "));

            System.out.print("The even numbers are ");
            for (String s : result)
                System.out.print(s + " ");
        } catch (NumberFormatException e) {
            System.out.println("The entered data was not all numbers...");
            exit(-1);
        }
    }

    public static String[] filterEvenNumbers(String[] numbers) throws NumberFormatException {
        List<String> evenNumbers = new ArrayList<>(); // create list

        // Iterate through list
        for (String s : numbers) {
            if (Integer.parseInt(s) % 2 == 0) { // If even
                evenNumbers.add(s);
            }
        }

        return evenNumbers.toArray(new String[0]);
    }
}
