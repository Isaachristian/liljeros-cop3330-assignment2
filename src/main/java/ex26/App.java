/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex26;

import java.util.Scanner;

// --------------------------------------------
// Exercise 26: Months to Pay Off Credit Card
// --------------------------------------------

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your credit card balance? $");
        double balance = scanner.nextDouble();

        System.out.print("What is the card's APR (enter as percentage? %");
        double APR = scanner.nextDouble();

        System.out.print("What is the monthly payment you can make? $");
        double monthlyPayment = scanner.nextDouble();

        CreditCard card = new CreditCard(balance, APR);
        int months = PaymentCalculator.calculateMonthsUntilPayedOff(card, monthlyPayment);

        System.out.println("It will take " + months + " months to pay off this card");
    }
}
