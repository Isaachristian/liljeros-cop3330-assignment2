/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex26;

import static java.lang.System.exit;

public class CreditCard {
    private double balance;
    private double APR;

    public CreditCard(double balance, double APR)  {
        try {
            setBalance(balance);
            setAPR(APR);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            exit(-1);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAPR() {
        return APR;
    }

    public double getDailyAPRasDecimal() {
        return (APR / 100.0) / 365.0;
    }

    public void setAPR(double APR) {
        if (APR > 0)
            this.APR = APR;
        else
            throw new IllegalArgumentException("APR must be actual percentage");
    }
}
