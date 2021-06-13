/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex39;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class EmployeeCatalog {

    private final Map<String, String[]> employees = new HashMap<>();

    public void addEmployee(String name, String position, String separationDate) {
        String[] employeeInfo = {position, separationDate};
        employees.put(name, employeeInfo);
    }

    public Map<String, String[]> getEmployees() {
        return employees;
    }

    public TreeSet<String> getSortedEmployeeNames() {
        return new TreeSet<>(employees.keySet());
    }

    public TreeSet<String> getFilteredEmployeeNames(String filter) {
        TreeSet<String> filteredEmployees = new TreeSet<>();

        for (String key : employees.keySet())
            if (key.contains(filter))
                filteredEmployees.add(key);

        return filteredEmployees;
    }
}
