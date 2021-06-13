/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package ex35;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class WinnerPicker {
    private final List<String> contestants = new ArrayList<>();

    public void addContestant(String contestant) {
        contestants.add(contestant);
    }

    public String pickContestant() {
        SecureRandom sr = new SecureRandom();
        int index = sr.nextInt(getNumberOfContestants());

        return contestants.get(index);
    }

    // for testing
    int getNumberOfContestants() {
        return contestants.size();
    }
}
