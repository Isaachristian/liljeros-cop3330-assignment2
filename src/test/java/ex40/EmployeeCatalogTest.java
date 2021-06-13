/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex40;

import ex39.App;
import ex39.EmployeeCatalog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EmployeeCatalogTest {

    @Test
    void testAddingAndFilteringEmployees() {
        EmployeeCatalog ec = new EmployeeCatalog();
        App.addEmployees(ec);

        String[] expected = {"Jacquelyn Jackson", "Jake Jacobson"};
        assertArrayEquals(expected, ec.getFilteredEmployeeNames("Ja").toArray());

        // ec.getEmployees();
    }

}