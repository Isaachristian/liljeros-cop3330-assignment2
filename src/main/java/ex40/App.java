/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex40;

import ex39.EmployeeCatalog;

import java.util.Scanner;

import static ex39.App.addEmployees;
import static ex39.App.printEmployees;

// -------------------------------
// Exercise 39 - Sorting Records
// -------------------------------

public class App {

    public static void main(String[] args) {
        EmployeeCatalog employeeCatalog = new EmployeeCatalog();
        Scanner scanner = new Scanner(System.in);
        addEmployees(employeeCatalog);

        System.out.print("Enter a search string: ");
        String filter = scanner.nextLine();

        System.out.println("\nResults:\n");

        printEmployees(employeeCatalog, employeeCatalog.getFilteredEmployeeNames(filter));
    }
}
