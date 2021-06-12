/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex29;

public class MoneyCalculator {
    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    // checks if input is valid
    public boolean isValidInput() {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return !(Double.parseDouble(input) <= 0);
    }

    public int calculateYears() throws Exception {
        if (!isValidInput())
            throw new Exception();

        return (int) Math.ceil(72.0 / Double.parseDouble(input));
    }
}
