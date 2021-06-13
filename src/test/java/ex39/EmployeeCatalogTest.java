/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeCatalogTest {

    @Test
    void testAddingAndSortingEmployees() {
        EmployeeCatalog ec = new EmployeeCatalog();
        App.addEmployees(ec);

        String[] expected = {"Jacquelyn Jackson", "Jake Jacobson", "John Johnson", "Michaela Michaelson", "Sally Webber", "Tou Xiong"};
        assertArrayEquals(expected, ec.getSortedEmployeeNames().toArray());

        // ec.getEmployees();
    }

}