/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex30;

// ------------------------------------
// Exercise 30 - Multiplication Table
// ------------------------------------

public class App {

    public static void main(String[] args) {
        System.out.println(generateMultiplicationTable());
    }

    public static String generateMultiplicationTable() {
        StringBuilder table = new StringBuilder();

        // double iterate through 12 to generate table
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                table.append(String.format("%5d", i * j));
            }
            table.append("\n");
        }

        return table.toString();
    }
}
