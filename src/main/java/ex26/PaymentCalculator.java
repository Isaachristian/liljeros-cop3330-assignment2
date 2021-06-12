/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex26;

public class PaymentCalculator {

    public static int calculateMonthsUntilPayedOff(CreditCard card, double monthlyPayment) {
        // n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double months = -(1.0 / 30.0)
                * Math.log(1.0 + (card.getBalance() / monthlyPayment) * (1.0 - Math.pow(1.0 + card.getDailyAPRasDecimal(), 30.0)))
                / Math.log(1.0 + card.getDailyAPRasDecimal());

        return (int) Math.ceil(months);
    }

}
