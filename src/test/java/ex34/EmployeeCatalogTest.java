/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeCatalogTest {

    @Test
    void testRemoveEmployeeValid() {
        EmployeeCatalog ec = new EmployeeCatalog();
        String[] employeesBefore = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] employeesAfter  = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};

        // before removing employee
        int i = 0;
        for (String s : ec.getCurrentEmployees()) {
            assertEquals(employeesBefore[i], s);
            i++;
        }
        assertEquals(5, ec.getEmployeeCount());

        ec.removeEmployee("Chris Jones");

        i = 0;
        for (String s : ec.getCurrentEmployees()) {
            assertEquals(employeesAfter[i++], s);
        }
        assertEquals(4, ec.getEmployeeCount());
    }

    @Test
    void testRemoveEmployeeInvalid() {

    }

}