/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex28;

// ------------------------------
// Exercise 28 - Adding Numbers
// ------------------------------

public class App {

    public static void main(String[] args) {
        Adder adder = new Adder();

        adder.readNumbers();
        adder.printSum();
    }
}
