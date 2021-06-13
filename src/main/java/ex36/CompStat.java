/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex36;

import java.util.ArrayList;
import java.util.List;

public class CompStat {
    private final List<Double> numbers = new ArrayList<>();

    // adds positive numbers to arraylist
    public void addNumber(double number) throws IllegalArgumentException {
        if (number >= 0.0)
            numbers.add(number);
        else
            throw new IllegalArgumentException("Number must be positive");
    }

    public double average() {
        double total = 0;

        for (double d : numbers)
            total += d;

        return total / ((float) numbers.size());
    }

    public double max() {
        double max = 0;

        for(double d : numbers) {
            if (d > max) max = d;
        }

        return max;
    }

    public double min() {
        double min = Double.MAX_VALUE;

        for (double d : numbers) {
            if (d < min) min = d;
        }

        return min;
    }

    // calculates standard deviation
    public double std() {
        double mean = average();
        double[] subMeanAndSquare = new double[numbers.size()];

        // calculate deviation from mean
        int i = 0;
        for (double d : numbers) {
            subMeanAndSquare[i++] = Math.pow(d - mean, 2);
        }

        double total = 0.0;
        for(double d : subMeanAndSquare)
            total += d;


        // return square root of average squared differences
        return Math.sqrt(total / subMeanAndSquare.length);
    }

    @Override // Modify default to string method
    public String toString() {
        if (numbers.size() > 0) {
            StringBuilder string = new StringBuilder();
            string.append(numbers.get(0));

            for (int i = 1; i < numbers.size(); i++)
                string.append(", ").append(numbers.get(i));

            return string.toString();
        } else {
            return "";
        }
    }

}
