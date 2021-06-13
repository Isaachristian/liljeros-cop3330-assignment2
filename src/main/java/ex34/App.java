/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex34;

// -------------------------------------
// Exercise 34 - Employee List Removal
// -------------------------------------

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        EmployeeCatalog employeeCatalog = new EmployeeCatalog();
        Scanner scanner = new Scanner(System.in);

        printEmployees(employeeCatalog.getCurrentEmployees(), employeeCatalog);

        System.out.println();

        while (true) {
            try {
                System.out.print("Enter an employee name to remove: ");
                employeeCatalog.removeEmployee(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();

        printEmployees(employeeCatalog.getCurrentEmployees(), employeeCatalog);

    }

    private static void printEmployees(String[] employees, EmployeeCatalog employeeCatalog) {
        System.out.println("There are " + employeeCatalog.getEmployeeCount() + " employees:");
        for (String employee : employees)
            System.out.println(" - " + employee);
    }
}
