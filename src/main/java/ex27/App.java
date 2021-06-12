/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex27;

// ---------------------------------
// Exercise 27 - Validating Inputs
// ---------------------------------

import java.util.List;
import java.util.Scanner;

import static ex27.Validator.validateInput;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter the last name: ");
        String lastname = scanner.nextLine();
        System.out.print("Enter the zip: ");
        String zip = scanner.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = scanner.nextLine();

        List<String> errors = validateInput(firstname, lastname, zip, employeeID);

        System.out.println();

        for (String error : errors)
            System.out.println(error);
    }
}
