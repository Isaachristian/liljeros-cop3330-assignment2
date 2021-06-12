/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex27;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    // Errors
    private static final String errorFirstNameShort       = "The first name must be at least 2 characters long.";
    private static final String errorLastNameShort        = "The last name must be at least 2 characters long.";
    private static final String errorFirstNameNotPresent  = "The first name must be filled in.";
    private static final String errorLastNameNotPresent   = "The last name must be filled in.";
    private static final String errorZipcode              = "The zipcode must be a 5 digit number.";
    private static final String errorZipcodeNotPresent    = "The zipcode must be present.";
    private static final String errorEmployeeID           = "The employee ID must be in the format of AA-1234.";
    private static final String errorEmployeeIDNotPresent = "The employee ID must be present.";


    public static List<String> validateInput(String firstname, String lastname, String zip, String employeeID) {
        List<String> rawErrors = new ArrayList<String>();
        List<String> errors = new ArrayList<String>();

        rawErrors.add(validateFirstName(firstname));
        rawErrors.add(validateLastName(lastname));
        rawErrors.add(validateZip(zip));
        rawErrors.add(validateEmployeeID(employeeID));

        for (String error : rawErrors) {
            if (!error.equals("no_error"))
                errors.add(error);
        }

        if (errors.isEmpty())
            errors.add("There were no errors found.");

        return errors;
    }

    private static String validateFirstName(String firstname) {
        if (firstname.length() == 0)
            return errorFirstNameNotPresent;
        if (firstname.length() < 2)
            return errorFirstNameShort;

        // otherwise
        return "no_error";
    }

    private static String validateLastName(String lastname) {
        if (lastname.length() ==0)
            return errorLastNameNotPresent;
        if (lastname.length() < 2)
            return errorLastNameShort;

        // otherwise
        return "no_error";
    }

    private static String validateZip(String zip) {
        if (zip.length() == 0)
            return errorZipcodeNotPresent;

        boolean isNotAllNumbers = false;
        for (char c : zip.toCharArray()){
            if (!Character.isDigit(c))
                isNotAllNumbers = true;
        }

        if (zip.length() != 5 || isNotAllNumbers)
            return errorZipcode;

        return "no_error";
    }

    private static String validateEmployeeID(String employeeID) {
        if (employeeID.length() == 0)
            return errorEmployeeIDNotPresent;

        if (employeeID.length() != 7)
            return errorEmployeeID;

        String[] idParts = employeeID.split("-");
        if (idParts.length != 2)
            return errorEmployeeID;
        else {
            boolean part1IsLetters, part2ISLetters;
            for (char c : idParts[0].toCharArray()) {
                if (!Character.isLetter(c)) {
                    return errorEmployeeID;
                }
            }
            for (char c : idParts[1].toCharArray()) {
                if (!Character.isDigit(c)) {
                    return errorEmployeeID;
                }
            }
        }

        return "no_error";
    }
}
