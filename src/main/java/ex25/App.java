/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex25;

/*
 - Exercise 25: Password Strength Indicator
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordValidator validator = new PasswordValidator();

        System.out.println("Enter a password: ");
        String password = scanner.nextLine();
        int result = validator.validatePassword(password);

        switch (result) {
            case 0:
                System.out.printf("The password %s is a very weak password", password);
                break;
            case 1:
                System.out.printf("The password %s is a weak password", password);
                break;
            case 2:
                System.out.printf("The password %s is a fine password", password);
                break;
            case 3:
                System.out.printf("The password %s is a strong password", password);
                break;
            case 4:
                System.out.printf("The password %s is a very strong password", password);
                break;
        }

    }

}
