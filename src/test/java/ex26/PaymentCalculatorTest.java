/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentCalculatorTest {

    @Test
    public void creditCard1() {
        CreditCard card1 = new CreditCard(5000, 12);
        int actual = PaymentCalculator.calculateMonthsUntilPayedOff(card1, 100);

        assertEquals(70,  actual);
    }

    @Test
    public void creditCard2() {
        CreditCard card1 = new CreditCard(5000, 23.5);
        int actual = PaymentCalculator.calculateMonthsUntilPayedOff(card1, 500);

        assertEquals(12,  actual);
    }
}