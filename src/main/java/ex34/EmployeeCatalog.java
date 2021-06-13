/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex34;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmployeeCatalog {
    private List<String> Employees = new LinkedList<>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));

    public void removeEmployee(String name) throws IllegalArgumentException {
        if (Employees.contains(name)) {
            Employees.remove(name);
        } else {
            throw new IllegalArgumentException("Cannot find employee!");
        }
    }

    public String[] getCurrentEmployees() {
        return Employees.toArray(new String[0]);
    }

    public int getEmployeeCount() {
        return Employees.toArray().length;
    }
}
