/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex28;

import java.util.Scanner;

public class Adder {
    private double[] inputtedNumbers = new double[5];

    public double[] getInputtedNumbers() {
        return inputtedNumbers;
    }

    public void setInputtedNumbers(double[] inputtedNumbers) {
        if (inputtedNumbers.length == 5)
            this.inputtedNumbers = inputtedNumbers;
        else
            throw new IllegalArgumentException("Must be five doubles in array");
    }

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            inputtedNumbers[i] = scanner.nextDouble();
        }
    }

    public double printSum() {
        double sum = 0;
        for (double d : inputtedNumbers)
            sum += d;

        System.out.println("The total is " + sum + ".");

        return sum;
    }
}
