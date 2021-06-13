/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex39;

// -------------------------------
// Exercise 39 - Sorting Records
// -------------------------------

import java.util.Map;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        EmployeeCatalog employeeCatalog = new EmployeeCatalog();
        addEmployees(employeeCatalog);
        System.out.println();
        printEmployees(employeeCatalog, employeeCatalog.getSortedEmployeeNames());
    }

    public static void addEmployees(EmployeeCatalog employeeCatalog) {
        employeeCatalog.addEmployee("John Johnson", "Manager", "2016-12-31");
        employeeCatalog.addEmployee("Tou Xiong", "Software Engineer", "2016-12-31");
        employeeCatalog.addEmployee("Michaela Michaelson", "District Manager", "2016-12-31");
        employeeCatalog.addEmployee("Jake Jacobson", "Programmer", "");
        employeeCatalog.addEmployee("Jacquelyn Jackson", "DBA", "");
        employeeCatalog.addEmployee("Sally Webber", "Web Developer", "2016-12-31");
    }

    public static void printEmployees(EmployeeCatalog employeeCatalog, Set<String> employees) {
        Map<String, String[]> employeesMap = employeeCatalog.getEmployees();

        System.out.printf("%-20s | %-20s | %-20s\n", "Name", "Position", "Separation Date");
        System.out.printf("%20s|%20s|%20s\n", "---------------------", "----------------------", "---------------------");

        for(String s : employees)
            System.out.printf("%-20s | %-20s | %-20s\n", s, employeesMap.get(s)[0], employeesMap.get(s)[1]);
    }
}
